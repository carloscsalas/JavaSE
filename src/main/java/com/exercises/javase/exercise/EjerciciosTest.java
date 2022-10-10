package com.exercises.javase.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EjerciciosTest {

    private String resultString;

    public static void main(String[] args) {
        Double dou = Double.parseDouble("2.00000");
        System.out.println(dou);

        Integer num = 123;
        System.out.println(num++);



        System.out.println("::::::::::::::::::::::::");

        System.out.println("123".substring(2));

        List<TestString> strings = new ArrayList<>();
        /*_:::::::::HASTA ACA::::::*/
//        TestString testString = strings.get(strings.size()-1);
//        testString.setData("Default");
//        strings.add(strings.size()-1, testString);
//        strings.get(strings.size()-1).setData("Default");
//        System.out.println("============");
////        strings.stream().forEach(System.out::println);
//        for (TestString testSt : strings){
//            System.out.println(testSt);
//        }

        if (strings.isEmpty()){
            System.out.println("empty");
        }

        System.out.println("::::::::::::::MAP:::::::::::::::::..");

        Map<String,Object> mapRes = new HashMap<>();
        mapRes.put("id",1);

        System.out.println(mapRes.get("id"));
        mapRes.put("id",0);
        System.out.println("--------------");
        System.out.println(mapRes.get("id"));

        String n1 = null;
        String n2 = null;
        String n11 = "a";
        String n22 = "a";

        if (n1 == n2){
            System.out.println("EQUAL NULL");
        }

        Object nn1 = 20.25;
        Object nn2 =20.25;

        if (nn1.equals(nn2)){
            System.out.println(":::EQUAL NNs");
        }

        Map<String, Boolean> mapBoolean = new HashMap<>();
        mapBoolean.put("uno",false);
        mapBoolean.put("two",false);
        System.out.println("mapBoolean:: "+mapBoolean);
        mapBoolean.put("uno",true);
        mapBoolean.put("two",true);
        System.out.println("mapBoolean:: "+mapBoolean);

        String strClear = "-}{5:{CHK:41DD980C597E}}$                                               ${1:F21MRMDUS33DXXX0076125198}{4:{177:2206172007}{451:0}}{1:F01BCONPEPLBXXX0076125198}{2:O9502107220617MRMDUS33DXXX36093790752206172007N}{3:{108:GUM4O0007PNQ}}{4:\n";
        String[] splitStr= strClear.split("1:");
        System.out.println("Split "+splitStr[0]);
        System.out.println("Split "+splitStr[1]);
        String headerStr = "${1:".concat(splitStr[1]);
        System.out.println(headerStr);
    }
}

class TestString{

    public TestString(String codigo, String data) {
        this.codigo = codigo;
        this.data = data;
    }

    private String codigo;
    private String data;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TestString{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", data='").append(data).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
