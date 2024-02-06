import java.util.HashMap;

import generics.MyArrayList;
import generics.Perro;

public class App {
    public static void main(String[] args) throws Exception {
        MyArrayList<Integer> array = new MyArrayList<Integer>(10);
        for(int i = 0; i < 1000; i++)
            array.add(i);
        System.out.println(array);
        System.out.println("Position: 100 = "+array.get(100));
        array.set(100, -100);
        array.remove(100);
        array.add(100, 100);
        System.out.print(array);
        MyArrayList<Perro> arrayPerros = new MyArrayList<>(10);
        for(int i = 0; i < 100; i++){
            String nombre = "";
            for(int j = 0; j<10; j++){
                nombre+=""+(char)(65+(int)(Math.random()*20));
            }
            arrayPerros.add(new Perro(nombre));
        }
        System.out.println(arrayPerros);
    }
}
