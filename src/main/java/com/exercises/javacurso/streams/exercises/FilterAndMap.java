package com.exercises.javacurso.streams.exercises;

import com.exercises.javase.entity.Customer;
import com.sun.javafx.css.parser.Css2Bin;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class FilterAndMap {

    public static void main(String[] args) {

        List<CustomerFilter> customers = new ArrayList<>();
        customers.add(new CustomerFilter(10,"Gino","Huacho"));
        customers.add(new CustomerFilter(20,"Jaime","Pinos"));
        customers.add(new CustomerFilter(30,"Fresia","Hualmay"));
        customers.add(new CustomerFilter(40,"Luis","Huacho"));
        List<CustomerFilter> customersTwo = new ArrayList<>();
        customersTwo.add(new CustomerFilter(5,"Lucas","Huacho"));
        customersTwo.add(new CustomerFilter(null,"Andres","Pinos"));
        customersTwo.add(new CustomerFilter(4,"Ana","Hualmay"));
        customersTwo.add(new CustomerFilter(null,"Claudia","Huacho"));

//        List<CustomerFilter> listNewCus = customersTwo;

        List<CustomerFilter> lisCustomerEmpty = new ArrayList<>();
//        customersTwo.forEach(customerFil -> lisCustomerEmpty.add(customerFil));

        for (CustomerFilter cus: customers){
//            customersTwo.stream().filter(cusTwo -> !cusTwo.getCodigo().equals(cus.getCodigo()))
////                    .peek(System.out::println)
//                    .forEach(customerFilter -> lisCustomerEmpty.add(customerFilter));
            if (customersTwo.stream().noneMatch(custom -> custom.getCodigo() == cus.getCodigo())){
                customersTwo.add(cus);
            }

            System.out.println(":::::::::FOR:::::::END:::::");
        }
        System.out.println("...........................");
        customersTwo.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");
        List<CustomerFilter> customersThree = new ArrayList<>();
        customersThree.add(new CustomerFilter(5,"Lucas","Huacho"));
        customersThree.add(new CustomerFilter(null,"Andres","Pinos"));
        customersThree.add(new CustomerFilter(4,"Ana","Hualmay"));
        customersThree.add(new CustomerFilter(null,"Claudia","Huacho"));

        List<CustomerFilter> customersFilter = customersThree.stream().filter( cus -> Objects.nonNull(cus.getCodigo()))
                .collect(Collectors.toList());
        customersFilter.forEach(System.out::println);


    }
}

class CustomerFilter{
    private Integer codigo;
    private String name;
    private String city;

    public CustomerFilter(Integer codigo, String name, String city) {
        this.codigo = codigo;
        this.name = name;
        this.city = city;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomerFilter.class.getSimpleName() + "[", "]")
                .add("codigo=" + codigo)
                .add("name='" + name + "'")
                .add("city='" + city + "'")
                .toString();
    }
}
