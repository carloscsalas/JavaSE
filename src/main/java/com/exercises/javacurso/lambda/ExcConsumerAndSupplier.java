package com.exercises.javacurso.lambda;

import com.exercises.javacurso.models.Usuario;
import com.exercises.javacurso.optional.models.ObjetoDos;
import com.exercises.javacurso.optional.models.ObjetoTres;
import com.exercises.javacurso.optional.models.ObjetoUno;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ExcConsumerAndSupplier {

    public static void main(String[] args) {

        /*Consumer no devuelve nada es un void, solo realiza alguna accion; saludo, seria el parametro*/
        Consumer<String> consumidor = saludo -> System.out.println(saludo);
        consumidor.accept("Hola Frecia");
        System.out.println("-----------por referencia------------");
        Consumer<String> consumidorRef = System.out::println;
        consumidorRef.accept("Enviando saludo, via referencia");

        System.out.println("-------------------------------");

        Consumer<Date> consumerDate = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };


        consumerDate.accept(new Date());

        System.out.println(":::::::::::BiConsumer::::::::::::");

        /*consumerbi, es el objeto o expresion lambda q tiene el metodo anonimo*/
        BiConsumer<String, Integer> consumerbi =(nombre, edad) -> System.out.println(nombre+ " tiene "+edad+" años");
        consumerbi.accept("Gino", 30);

        System.out.println("-------------------------------");
        Usuario usuario = new Usuario();

        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;

        asignarNombre.accept(usuario, "Gino");
        System.out.println("Nombre de usuario: "+ usuario.getNombre());

        System.out.println(":::::::::::::::::::::::::::::");
        List<String> nombres = Arrays.asList("gino","andres","luis","luz");
        nombres.forEach(consumidorRef);


        System.out.println(":::::::::::::::: LAMBDA SUPPLIER:::::::::::::");
        /*esta expresion lambda no recibe ningun argumento y devuelve un valor*/

//        Supplier<String> proveedor = () ->{
//            return "Hola a todos, lambda supplier";
//        };
        Supplier<String> proveedor = () ->"Hola a todos, lambda supplier";
        System.out.println(proveedor.get());

//        Supplier<Usuario> supplierUsuario = () ->  new Usuario();
        Supplier<Usuario> supplierUsuario = Usuario::new;

        Usuario usuarioLambda = supplierUsuario.get();
        asignarNombre.accept(usuarioLambda, "Jaime");
        System.out.println(usuarioLambda.getNombre());


        ObjetoDos objetoDos = new ObjetoDos();
        objetoDos.setObjetoTres(null);
        ObjetoUno objetoUno = new ObjetoUno();
        objetoUno.setObjetoDos(objetoDos);

        System.out.println(":::::::::::::::::::::::::::::::");
        Optional.ofNullable(objetoUno.getObjetoDos()).ifPresent(objetoDos1 -> {
            Optional.ofNullable(objetoDos1.getObjetoTres()).ifPresent(objetoTres1 -> {
                Optional.ofNullable(objetoTres1.getCodigo()).ifPresent(cod ->{
                    System.out.println(cod);
                });
            });
        });

    }
}
