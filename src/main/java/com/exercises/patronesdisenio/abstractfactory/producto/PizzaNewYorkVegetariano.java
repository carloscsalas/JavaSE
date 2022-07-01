package com.exercises.patronesdisenio.abstractfactory.producto;

import com.exercises.patronesdisenio.abstractfactory.PizzaProducto;

public class PizzaNewYorkVegetariano extends PizzaProducto {

    public PizzaNewYorkVegetariano(){
        super();
        nombre = "Pizza vegetariana New York";
        masa = "Masa integral vegana";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso vegano");
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Berenjenas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 min. a 150°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas");
    }
}
