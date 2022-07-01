package com.exercises.patronesdisenio.decorator;

/*Este sera un componente que va ser comun, tanto al objeto que queremos decorar, como tambien a los decoradores,
* que asu vez estos decoradores contienen a este objeto para decorar*/

public interface Formateable {
    //El modificador se puede omitir, porque por defecto es publico
    String darFormato();
}
