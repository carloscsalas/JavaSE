package com.exercises.patronesdisenio.abstractfactory;

import com.exercises.patronesdisenio.abstractfactory.producto.PizzaNewYorkItaliana;
import com.exercises.patronesdisenio.abstractfactory.producto.PizzaNewYorkPeperoni;
import com.exercises.patronesdisenio.abstractfactory.producto.PizzaNewYorkVegetariano;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{


    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "vegetariana":
                producto = new PizzaNewYorkVegetariano();
                break;
            case "pepperoni":
                producto = new PizzaNewYorkPeperoni();
                break;
            case "italiana":
                producto = new PizzaNewYorkItaliana();
                break;

        }
        return producto;
    }

}
