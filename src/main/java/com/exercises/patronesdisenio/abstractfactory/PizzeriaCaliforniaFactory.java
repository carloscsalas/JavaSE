package com.exercises.patronesdisenio.abstractfactory;

import com.exercises.patronesdisenio.abstractfactory.producto.PizzaCaliforniaPepperoni;
import com.exercises.patronesdisenio.abstractfactory.producto.PizzaCaliforniaQueso;
import com.exercises.patronesdisenio.abstractfactory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "queso":
                producto = new PizzaCaliforniaQueso();
                break;
            case "pepperoni":
                producto = new PizzaCaliforniaPepperoni();
                break;
            case "vegetariana":
                producto = new PizzaCaliforniaVegetariana();
                break;
        }

        return producto;
    }

}
