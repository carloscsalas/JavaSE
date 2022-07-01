package com.exercises.javacurso.streams.exercises;

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