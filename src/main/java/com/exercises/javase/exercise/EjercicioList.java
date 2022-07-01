package com.exercises.javase.exercise;

import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class EjercicioList {

    
}

class ForeignAccount{

    private Integer id;
    private String name;
    private String montostr;
    private String currency;
    private String address;
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMontostr() {
        return montostr;
    }

    public void setMontostr(String montostr) {
        this.montostr = montostr;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ForeignAccount.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("montostr='" + montostr + "'")
                .add("currency='" + currency + "'")
                .add("address='" + address + "'")
                .add("type='" + type + "'")
                .toString();
    }
}

class CustomerResult{
    private Integer id;
    private String statusEnd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatusEnd() {
        return statusEnd;
    }

    public void setStatusEnd(String statusEnd) {
        this.statusEnd = statusEnd;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomerResult.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("statusEnd='" + statusEnd + "'")
                .toString();
    }
}