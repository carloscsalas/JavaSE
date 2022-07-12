package com.exercises.javase.exercise;

import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class EjercicioList {

    public static void main(String[] args) {

        List<ForeignAccount> listOriginAccount = null;
        List<ForeignAccount> foreignAccountListNew = new ArrayList<>();

        ForeignAccount foreignAcc = new ForeignAccount();
        ForeignAccount foreignAcc2 = new ForeignAccount();
        foreignAcc2.setCurrency("PEN");
        foreignAcc2.setAddress("Rimac");
        foreignAcc2.setName("gino");
        foreignAcc = foreignAcc2;
        System.out.println(foreignAcc);




    }

    public static List<ForeignAccount> getListForeignAccount(){
        List<ForeignAccount> foreignAccountList = new ArrayList<>();
        ForeignAccount foreignAccount = new ForeignAccount();
        foreignAccount.setId(100);
        foreignAccount.setName("BCR");
        foreignAccount.setAddress("Lima #23");
        foreignAccount.setCurrency("PEN");
        List<MovementStatement> listMovem = new ArrayList<>();
        listMovem.add(new MovementStatement("1","1001",201.40));
        listMovem.add(new MovementStatement("2","1002",453.50));
        listMovem.add(new MovementStatement("4","1004",1123.40));
        foreignAccount.setListMovements(listMovem);
        ForeignAccount foreignAccount2 = new ForeignAccount();
        foreignAccount2.setId(101);
        foreignAccount2.setName("BANK NY");
        foreignAccount2.setAddress("New York #23");
        foreignAccount2.setCurrency("USD");
        List<MovementStatement> listMovem2 = new ArrayList<>();
        listMovem2.add(new MovementStatement("10","2004",505.34));
        listMovem2.add(new MovementStatement("11","2005",99.02));
        listMovem2.add(new MovementStatement("12","2006",1123.09));
        foreignAccount2.setListMovements(listMovem2);
        ForeignAccount foreignAccount3 = new ForeignAccount();
        foreignAccount3.setId(100);
        foreignAccount3.setName("BCR");
        foreignAccount3.setAddress("Lima #23");
        foreignAccount3.setCurrency("PEN");
        List<MovementStatement> listMovem3 = new ArrayList<>();
        listMovem3.add(new MovementStatement("3","1003",505.34));
        foreignAccount3.setListMovements(listMovem3);

        foreignAccountList.add(foreignAccount);
        foreignAccountList.add(foreignAccount2);
        foreignAccountList.add(foreignAccount3);
        return foreignAccountList;
    }
}

class ForeignAccount{

    private Integer id;
    private String name;
    private String montostr;
    private String currency;
    private String address;
    private String type;

    private List<MovementStatement> listMovements;

    public List<MovementStatement> getListMovements() {
        return listMovements;
    }

    public void setListMovements(List<MovementStatement> listMovements) {
        this.listMovements = listMovements;
    }

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
        return "ForeignAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", montostr='" + montostr + '\'' +
                ", currency='" + currency + '\'' +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", listMovements=" + listMovements +
                '}';
    }
}


class MovementStatement{
    private String codigo;
    private String numero;
    private Double monto;

    public MovementStatement(String codigo, String numero, Double monto) {
        this.codigo = codigo;
        this.numero = numero;
        this.monto = monto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Movement{" +
                "codigo='" + codigo + '\'' +
                ", numero='" + numero + '\'' +
                ", monto=" + monto +
                '}';
    }


}