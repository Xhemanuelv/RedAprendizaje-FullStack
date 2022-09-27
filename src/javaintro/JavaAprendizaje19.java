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
public class JavaAprendizaje19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Find if a square matrix is antisymmetric

        int filas = 3, columnas = 3;//reemplazar por lectura en otro caso
        if (filas == columnas) {

            //int[][] matrix = devolverMatriz(filas, columnas);
            int[][] matrix = new int[filas][columnas];
            matrix[0][0] = 0;
            matrix[0][1] = -2;
            matrix[0][2] = 4;
            matrix[1][0] = 2;
            matrix[1][1] = 0;
            matrix[1][2] = 2;
            matrix[2][0] = -4;
            matrix[2][1] = -2;
            matrix[2][2] = 0;
            System.out.println();
            boolean bandera = checkZeroDiagonal(matrix, filas);//comprobar la diagonal sea cero
            if (bandera) {
                //mostrar matriz [n][m]
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print("[" + matrix[i][j] + "]");
                    }
                    System.out.println(" ");
                }
                System.out.println("Los elementos de la diagonal son cero, transponiendo y comprobando los demas elementos");
                int[][] transpuesta = transponerMatriz(matrix, filas, columnas);
                boolean antisimetrica = antisymmetry(transpuesta, matrix, filas);
                if (antisimetrica) {
                    System.out.println("La matriz no es antisimetrica");
                } else {
                    System.out.println("La matriz es antisimetrica");
                }
            } else {
                System.out.println("Los elementos de la diagonal no son cero, por lo tanto la matriz no puede ser antisimetrica");
            }

        } else if (filas != columnas) {
            System.out.println("Una matriz no cuadrada no puede ser antisimetrica");
        }

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
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        return matriz;
    }

    public static int[][] transponerMatriz(int[][] matriz, int filas, int columnas) {
        int[][] transposedMatrix = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transposedMatrix[j][i] = matriz[i][j];
            }
        }
        //mostrar matriz transpuesta
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                System.out.print("[" + transposedMatrix[i][j] + "]");
            }
            System.out.println(" ");
        }
        return transposedMatrix;
    }

    static boolean checkZeroDiagonal(int matriz[][], int tamanoMatriz) {
        for (int i = 0; i < tamanoMatriz; i++) {
            for (int j = 0; j < tamanoMatriz; j++) {
                if ((i == j)
                        && (matriz[i][j] != 0)) {
                    return false;
                }
            }
        }
        return true;
    }
    //comparar elementos de transpuesta con elementos negativos de matriz 

    public static boolean antisymmetry(int[][] transpuesta, int[][] matriz, int tamano) {
        int[][] negativeMatrix = new int[tamano][tamano];
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                negativeMatrix[i][j] = -matriz[i][j];
            }
        }
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (negativeMatrix[i][j] != transpuesta[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
