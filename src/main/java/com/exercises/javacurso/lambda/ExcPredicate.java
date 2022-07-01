package com.exercises.javacurso.lambda;

import com.exercises.javacurso.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ExcPredicate {

    public static void main(String[] args) {
        /*para evaluar una expresion booleana*/

        /* siempre devuelve boolean*/
        Predicate<Integer> test = num -> num > 10;
        Boolean result = test.test(6);
        System.out.println("result: "+result);

        Predicate<String> testString = role -> role.equalsIgnoreCase("ROLE_ADMIN");
        System.out.println("result: "+testString.test("role_admin"));

        System.out.println("::::::::::::::::::BiPredicate::::::::::::");

//        BiPredicate<String, String> biPredicate = (a , b) -> a.equalsIgnoreCase(b);
        BiPredicate<String, String> biPredicate = String::equalsIgnoreCase;
        System.out.println("Result: "+biPredicate.test("Jaime", "Jaime"));

        BiPredicate<Integer, Integer> biPredicateInt = (x , z) -> x > z;
        System.out.println("Result int: "+biPredicateInt.test(85, 5));

        Usuario ua = new Usuario();
        Usuario ub = new Usuario();
        ua.setNombre("Gino");
        ub.setNombre("Gino");
        BiPredicate<Usuario, Usuario> biPredicateObject = (a, b) -> ua.getNombre().equalsIgnoreCase(ub.getNombre());
        System.out.println("Result Objet: "+biPredicateObject.test(ua, ub));

    }
}
