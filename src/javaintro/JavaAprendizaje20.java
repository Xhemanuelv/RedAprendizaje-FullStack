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
public class JavaAprendizaje20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int filas = 3, columnas = 3;//reemplazar por lectura en otro caso
        int[][] matrix = devolverMatriz(filas, columnas);
    }

    public static int[][] devolverMatriz(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        Scanner leer = new Scanner(System.in);
        //llenar matriz [n][m]
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                boolean bandera;// = matriz[i][j] < 10 && matriz[i][j] > 0;
                do {
                    System.out.println("m[" + i + "][" + j + "]");
                    matriz[i][j] = leer.nextInt();
                    bandera = (matriz[i][j] > 10) || (matriz[i][j] < 1);
                    if (bandera) {
                        System.out.println("Error, el valor debe estar comprendido entre 1 y 9 inclusive");
                    }
                } while (bandera);

            }
        }
        //mostrar matriz [n][m]
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        return matriz;
    }

}
