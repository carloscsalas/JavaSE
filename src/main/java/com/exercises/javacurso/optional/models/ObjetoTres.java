package com.exercises.javacurso.optional.models;

public class ObjetoTres {
    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ObjetoTres{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
