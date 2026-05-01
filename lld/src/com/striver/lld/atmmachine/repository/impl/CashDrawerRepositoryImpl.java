package com.striver.lld.atmmachine.repository.impl;

import com.striver.lld.atmmachine.domain.CashDrawer;
import com.striver.lld.atmmachine.domain.Denomination;
import com.striver.lld.atmmachine.repository.CashDrawerRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class CashDrawerRepositoryImpl implements CashDrawerRepository {

    private Map<String, CashDrawer> cashDrawerStore = new ConcurrentHashMap<>();

    @Override
    public CashDrawer save(CashDrawer cashDrawer) {
        cashDrawerStore.put(cashDrawer.getAtmId(), cashDrawer);
        return cashDrawer;
    }

    @Override
    public Optional<CashDrawer> findByATMId(String atmId) {
        return Optional.ofNullable(cashDrawerStore.get(atmId));
    }

    @Override
    public void updateCashInventory(String atmId, Map<Denomination, Integer> notes) {
        Optional<CashDrawer> drawerOpt = findByATMId(atmId);
        if (drawerOpt.isPresent()) {
            CashDrawer drawer = drawerOpt.get();
            drawer.setNotesByDenomination(new HashMap<>(notes));
        }
    }
}
