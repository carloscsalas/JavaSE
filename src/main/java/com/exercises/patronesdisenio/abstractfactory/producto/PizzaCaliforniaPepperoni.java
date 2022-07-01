package com.exercises.patronesdisenio.abstractfactory.producto;

import com.exercises.patronesdisenio.abstractfactory.PizzaProducto;

public class PizzaCaliforniaPepperoni extends PizzaProducto {

    public PizzaCaliforniaPepperoni() {
        super();
        nombre= "Pizza California Peperoni";
        masa = "Masa a la piedra gruesa";
        salsa= "Salsa de tomate light";
        ingredientes.add("Pepperoni");
        ingredientes.add("Extra queso mozzarella");
        ingredientes.add("Aceitunas");
    }



    @Override
    public void cocinar() {
        System.out.println("Cocinando por 24 min. a 120°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños rectangulos");
    }
}
