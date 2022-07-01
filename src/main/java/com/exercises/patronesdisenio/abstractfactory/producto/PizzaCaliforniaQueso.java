package com.exercises.patronesdisenio.abstractfactory.producto;

import com.exercises.patronesdisenio.abstractfactory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {

    public PizzaCaliforniaQueso() {
        super();
        nombre= "Pizza California Queso";
        masa = "Masa a la piedra delgada";
        salsa= "Salsa de tomate con rucula";
        ingredientes.add("Extra queso Mozzarella");
        ingredientes.add("Cebolla");
        ingredientes.add("Queso azul");
    }



    @Override
    public void cocinar() {
        System.out.println("Cocinando por 26 min. a 130°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños triangulos");
    }
}
