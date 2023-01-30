package com.exercises.javase.parsejson;

import java.util.StringJoiner;

public class CalculoTasaDTO {

    private Integer codigo;
    private String tipo;
    private Integer tasa;
    private String entidad;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getTasa() {
        return tasa;
    }

    public void setTasa(Integer tasa) {
        this.tasa = tasa;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CalculoTasaDTO.class.getSimpleName() + "[", "]")
                .add("codigo=" + codigo)
                .add("tipo='" + tipo + "'")
                .add("tasa=" + tasa)
                .add("entidad='" + entidad + "'")
                .toString();
    }
}
