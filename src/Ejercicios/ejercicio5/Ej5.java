package Ejercicios.ejercicio5;

import Ejercicios.ejercicio5.discos.Coleccion;
import Ejercicios.ejercicio5.discos.Disco;

public class Ej5 {
    public static void main(String[] args) {

        Disco disco1 = new Disco("Buleria", "David Bisbal", "Flamenco", 35);
        Disco disco2 = new Disco("Nadie sabe lo que va a pasar mañana", "Bad Bunny", "Trap", 55);
        System.out.println(disco1);
        Coleccion coleccion = new Coleccion();
        coleccion.anadirDisco(disco1);
        coleccion.anadirDisco(disco2);
        System.out.println(coleccion);
    }
}
