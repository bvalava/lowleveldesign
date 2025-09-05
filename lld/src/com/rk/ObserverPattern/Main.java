package com.rk.ObserverPattern;

import com.rk.ObserverPattern.obervable.IphoneObservableImpl;
import com.rk.ObserverPattern.obervable.StocksObservable;
import com.rk.ObserverPattern.observer.EmailAlertObserverImpl;
import com.rk.ObserverPattern.observer.MobileAlertObserverImpl;
import com.rk.ObserverPattern.observer.NotificationAlertObserver;

public class Main {

    public static void main(String[] args) {

        StocksObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz1@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz2@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("xyz1_username", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}
