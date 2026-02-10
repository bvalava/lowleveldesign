package com.striver.lld.abstractfactory;

public class USInvoice implements Invoice{

    public void generateInvoice() {
        System.out.println("Generating Invoice as per US norms.");
    }
}
