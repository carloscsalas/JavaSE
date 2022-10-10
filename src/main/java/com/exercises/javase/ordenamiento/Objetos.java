package com.exercises.javase.ordenamiento;

import com.exercises.javase.entity.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Objetos {
    public static void main(String[] args) {

        List<Customer> listCustomer = new ArrayList<>();
        Customer customer1= new Customer();
        customer1.setCodigo(1L);
        customer1.setNombre("15.2");
        LocalDate localDate1 = LocalDate.of(2022, 01 , 11);
        customer1.setFecha_nacimiento(localDate1);
        customer1.setSueldo(10.50);
        Customer customer2= new Customer();
        customer2.setCodigo(2L);
        customer2.setNombre("68.3");
        LocalDate localDate2 = LocalDate.of(2022, 01 , 01);
        customer2.setFecha_nacimiento(localDate2);
        customer2.setSueldo(25.50);
        Customer customer3= new Customer();
        customer3.setCodigo(3L);
        customer3.setNombre("1.2");
        LocalDate localDate3 = LocalDate.of(2022, 02 , 11);
        customer3.setFecha_nacimiento(localDate3);
        customer3.setSueldo(5.50);
        Customer customer4= new Customer();
        customer4.setCodigo(3L);
        customer4.setNombre("96.3");
        LocalDate localDate4 = LocalDate.of(2021, 11 , 11);
        customer4.setFecha_nacimiento(localDate4);
        customer4.setSueldo(9.50);
        listCustomer.add(customer1);
        listCustomer.add(customer2);
        listCustomer.add(customer3);
        listCustomer.add(customer4);

        for (Customer c: listCustomer ) {
            System.out.println(c.getNombre()+" "+c.getFecha_nacimiento()+" "+c.getSueldo());
        }

        System.out.println("=================ORDENAR POR SUELDO================");

        listCustomer.sort(Comparator.comparing(Customer::getSueldo));
        listCustomer.forEach(customer -> System.out.println(customer));
//        List<Customer> listCst = listCustomer.stream()
//                .collect(Collectors.toList());
//
//        for (Customer c : listCst) {
//            System.out.println(c);
//        }
        System.out.println("=================ORDENAR POR FECHA================");
        listCustomer.sort(Comparator.comparing(Customer::getFecha_nacimiento));
        listCustomer.forEach(customer -> System.out.println(customer));
    }
}
