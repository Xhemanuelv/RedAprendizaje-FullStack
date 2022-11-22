package herenciajavaguia09.Entities;

/**
 *
 * @author Xhemanuelv
 */
public final class Lavadora extends Electrodomestico {

    private Float carga;

    public Lavadora() {
    }

    /**
     * Hereda sus attrib de electrodomestico y agrega carga
     *
     * @param precio
     * @param color
     * @param eficienciaEnergetica
     * @param peso
     * @param carga
     */
    public Lavadora(Float precio, String color, char eficienciaEnergetica, Float peso, Float carga) {
        super(precio, color, eficienciaEnergetica, peso);
        this.carga = carga;
    }

    public Float getCarga() {
        return carga;
    }

    public void setCarga(Float carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Electrodomestico{Lavadora[" + "precio=" + precio + ", color=" + color + ", eficienciaEnergetica=" + eficienciaEnergetica + ", peso=" + peso + ", carga=" + carga + "]" + '}';
    }

}
