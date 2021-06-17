package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    Address address;

    public DeliveryManager(Address address) {
        this.address = address;
    }

    public DeliverCenter allocate(){
        if (getProvince(address.getToAddress()).equals(getProvince(address.getFromAddress()))
                && getCity(address.getToAddress()).equals(getCity(address.getFromAddress()))){
            return DeliverCenter.LOCAL;
        }
        if (getProvince(address.getToAddress()).equals(getProvince(address.getFromAddress()))) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

    private String getCity(String address) {
        return address.substring(address.indexOf("省") + 1, address.indexOf("市"));
    }

    private String getProvince(String address) {
        return address.substring(0, address.indexOf("省"));
    }
}
