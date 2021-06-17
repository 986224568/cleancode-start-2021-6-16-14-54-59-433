package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class Address {
    private final String fromAddress;
    private final String toAddress;

    public Address(String fromAddress, String toAddress) {
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }
}
