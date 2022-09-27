/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Random;

/**
 *
 * @author xhemanuelv
 */
public class JavaAprendizaje18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).*/
        int filas = 4, columnas = 4;
        int[][] matrix = devolverMatriz(filas, columnas);
        System.out.println();
        int[][] transpuesta =transponerMatriz(matrix,filas,columnas);
    }

    public static int[][] devolverMatriz(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        Random random = new Random();// java util random class
        //llenar matriz [n][m]
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(10 + 10) - 10; //random between (min + max) + min

            }

        }
        //mostrar matriz [n][m]
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                // Usamos la i y j para pasar por todos los elementos y mostrarlos
                // Mostrando la matriz por sus filas
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println(" ");
        }

        return matriz;
    }
    public static int[][] transponerMatriz(int[][] matriz,int filas, int columnas){
      int[][] transposedMatrix=new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transposedMatrix[j][i]=matriz[i][j];
            }
            
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                // Usamos la i y j para pasar por todos los elementos y mostrarlos
                // Mostrando la matriz por sus filas
                System.out.print("[" + transposedMatrix[i][j] + "]");

            }
            System.out.println(" ");
        }
        return transposedMatrix;
    }

}
