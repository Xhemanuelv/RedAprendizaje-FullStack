package relacionesjava.Entities;

import relacionesjava.Enum.RazaPerro;

/**
 *
 * @author Xhemanuelv
 */
public class Perro {

    private String nombre;
    private RazaPerro raza;
    private int edad;
    private String tamanio;
    private boolean adoptado=false;

    public Perro() {
    }

    /**
     * Constructor Perro only by name
     *
     * @param nombre
     */
    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public Perro(String nombre, int edad, String tamaño) {
        this.nombre = nombre;
        this.edad = edad;
        this.tamanio = tamaño;
    }

    public Perro(String nombre, RazaPerro raza, int edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public RazaPerro getRaza() {
        return raza;
    }

    public void setRaza(RazaPerro raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamaño() {
        return tamanio;
    }

    public void setTamaño(String tamaño) {
        this.tamanio = tamaño;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre +", adoptado=" + adoptado + '}';
    }

}
