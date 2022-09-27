/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author kmurg
 */
public class JavaAprendizaje04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //F = 32 + (9 * C / 5).
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura(°C)");
        float temperatura=leer.nextFloat();
        float farenheit=32+(9*temperatura/5);
        System.out.println("La temperatura en grados farenheit es: "+farenheit+"°F");
    }
    
}
