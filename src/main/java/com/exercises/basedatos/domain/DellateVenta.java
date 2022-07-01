package com.exercises.basedatos.domain;

import java.util.StringJoiner;

public class DellateVenta {

    private Integer cantidad;
    private Double costo;
    private Integer venta_codigo;
    private Integer pro_codigo;

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Integer getVenta_codigo() {
        return venta_codigo;
    }

    public void setVenta_codigo(Integer venta_codigo) {
        this.venta_codigo = venta_codigo;
    }

    public Integer getPro_codigo() {
        return pro_codigo;
    }

    public void setPro_codigo(Integer pro_codigo) {
        this.pro_codigo = pro_codigo;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DellateVenta.class.getSimpleName() + "[", "]")
                .add("cantidad=" + cantidad)
                .add("costo=" + costo)
                .add("venta_codigo=" + venta_codigo)
                .add("pro_codigo=" + pro_codigo)
                .toString();
    }
}
