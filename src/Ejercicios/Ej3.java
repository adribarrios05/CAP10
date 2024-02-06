package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;

public class Ej3 {
    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<>();
        int numElements = ((int)Math.random()*11)+10;
        for(int i = 0; i < numElements; i++)
            valores.add((int)(Math.random()*101));
        System.out.println("Lista sin ordenar");
        for (Integer valor : valores) 
            System.out.printf("%d | ", valor);
        Collections.sort(valores);
        System.out.println("");
        System.out.println("Lista ordenada");
        for (Integer valor : valores) 
            System.out.printf("%d | ", valor);
        
    }
}
