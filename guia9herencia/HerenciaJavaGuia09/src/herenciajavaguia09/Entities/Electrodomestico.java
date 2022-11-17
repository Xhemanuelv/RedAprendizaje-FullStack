package herenciajavaguia09.Entities;

/**
 *
 * @author Xhemanuelv
 */
public abstract class Electrodomestico {

    protected Float precio;
    protected String color;
    protected char eficienciaEnergetica;
    protected Float peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Float precio, String color, char eficienciaEnergetica, Float peso) {
        this.precio = precio;
        this.color = color;
        this.eficienciaEnergetica = eficienciaEnergetica;
        this.peso = peso;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getEficienciaEnergetica() {
        return eficienciaEnergetica;
    }

    public void setEficienciaEnergetica(char eficienciaEnergetica) {
        this.eficienciaEnergetica = eficienciaEnergetica;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", eficienciaEnergetica=" + eficienciaEnergetica + ", peso=" + peso + '}';
    }

}
