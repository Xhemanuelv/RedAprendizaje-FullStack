package guia07pooExtra.entidades;

import java.util.Arrays;

/**
 *
 * @author xhemanuelv
 */
public class Ahorcado {

    private char[] palabra;
    private int intentos;
    private String encontradas="";

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int intentos) {
        this.palabra = palabra;
        this.intentos = intentos;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(String encontradas) {
        this.encontradas = encontradas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + Arrays.toString(palabra) + ", intentos=" + intentos + ", encontradas=" + encontradas + '}';
    }

}
