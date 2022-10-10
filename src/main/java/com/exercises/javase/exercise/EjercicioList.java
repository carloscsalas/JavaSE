package com.exercises.javase.exercise;

import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
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

        List<ForeignAccount> newListTest = getListForeignAccount();
        System.out.println("===============================");
        System.out.println(newListTest.size());
        System.out.println(newListTest.get(2));

        System.out.println(":::::::::::::::::::::::::::::::::::::::");
        for (ForeignAccount account: getListForeignAccount()){
            if (Objects.nonNull(account.getCurrency()) &&
                    (account.getCurrency().equalsIgnoreCase("PEN") || account.getCurrency().equalsIgnoreCase("USD"))){
                System.out.println("OKKKKK!");
            }
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::");
        List<String> listStr = new ArrayList<>();
        listStr.add("5");
        listStr.add("2");
        listStr.add(null);
        listStr.add("3");
        listStr.add("9");
        listStr.add("1");
        for (String st: listStr){
            System.out.println(st);
        }
        String numStr = listStr.get(listStr.size()-1);
        System.out.println(numStr);

        System.out.println("::::::::::::::::::::::::::::::");
        String strn1 = "FFRTSSSA01.txt";
        strn1 = strn1.replace(".","/");
        String[] arrayStr = strn1.split("/");
        System.out.println(arrayStr[0]);
        String nnn = "GEEEES01".substring("GEEEES01".length()-2);
        System.out.println(nnn);
        Integer n = Integer.parseInt(nnn);
        System.out.println(n);
        System.out.println(":::::::::::::::::::::::::");
        List<Integer> listInt = new ArrayList<>();
        listInt.add(2);
        listInt.add(1);
        listInt.add(4);
        listInt.add(5);
        listInt.add(7);
        listInt.add(6);
        listInt.forEach(System.out::println);

        Integer nu2 = listInt.stream().max(Integer::compareTo).get();
        System.out.println("::n2:: "+nu2);
        System.out.println("...............");
        listInt.sort(Comparator.comparing(Integer::intValue));
        listInt.forEach(System.out::println);

        System.out.println("::::::::::::::::::LENGTH::::::::::::::::::::");
        System.out.println(listInt.size());

        String valr = processValidSequence(listInt);

        String str = "-2";
        System.out.println(str.substring(1));

        System.out.println(":::::::::::::::::::::::::::::::::::");

        for (MovementStatement mov: getListMovementsOne()){
            if (getListMovementsTwo().stream().anyMatch(mv -> mv.getCodigo().equals(mov.getCodigo()))){
                System.out.println(":::EXISTS:::TWO::: "+mov.getCodigo());
                continue;
            }
            System.out.println(":::ONE::: "+mov.getCodigo());
        }


    }

    private static String processValidSequence(List<Integer> listInteger){
        String strVal="";
        Integer index=0;
        for (Integer sec: listInteger){
            if (index <= listInteger.size()-2){
                Integer intn = listInteger.get(index+1);

                while(!sec.equals(intn-1)){
                    strVal = strVal.concat("-").concat(String.valueOf(intn-1));
                    intn--;
                }
            }
            index++;
        }
        return strVal;
    }

    public static List<ForeignAccount> getListForeignAccount(){
        List<ForeignAccount> foreignAccountList = new ArrayList<>();
        ForeignAccount foreignAccount = new ForeignAccount();
        foreignAccount.setId(100);
        foreignAccount.setName("BCR");
        foreignAccount.setAddress("Lima #23");
        foreignAccount.setCurrency("PEN");
        List<MovementStatement> listMovem = new ArrayList<>();
        listMovem.add(new MovementStatement(1,"1001",201.40));
        listMovem.add(new MovementStatement(2,"1002",453.50));
        listMovem.add(new MovementStatement(4,"1004",1123.40));
        foreignAccount.setListMovements(listMovem);
        ForeignAccount foreignAccount2 = new ForeignAccount();
        foreignAccount2.setId(101);
        foreignAccount2.setName("BANK NY");
        foreignAccount2.setAddress("New York #23");
        foreignAccount2.setCurrency(null);
        List<MovementStatement> listMovem2 = new ArrayList<>();
        listMovem2.add(new MovementStatement(10,"2004",505.34));
        listMovem2.add(new MovementStatement(11,"2005",99.02));
        listMovem2.add(new MovementStatement(12,"2006",1123.09));
        foreignAccount2.setListMovements(listMovem2);
        ForeignAccount foreignAccount3 = new ForeignAccount();
        foreignAccount3.setId(100);
        foreignAccount3.setName("BCR");
        foreignAccount3.setAddress("Lima #23");
        foreignAccount3.setCurrency("USD");
        List<MovementStatement> listMovem3 = new ArrayList<>();
        listMovem3.add(new MovementStatement(3,"1003",505.34));
        foreignAccount3.setListMovements(listMovem3);

        foreignAccountList.add(foreignAccount);
        foreignAccountList.add(foreignAccount2);
        foreignAccountList.add(foreignAccount3);
        return foreignAccountList;
    }

    public static List<MovementStatement> getListMovementsOne(){
        List<MovementStatement> listMovementOne = new ArrayList<>();
        listMovementOne.add(new MovementStatement(1,"101",12.20));
        listMovementOne.add(new MovementStatement(2,"102",34.20));
        listMovementOne.add(new MovementStatement(3,"103",222.20));
        listMovementOne.add(new MovementStatement(4,"104",70.20));
        listMovementOne.add(new MovementStatement(5,"105",96.20));
        return listMovementOne;
    }

    public static List<MovementStatement> getListMovementsTwo(){
        List<MovementStatement> listMovementTwo = new ArrayList<>();
        listMovementTwo.add(new MovementStatement(34,"223",12.20));
        listMovementTwo.add(new MovementStatement(33,"112",34.20));
        listMovementTwo.add(new MovementStatement(2,"221",222.20));
        listMovementTwo.add(new MovementStatement(5,"421",70.20));
        listMovementTwo.add(new MovementStatement(21,"123",96.20));
        return listMovementTwo;
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
    private Integer codigo;
    private String numero;
    private Double monto;

    public MovementStatement(Integer codigo, String numero, Double monto) {
        this.codigo = codigo;
        this.numero = numero;
        this.monto = monto;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
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
        return new StringJoiner(", ", MovementStatement.class.getSimpleName() + "[", "]")
                .add("codigo=" + codigo)
                .add("numero='" + numero + "'")
                .add("monto=" + monto)
                .toString();
    }
}