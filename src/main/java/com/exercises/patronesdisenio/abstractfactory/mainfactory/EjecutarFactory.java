package com.exercises.patronesdisenio.abstractfactory.mainfactory;

import com.exercises.patronesdisenio.abstractfactory.PizzaProducto;
import com.exercises.patronesdisenio.abstractfactory.PizzeriaCaliforniaFactory;
import com.exercises.patronesdisenio.abstractfactory.PizzeriaNewYorkFactory;
import com.exercises.patronesdisenio.abstractfactory.PizzeriaZonaAbstractFactory;

public class EjecutarFactory {

    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory calif = new PizzeriaCaliforniaFactory();

        //Aca solo se ordena porque se crea en la fabrica
        PizzaProducto pizzaProducto = calif.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza "+pizzaProducto.getNombre());

        pizzaProducto = ny.ordenarPizza("pepperoni");
        System.out.println("Gino ordena la pizza "+pizzaProducto.getNombre());

        pizzaProducto = calif.ordenarPizza("vegetariana");
        System.out.println("James ordena la pizza "+pizzaProducto.getNombre());

        pizzaProducto = ny.ordenarPizza("vegetariana");
        System.out.println("Ana ordena la pizza "+pizzaProducto.getNombre());

        pizzaProducto = calif.ordenarPizza("pepperoni");
        System.out.println("Luz ordena la pizza "+pizzaProducto.getNombre());

        System.out.println("pizza = "+pizzaProducto);
    }
}
