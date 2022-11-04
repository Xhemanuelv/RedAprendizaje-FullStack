package javapooguia.entities;

import java.util.Date;

/**
 *
 * @author Xhemanuelv
 */
public class Vendedor {

    private String nombre;

    private Integer dni;

    private double sueldoBasico;

    private double comisiones;

    private double sueldoMensual;

    private Date fechaInicio;

    /**
     * Empty constructor
     */
    public Vendedor() {
    }

    /**
     * Parameterized Constructor startup
     *
     * @param nombre
     * @param dni
     * @param sueldoBasico
     * @param fechaInicio
     */
    public Vendedor(String nombre, Integer dni, double sueldoBasico, Date fechaInicio) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBasico = sueldoBasico;
        this.fechaInicio = fechaInicio;
    }

    /**
     * Parameterized Constructor
     *
     * @param nombre
     * @param dni
     * @param sueldoBasico
     * @param comisiones
     * @param sueldoMensual
     * @param fechaInicio
     */
    public Vendedor(String nombre, Integer dni, double sueldoBasico, Double comisiones, Double sueldoMensual, Date fechaInicio) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBasico = sueldoBasico;
        this.comisiones = comisiones;
        this.sueldoMensual = sueldoMensual;
        this.fechaInicio = fechaInicio;
    }

    //getter & setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getComisiones() {
        return comisiones;
    }

    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    

    @Override
    public String toString() {
        return "Vendedor{" + "nombre=" + nombre + ", dni=" + dni + ", sueldoBasico=" + sueldoBasico + ", comisiones=" + comisiones + ", sueldoMensual=" + sueldoMensual + ", fechaInicio=" + fechaInicio + '}';
    }

}
