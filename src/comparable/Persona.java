package comparable;

public class Persona implements Comparable<Persona> {
    
    private String nombre;
    private String apellidos;
    private int dni;

    Persona(String nombre, String apellidos, int dni){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public boolean equals(Object obj) {
        return obj==this && 
        nombre.equals(((Persona)obj).nombre) && 
        apellidos.equals(((Persona)obj).apellidos) &&
        dni == ((Persona)obj).dni;
    }

    @Override
    public int compareTo(Persona p){
        if(apellidos.equals(p.apellidos))
            return nombre.compareTo(p.nombre);
        return apellidos.compareTo(p.apellidos);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Persona p = new Persona(this.nombre, this.apellidos, this.dni);
        return p;
    }

    @Override
    public String toString() {
        return apellidos+", "+nombre;
    }
}
