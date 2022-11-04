package guia07ExtraPlus.entities;

import java.util.Date;

/**
 *
 * @author Xhemanuelv
 */
public class Auto {

    /**
     * Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha
     * vencimiento carnet, color del vehículo, modelo y KM en motor (deberá ser
     * inicializado por defecto en 7500km)
     */
    private String nombreDuenio;
    private Date vencimientoCarnet;
    private String color;
    private String modelo;
    private float kmMotor = 7500.0f;

    public Auto() {
    }

    public Auto(String nombreDuenio, Date vencimientoCarnet, String color, String modelo) {
        this.nombreDuenio = nombreDuenio;
        this.vencimientoCarnet = vencimientoCarnet;
        this.color = color;
        this.modelo = modelo;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public Date getVencimientoCarnet() {
        return vencimientoCarnet;
    }

    public void setVencimientoCarnet(Date vencimientoCarnet) {
        this.vencimientoCarnet = vencimientoCarnet;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getKmMotor() {
        return kmMotor;
    }

    public void setKmMotor(float kmMotor) {
        this.kmMotor = kmMotor;
    }

    @Override
    public String toString() {
        return "Auto{" + "nombreDuenio=" + nombreDuenio + ", vencimientoCarnet=" + vencimientoCarnet + ", color=" + color + ", modelo=" + modelo + ", kmMotor=" + kmMotor + '}';
    }

}
