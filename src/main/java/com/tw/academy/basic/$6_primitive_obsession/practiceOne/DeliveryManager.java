package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    Address address;

    public DeliveryManager(Address address) {
        this.address = address;
    }

    public DeliverCenter allocate(){
        if (address.isSameFromProvinceToProvince() && address.isSameFromCityToCity()) {
            return DeliverCenter.LOCAL;
        }
        if (address.isSameFromProvinceToProvince()) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }
}
