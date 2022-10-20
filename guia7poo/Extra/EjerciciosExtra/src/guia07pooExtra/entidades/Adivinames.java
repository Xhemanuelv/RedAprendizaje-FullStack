package guia07pooExtra.entidades;

import java.util.Arrays;

/**
 *
 * @author xhemanuelv
 */
public class Adivinames {

    public String[] mesesAnio = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    public String mesSecreto = mesesAnio[(int) (Math.random() * 12 + 1)];
//    public String mesSecreto = mesesAnio[3];
    
    public Adivinames() {
    }

    public String[] getMesesAnio() {
        return mesesAnio;
    }

    public void setMesesAnio(String[] mesesAnio) {
        this.mesesAnio = mesesAnio;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    @Override
    public String toString() {
        return "Adivinames{" + "mesesAnio=" + Arrays.toString(mesesAnio) + ", mesSecreto=" + mesSecreto + '}';
    }

}
