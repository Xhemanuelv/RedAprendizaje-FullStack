/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooguia.entities;

import java.util.Date;

/**
 *
 * @author xhemanuelv
 */
public class Persona {

    /**
     * nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si
     * el alumno desea añadir algún otro atributo, puede hacerlo.
     */
    private String nombre;
    private int edad;
    private String sexo;//H hombre, M mujer, O otro
    private Date fechaNacimiento;
    private float peso;
    private float altura;
    private boolean mayorEdad;
    private double indiceMasaCorporal;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, Date fechaNacimiento, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, String sexo, Date fechaNacimiento, float peso, float altura, boolean mayorEdad, double indiceMasaCorporal) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.altura = altura;
        this.mayorEdad = mayorEdad;
        this.indiceMasaCorporal = indiceMasaCorporal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public boolean isMayorEdad() {
        return mayorEdad;
    }

    public void setMayorEdad(boolean mayorEdad) {
        this.mayorEdad = mayorEdad;
    }

    public double getIndiceMasaCorporal() {
        return indiceMasaCorporal;
    }

    public void setIndiceMasaCorporal(double indiceMasaCorporal) {
        this.indiceMasaCorporal = indiceMasaCorporal;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + ", peso=" + peso + ", altura=" + altura + ", mayorEdad=" + mayorEdad + ", indiceMasaCorporal=" + indiceMasaCorporal + '}';
    }

}
