package com.exercises.patronesdisenio.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaProducto {
    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public PizzaProducto() {
        this.ingredientes = new ArrayList<>();
    }

    public void preparar(){
        System.out.println("Preparando "+nombre);
        System.out.println("Seleccionando la masa "+masa);
        System.out.println("Agregando salsa "+masa);
        System.out.println("Agregando ingredientes: ");
        this.ingredientes.forEach(System.out::println);
    }

    /*se pone como abstracto para que cada uno que here de PizzaProducto implemente su forma de cocinar*/
    public abstract void cocinar();
    public abstract void cortar();

    public void empaquetar(){
        System.out.println("Poniendo la pizza en una caja de empaque...");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PizzaProducto{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", masa='").append(masa).append('\'');
        sb.append(", salsa='").append(salsa).append('\'');
        sb.append(", ingredientes=").append(ingredientes);
        sb.append('}');
        return sb.toString();
    }

    public String getNombre() {
        return nombre;
    }
}
