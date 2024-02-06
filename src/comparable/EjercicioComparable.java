package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EjercicioComparable {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Pepe", "Garcia", 12345678));
        personas.add(new Persona("Jose", "Gonzalez", 87654321));
        Collections.sort(personas);
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        Persona p = personas.get(0);
        boolean iguales = personas.get(0).equals(p);
        System.out.println(iguales);
        try {
            Persona p1 = (Persona)personas.get(0).clone();
            System.out.println(p1);
        } catch (Exception e) {
            System.out.println("Error"+ e);
        }
    }
}
