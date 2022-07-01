package com.exercises.javase.exercise;

import java.math.BigDecimal;
import java.nio.DoubleBuffer;

public class EjerciciosStringNum {

    public static void main(String[] args) {
        String sDou = "125.25";
        Double res = 152.10 + Double.parseDouble(sDou);
        System.out.println(res);

        System.out.println(":::::::::::::::");
        String resultSt;

        resultSt = "1#";

        resultSt = resultSt.concat("2#");

        System.out.println(resultSt);

        System.out.println(":::::::::::::");
        String montoSt = "156000";

        String part1 = montoSt.substring(0,montoSt.length()-4);
        String part2 = montoSt.substring(montoSt.length()-4);
        Double douMon = Double.parseDouble(part1.concat(".").concat(part2));

        System.out.println(douMon-10.0000);

        System.out.println(":::::::::::DDDD:::::::");
        BigDecimal opeDec = new BigDecimal(2500010);
        Integer intDec = opeDec.intValue();
        opeDec = new BigDecimal(2500010.252);
        Double intDobl = opeDec.doubleValue();
        System.out.println("BigtoDouble::"+intDobl);

        String strDrm = String.valueOf(intDec);
//        String valStrDbl =  "INT-VALUE::"+ope.intValue();
//        System.out.println("INT-VALUE::"+ope);
        System.out.println("INT-VALUE STR::"+strDrm);
//        Integer  valInt = Integer.parseInt(valStrDbl);
//        Integer integ = valInt - 452244000;
//        System.out.println(valInt);

        System.out.println("::::::::::::::::::=======:::::::::::::::");
        String nr = "";
        if (nr.isEmpty()){
            System.out.println("empty");
        }

        System.out.println("::::::::::::::::INTEGER:::::::::::::::");
        Object numObj = 12;

        Double d1 = 1000.25;
        Double d2 = 1050.25;
        Double resDo = d2 - d1;

        if (d1.doubleValue() == d2.doubleValue()){
            System.out.println("IGUAL DOUBLE");
        }

        String nRes = "";
        String nRes1 = "";

        if (nRes.isEmpty()){
            if (nRes.equalsIgnoreCase(nRes1)){
                System.out.println("RESPOSE>>>");
            }
        }

    }
}
