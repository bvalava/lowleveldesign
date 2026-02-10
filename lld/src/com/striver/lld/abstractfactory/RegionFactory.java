package com.striver.lld.abstractfactory;

public interface RegionFactory {

    PaymentGateway createPaymentGateway(String gatewayType);
    Invoice createInvoice();
}
