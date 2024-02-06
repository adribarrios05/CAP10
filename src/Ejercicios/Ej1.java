package Ejercicios;

import java.util.ArrayList;

public class Ej1 {
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<>();
        alumnos.add("Miguel");
        alumnos.add("Eloy");
        alumnos.add("Adrián");
        alumnos.add("Juanqui");
        alumnos.add("Antonio");
        alumnos.add("Samuel");
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}
