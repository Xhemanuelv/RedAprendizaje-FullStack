package excepcionesjavaguia10.Entities;

import java.util.Arrays;

/**
 *
 * @author Xhemanuelv
 */
public class NumerosAleatorios {

    private Double[] datoAleatorio = new Double[10];

    public NumerosAleatorios() {
    }

    public NumerosAleatorios(Double[] datoAleatorio) {
        this.datoAleatorio = datoAleatorio;
    }

    public Double[] getDatoAleatorio() {
        return datoAleatorio;
    }

    public void setDatoAleatorio(Double[] datoAleatorio) {
        this.datoAleatorio = datoAleatorio;
    }

    public void setDatoAleatorio(Double algo, int i) {
        this.datoAleatorio[i] = algo;
    }

    @Override
    public String toString() {
        return "NumerosAleatorios{" + "datoAleatorio=" + Arrays.toString(datoAleatorio) + '}';
    }

}
