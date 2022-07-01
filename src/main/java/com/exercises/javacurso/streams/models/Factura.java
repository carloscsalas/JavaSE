package com.exercises.javacurso.streams.models;

public class Factura {
    private String descripcion;
    private Usuario usuario;

    public Factura(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Factura{");
        sb.append("descripcion='").append(descripcion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
