package com.exercises.basedatos.domain;

import java.util.StringJoiner;

public class Producto {

    private Integer pro_codigo;
    private String pro_nombre;
    private Double precio;

    public Integer getPro_codigo() {
        return pro_codigo;
    }

    public void setPro_codigo(Integer pro_codigo) {
        this.pro_codigo = pro_codigo;
    }

    public String getPro_nombre() {
        return pro_nombre;
    }

    public void setPro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Producto.class.getSimpleName() + "[", "]")
                .add("pro_codigo=" + pro_codigo)
                .add("pro_nombre='" + pro_nombre + "'")
                .add("precio=" + precio)
                .toString();
    }
}
