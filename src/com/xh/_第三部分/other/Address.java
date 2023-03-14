package com.xh._第三部分.other;

public class Address {
    String city;
    String street;
    String postcode;

    //有参构造
    public Address(String postcode) {
        this.postcode = postcode;
    }

    //无参构造，默认自动生成
    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
