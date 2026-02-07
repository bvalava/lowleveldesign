package com.striver.lld.openclosed;

public class UsTax implements TaxCalculatorOCP{
    @Override
    public double amountAfterTax(double amount) {
        return (amount + 0.10 * amount);
    }
}
