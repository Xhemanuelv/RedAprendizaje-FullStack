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
public class JavaAprendizaje13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int dibujo = leer.nextInt();
        for (int i = 0; i < dibujo; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i < dibujo - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < dibujo - 2; j++) {
                System.out.print(" ");

            }
            System.out.println("*");
        }
        for (int i = 0; i < dibujo; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

}
