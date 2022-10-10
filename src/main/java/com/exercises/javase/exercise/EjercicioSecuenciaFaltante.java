package com.exercises.javase.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class EjercicioSecuenciaFaltante {


    public static void main(String[] args) {
        List<Venta> listInt = new ArrayList<>();
        listInt.add(new Venta("Lunes",150.00,200.00, 1));
//        listInt.add(new Venta("Martes",200.00,270.00, 2));
        listInt.add(new Venta("Miercoles",270.00,350.00, 3));
//        listInt.add(new Venta("Jueves",350.00,530.00, 4));
        listInt.add(new Venta("Viernes",530.00,650.00, 5));
        listInt.add(new Venta("Sabado",650.00,750.00, 6));

//        Integer wInt = listInt.get(0);
//        Integer incVal=0;
//       while(wInt < listInt.get(0+1)-1){
//           System.out.println("2");
//           wInt = listInt.get(incVal+1);
//       }
    List<Integer> listIntPag = new ArrayList<>();
    Integer index;
        Integer ori = 0;
        for (Venta ven : listInt){
//            Integer presentInt = ven.getNum_venta();
            Integer cont = 1;

            if (listInt.size() != ori+1 ){
                Integer result = listInt.get(ori+1).getNum_venta()-listInt.get(ori).getNum_venta();

                while (1!= result){
                    listIntPag.add(listInt.get(ori).getNum_venta()+cont);
//                presentInt--;
                    cont++;
                    result--;
//                ori++;
                }

            }
            ori++;

        }
        listIntPag.forEach(System.out::println);

        System.out.println("//////////////////////////////////////////////////////");
        List<String> statementMiss = new ArrayList<>();
        Integer n1 = 18;
        Integer n2 = 20;

        while (((n2-1)-n1) >0){
            statementMiss.add(String.valueOf(n2-1));
            n2--;
        }



    }
}

class Venta{
    private String product;
    private Double amountOpen;
    private Double amountClose;
    private Integer num_venta;

    public Venta(String product, Double amountOpen, Double amountClose, Integer num_venta) {
        this.product = product;
        this.amountOpen = amountOpen;
        this.amountClose = amountClose;
        this.num_venta = num_venta;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Double getAmountOpen() {
        return amountOpen;
    }

    public void setAmountOpen(Double amountOpen) {
        this.amountOpen = amountOpen;
    }

    public Double getAmountClose() {
        return amountClose;
    }

    public void setAmountClose(Double amountClose) {
        this.amountClose = amountClose;
    }

    public Integer getNum_venta() {
        return num_venta;
    }

    public void setNum_venta(Integer num_venta) {
        this.num_venta = num_venta;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Venta.class.getSimpleName() + "[", "]")
                .add("product='" + product + "'")
                .add("amountOpen=" + amountOpen)
                .add("amountClose=" + amountClose)
                .add("num_venta=" + num_venta)
                .toString();
    }
}
