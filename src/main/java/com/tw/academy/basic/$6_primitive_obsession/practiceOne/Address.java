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

    public String getFromCity() {
        return getCity(getFromAddress());
    }

    public String getFromProvince() {
        return getProvince(getFromAddress());
    }

    public String getToAddress() {
        return toAddress;
    }

    public String getToCity() {
        return getCity(getToAddress());
    }

    public String getToProvince() {
        return getProvince(getToAddress());
    }

    private String getCity(String address) {
        return address.substring(address.indexOf("省") + 1, address.indexOf("市"));
    }

    private String getProvince(String address) {
        return address.substring(0, address.indexOf("省"));
    }

    public boolean isSameFromCityToCity() {
        return this.getToCity().equals(this.getFromCity());
    }

    public boolean isSameFromProvinceToProvince() {
        return this.getToProvince().equals(this.getFromProvince());
    }
}
