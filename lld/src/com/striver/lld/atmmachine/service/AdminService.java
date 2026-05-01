package com.striver.lld.atmmachine.service;

import com.striver.lld.atmmachine.domain.AdminUser;
import com.striver.lld.atmmachine.domain.CashDrawer;
import com.striver.lld.atmmachine.domain.Denomination;
import com.striver.lld.atmmachine.repository.AdminUserRepository;
import com.striver.lld.atmmachine.repository.CashDrawerRepository;
import com.striver.lld.atmmachine.repository.TransactionRepository;

import java.util.Map;
import java.util.Optional;

public class AdminService {

    private AdminUserRepository adminUserRepository;
    private CashDrawerRepository cashDrawerRepository;
    private TransactionRepository transactionRepository; // kept for future audit logs

    public AdminService(AdminUserRepository adminUserRepository,
                        CashDrawerRepository cashDrawerRepository,
                        TransactionRepository transactionRepository) {
        this.adminUserRepository = adminUserRepository;
        this.cashDrawerRepository = cashDrawerRepository;
        this.transactionRepository = transactionRepository;
    }

    public boolean loginAdmin(String adminId, String pin) {
        // TODO: Hash the PIN and compare with stored hash
        Optional<AdminUser> adminOpt = adminUserRepository.findById(adminId);
        if (adminOpt.isPresent()) {
            AdminUser admin = adminOpt.get();
            return admin.isActive() && admin.getPinHash().equals(pin); // Simple comparison for demo
        }
        return false;
    }

    public void refillCash(String atmId, Map<Denomination, Integer> notes) {
        Optional<CashDrawer> drawerOpt = cashDrawerRepository.findByATMId(atmId);
        if (drawerOpt.isPresent()) {
            CashDrawer drawer = drawerOpt.get();
            for (Map.Entry<Denomination, Integer> entry : notes.entrySet()) {
                drawer.addNotes(entry.getKey(), entry.getValue());
            }
            cashDrawerRepository.save(drawer);
            System.out.println("[AdminService] Cash refilled for ATM: " + atmId);
        }
    }

    public CashDrawer auditCash(String atmId) {
        return cashDrawerRepository.findByATMId(atmId).orElse(null);
    }
}
