package com.exercises.javase.exercise;

import java.text.DecimalFormat;

public class ExcDouble {

    public static void main(String[] args) {
        Double d1 = 25652.22568;

        DecimalFormat df = new DecimalFormat("#.00");
        String dd = df.format(d1);
        System.out.println("Str:: "+ dd);
        Double dn = Double.parseDouble("253.3336");
        System.out.println("Str::parse "+ dn);

        Double valD = (Double)(Math.round(2653305.258259 * 100d) / 100d);
        System.out.println(valD);

        Long lnum = 4L;

        System.out.println(lnum);

        System.out.println(":::::::::::::::::::::::::::");
        String valIntNeg = "-60";
        Integer valInt = Integer.parseInt(valIntNeg);
        System.out.println(valInt);

        Integer valIntMat = Math.abs(-6);
        System.out.println(valIntMat);

        Integer valMen = -25 * -1;
        System.out.println(valMen);

        Boolean resBool = validIntegerObject(4,3);
        System.out.println(resBool);

    }

    public static Boolean validIntegerObject(Object objParamBb, Object objParamProccess){
        Integer valPos = Math.abs((Integer)objParamProccess);
        Boolean resultBool;
        if (valPos == 0){
            resultBool = true;
        }else {
            if (valPos <= ((Integer) objParamBb)){
                resultBool = true;
            }else {
                resultBool = false;
            }
        }
        return resultBool;
    }

}
