package com.rk.ObserverPattern.observer;

import com.rk.ObserverPattern.obervable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable stocksObservable) {

        this.userName = userName;
        this.observable = stocksObservable;
    }

    @Override
    public void update() {

        sendMsgToMobile(userName, "product is in stock");
    }

    private void sendMsgToMobile(String userName, String msg) {

        System.out.println("msg sent to:" + userName);
    }
}
