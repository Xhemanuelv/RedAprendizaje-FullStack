package guia07ExtraPlus.entities;

import java.util.Arrays;

/**
 *
 * @author Xhemanuelv
 */
public class SopaDeLetras {

    private char matriz[][];
    private String palabraBuscada;

    public SopaDeLetras() {
    }

    public SopaDeLetras(char[][] matriz) {
        this.matriz = matriz;
    }

    public SopaDeLetras(char[][] matriz, String palabraBuscada) {
        this.matriz = matriz;
        this.palabraBuscada = palabraBuscada;
    }

    public char[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(char[][] matriz) {
        this.matriz = matriz;
    }

    public String getPalabraBuscada() {
        return palabraBuscada;
    }

    public void setPalabraBuscada(String palabraBuscada) {
        this.palabraBuscada = palabraBuscada;
    }

    @Override
    public String toString() {
        return "SopaDeLetras{" + "matriz=" + Arrays.deepToString(matriz) + ", palabraBuscada=" + palabraBuscada + '}';
    }

}
