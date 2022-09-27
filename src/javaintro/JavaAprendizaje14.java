/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author xhemanuelv
 */
public class JavaAprendizaje14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de euros a convertir");
        float euros = leer.nextFloat();
        System.out.format("¿A que tipo de cambio desea convertir?%n"
                + "1.28611 € = Dólar%n"
                + "129.852 € = Yen%n"
                + "0.86 € = Libra%n");
        String divisaC = leer.next().toLowerCase();
        System.out.println(divisaC);
        conversion(euros,divisaC);
    }

    public static void conversion(float divisa, String tipoCambio) {
        String divYen = "yen";
        String divDolar = "dolar";
        String divLibra = "libra";
        if ("dólar".equals(tipoCambio)) {
            tipoCambio = "dolar";
        }
        if (tipoCambio.equals(divDolar)) {
            System.out.println("La conversion de "+divisa+" a dólar es: "+divisa * 1.28611);
        } else if (tipoCambio.equals(divYen)) {
            System.out.println("La conversion de "+divisa+" a yen es: "+divisa * 129.852);
        } else if (tipoCambio.equals(divLibra)) {
            System.out.println("La conversion de "+divisa+" a libra es: "+divisa * 0.86);
        }
    }

}
