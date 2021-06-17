package com.tw.academy.basic.$7_long_method;

public class Amount {
    private double totalSalesTax;
    private double totalAmount;

    public Amount(double totalSalesTax, double totalAmount) {
        this.totalSalesTax = totalSalesTax;
        this.totalAmount = totalAmount;
    }

    public double getTotalSalesTax() {
        return totalSalesTax;
    }

    public void setTotalSalesTax(double totalSalesTax) {
        this.totalSalesTax = totalSalesTax;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
