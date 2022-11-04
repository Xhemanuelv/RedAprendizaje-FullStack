/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

/**
 *
 * @author xhemanuelv
 */
public class JavaAprendizaje15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.
        int[] vector = new int[101];
        for (int i = 0; i <= 100; i++) {

            vector[i] = i;
        }
        for (int i = 100; i > 0; i--) {
            System.out.println(vector[i]);
        }
    }

}
