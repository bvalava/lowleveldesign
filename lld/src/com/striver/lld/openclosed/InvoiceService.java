package com.striver.lld.openclosed;

public class InvoiceService {

    public void calculate() {

        TaxCalculator calculator = new TaxCalculator();
        calculator.amountAfterTax(100);
    }
}
