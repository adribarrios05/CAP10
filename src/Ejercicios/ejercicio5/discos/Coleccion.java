package Ejercicios.ejercicio5.discos;

import java.util.ArrayList;

import Ejercicios.ejercicio5.crud.CRUD;

public class Coleccion implements CRUD{

    ArrayList<Disco> discos = new ArrayList<>();
    
    public Coleccion(){
        discos.toArray();
    }

    public Disco anadirDisco(Disco disco) {
        for (int i = 0; i < discos.size(); i++) {
            if (discos.get(i) == null) {
                discos.set(i, disco);
                return disco;
            }
        }
        discos.add(disco);
        return disco;
    }
    public Disco actualizaDisco(String codigo, String nombre, String autor, String genero, int duracion) {
        for (int i = 0; i < discos.size(); i++) {
            Disco disco = discos.get(i);
    
            if (codigo.equals(disco.getCodigo())) {
                if (!nombre.isEmpty()) {
                    disco.setNombre(nombre);
                }
                if (!autor.isEmpty()) {
                    disco.setAutor(autor);
                }
                if (!genero.isEmpty()) {
                    disco.setGenero(genero);
                }
                if (duracion != 0) {
                    disco.setDuracion(duracion);
                }
                return disco;
            }
        }
        return null;
    }
    public Disco eliminaDisco(String codigo){
        return null;
    }
    
    public Disco[] listaDiscos(){
        return null;
    }
}
