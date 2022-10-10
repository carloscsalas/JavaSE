package com.exercises.javacurso.streams.exercises;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class FindEndRecord {

    public static void main(String[] args) {

        List<Perro> perroList = new ArrayList<>();
        Perro perro1 = new Perro();
        perro1.setName("Rocky");
        Perro perro2 = new Perro();
        perro2.setName("Roko");
        Perro perro3 = new Perro();
        perro3.setName("Luke");
        perroList.add(perro1);
        perroList.add(perro2);
        perroList.add(perro3);

        System.out.println(perroList.stream().reduce((pri, seg) -> seg).get());

        System.out.println(":::::::::::::::::::");

        System.out.println("123456".substring(0,4));

        String evCad = "1";
        System.out.println("===size==");
        System.out.println(perroList.size());
        System.out.println("=///////////////////////====");
        BigDecimal bigDc = BigDecimal.ZERO;
        System.out.println(bigDc);
        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(3);
        listInt.add(5);
        String resStr="";
        for (Integer in : listInt){
            resStr=resStr.toString().concat("-").concat(in.toString());
        }
        System.out.println(resStr.substring(1));
    }
}

class Perro{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Perro.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }
}