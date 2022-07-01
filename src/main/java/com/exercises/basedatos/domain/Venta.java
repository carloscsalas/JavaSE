package com.exercises.basedatos.domain;

import java.time.LocalDate;
import java.util.List;
import java.util.StringJoiner;

public class Venta {
    private String personal;
    private LocalDate fecha_registro;

    private List<DellateVenta> listDetalleVenta;


    public String getPersonal() {
        return personal;
    }

    public void setPersonal(String personal) {
        this.personal = personal;
    }

    public LocalDate getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(LocalDate fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public List<DellateVenta> getListDetalleVenta() {
        return listDetalleVenta;
    }

    public void setListDetalleVenta(List<DellateVenta> listDetalleVenta) {
        this.listDetalleVenta = listDetalleVenta;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Venta.class.getSimpleName() + "[", "]")
                .add("personal='" + personal + "'")
                .add("fecha_registro=" + fecha_registro)
                .add("listDetalleVenta=" + listDetalleVenta)
                .toString();
    }
}
