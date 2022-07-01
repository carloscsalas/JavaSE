package com.exercises.javase.exercise;

import java.util.ArrayList;
import java.util.List;

public class EjerciciosTest {

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
