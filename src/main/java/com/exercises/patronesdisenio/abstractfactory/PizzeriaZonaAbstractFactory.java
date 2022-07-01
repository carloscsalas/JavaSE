package com.exercises.patronesdisenio.abstractfactory;

/*clase abstracto ya que cada zona va crear sus pizzas y propias familia de producto*/

public abstract class PizzeriaZonaAbstractFactory {

    public PizzaProducto ordenarPizza(String tipo){

        PizzaProducto pizza = crearPizza(tipo);
        System.out.println("Fabricando la pizza: "+ pizza.getNombre()+ "---");
        pizza.preparar();
        pizza.cocinar();
        pizza.empaquetar();
        return pizza;
    }

    /*aca en ves de public se le deja como default*/
    abstract PizzaProducto crearPizza(String tipo);
}
