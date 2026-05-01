package com.striver.lld.atmmachine.controller;

import com.striver.lld.atmmachine.domain.CashDrawer;
import com.striver.lld.atmmachine.domain.Denomination;
import com.striver.lld.atmmachine.service.AdminService;

import java.util.Map;

public class AdminController {

    private AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    public boolean loginAdmin(String adminId, String pin) {
        return adminService.loginAdmin(adminId, pin);
    }

    public void refillCash(String atmId, Map<Denomination, Integer> notes) {
        adminService.refillCash(atmId, notes);
    }

    public CashDrawer auditCash(String atmId) {
        return adminService.auditCash(atmId);
    }
}
