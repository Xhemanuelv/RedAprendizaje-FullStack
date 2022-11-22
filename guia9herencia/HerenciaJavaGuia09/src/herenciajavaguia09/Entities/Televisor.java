package herenciajavaguia09.Entities;

/**
 *
 * @author Xhemanuelv
 */
public final class Televisor extends Electrodomestico {

    private boolean sintonizadorTDT = false;
    private float tamanioPulgadas;

    public Televisor() {
    }

    public Televisor(boolean sintonizadorTDT, float tamanioPulgadas, Float precio, String color, char eficienciaEnergetica, Float peso) {
        super(precio, color, eficienciaEnergetica, peso);
        this.sintonizadorTDT = sintonizadorTDT;
        this.tamanioPulgadas = tamanioPulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public float getTamanioPulgadas() {
        return tamanioPulgadas;
    }

    public void setTamanioPulgadas(float tamanioPulgadas) {
        this.tamanioPulgadas = tamanioPulgadas;
    }

    @Override
    public String toString() {
        return "Electrodomestico{Televisor [" + "precio=" + precio + ", color=" + color + ", eficienciaEnergetica=" + eficienciaEnergetica + ", peso=" + peso + ", screensize=" + tamanioPulgadas + ", tiene TDT? " + sintonizadorTDT +"]"+ '}';
    }

}
