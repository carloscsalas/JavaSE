package com.exercises.javacurso.optional.repositorio;

import com.exercises.javacurso.optional.models.Computador;

import java.util.Optional;

public interface Repositorio<T> {
    Optional<Computador> filtrar(String nombre);
}
