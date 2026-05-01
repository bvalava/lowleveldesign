package com.striver.lld.atmmachine.controller;

import com.striver.lld.atmmachine.domain.CashDrawer;
import com.striver.lld.atmmachine.service.ATMService;

public class ATMController {

    private ATMService atmService;

    public ATMController(ATMService atmService) {
        this.atmService = atmService;
    }

    public void takeOffline(String atmId) {
        atmService.takeOffline(atmId);
    }

    public void bringOnline(String atmId) {
        atmService.bringOnline(atmId);
    }

    public CashDrawer auditCash(String atmId) {
        return atmService.auditCash(atmId);
    }
}
