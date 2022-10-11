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
public class JavaAprendizaje16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/
        Scanner leer = new Scanner(System.in);
        System.out.println("¿De que tamaño sera el vector?");
        int tamano = leer.nextInt();
        int[] vector = devolverVector(tamano);
        buscarEnVector(vector, tamano);
    }

    public static int[] devolverVector(int tamano) {
        Scanner leer = new Scanner(System.in);

        int[] vector = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            vector[i] = (int) (Math.random() * 10);

        }

        return vector;
    }

    public static void buscarEnVector(int[] vector, int size) {
        System.out.println("Ingrese el numero que desea buscar en el vector");
        Scanner leer = new Scanner(System.in);
        int wally = leer.nextInt();
        int contador = 0;
        for (int i = 0; i < size; i++) {
            if (wally == vector[i]) {
                contador++;
                if (contador == 1) {
                    System.out.format("El numero buscado se encuentra en la posición v[" + i + "]");

                }
            }

            if (contador > 1 && wally == vector[i]) {
                System.out.format(", v[" + i + "]");
            }
        }
        System.out.println("");
        if (contador > 1) {
            System.out.println("El numero se encuentra repetido " + contador + " veces");
        }

        if (contador == 0) {
            System.out.println("El numero introducido no se halla en el vector");
        }
    }
}
