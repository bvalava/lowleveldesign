package com.striver.lld.atmmachine.repository;

import com.striver.lld.atmmachine.domain.CashDrawer;
import com.striver.lld.atmmachine.domain.Denomination;

import java.util.Map;
import java.util.Optional;

public interface CashDrawerRepository {

    CashDrawer save(CashDrawer cashDrawer);
    Optional<CashDrawer> findByATMId(String atmId);
    void updateCashInventory(String atmId, Map<Denomination, Integer> notes);
}
