package com.rk.ObserverPattern.observer;

import com.rk.ObserverPattern.obervable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable stocksObservable) {

        this.emailId = emailId;
        this.observable = stocksObservable;
    }

    @Override
    public void update() {

        sendEmail(emailId, "product is in stock");
    }

    private void sendEmail(String emailId, String msg) {

        System.out.println("mail sent to:" + emailId);
    }
}
