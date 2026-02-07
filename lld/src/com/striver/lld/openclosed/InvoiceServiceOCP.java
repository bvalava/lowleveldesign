package com.striver.lld.openclosed;

public class InvoiceServiceOCP {

    public void calculate() {

        TaxCalculatorOCP calculator = new IndianTax();
        calculator.amountAfterTax(100);
    }
}
