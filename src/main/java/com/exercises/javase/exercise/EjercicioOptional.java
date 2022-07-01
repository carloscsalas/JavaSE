package com.exercises.javase.exercise;

import java.util.List;

public class EjercicioOptional {

    public static void main(String[] args) {

        String parrafo = ":1:Warren Q. Darrow, 8272 4th Street, New York IL 76091\n" +
                ":10:1165965 had a transaction of 51,43 on 01/22/2011\n" +
                ":30:Ann V. Gates, 9247 Infinite Loop Drive, Hollywood NE 37612\n" +
                ":30:Erica I. Jobs, 8875 Farnam Street, Aurora IL 36314";

        String[] strings = parrafo.split("\n");

        for (String s : strings){
            System.out.println(s+"555555");
        }
        String num = "123456789";
        System.out.println(num.substring(1,num.length()-1));



    }


}
