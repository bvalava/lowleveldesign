package com.striver.lld.openclosed;

public class IndianTax implements TaxCalculatorOCP{


    @Override
    public double amountAfterTax(double amount) {
        return (amount + 0.18 * amount);
    }
}
