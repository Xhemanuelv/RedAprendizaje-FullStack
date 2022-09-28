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
        // MAIN CLASS HERE!!!
        int filas = 3, columnas = 3;//reemplazar por lectura en otro caso
        int[][] matrix = devolverMatriz(filas, columnas);
        int[][] transposedMatrix = transponerMatriz(matrix, filas);
        boolean flagFiles, flagTransposedFiles, flagDiagonal;
        flagFiles = comprobarFilas(matrix, filas);
        if (flagFiles) {
            flagTransposedFiles = comprobarFilas(transposedMatrix, filas);
            if (flagTransposedFiles) {
                flagDiagonal = diagonales(matrix, filas);
                if (flagDiagonal) {
                    System.out.println("Felicidades!!!");
                    System.out.println("Encontraste una matriz magica");
                    System.out.println("En una matriz de orden 3 introducida por teclado");
                }
            } else {
                System.out.println("La matriz no es Magica");
            }

        } else {
            System.out.println("La matriz no es Magica");
        }

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
        System.out.println("Matriz visualizada:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        return matriz;
    }

    public static boolean comprobarFilas(int[][] matriz, int tamano) {
        int suma1, suma2 = 0, aux;
        boolean bandera = true;
        for (int i = 0; i < tamano; i++) {
            suma1 = 0;
            for (int j = 0; j < tamano; j++) {
                suma1 += matriz[i][j];
            }
            aux = suma1;
            suma1 = suma2;
            suma2 = aux;
            if (suma2 == suma1 && bandera) {
                bandera = true;
            } else if (i > 0) {
                bandera = false;
            }
        }
        return bandera;
    }

    public static int[][] transponerMatriz(int[][] matriz, int filas) {
        int[][] transposedMatrix = new int[filas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < filas; j++) {
                transposedMatrix[j][i] = matriz[i][j];
            }

        }
        System.out.println("Matriz transpuesta visualizada:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < filas; j++) {

                System.out.print("[" + transposedMatrix[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println();
        return transposedMatrix;
    }

    public static boolean diagonales(int[][] matriz, int tamano) {
        boolean bandera;
        int diagonal = 0, diagonalInversa = 0;
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (i == j) {
                    diagonal += matriz[i][j];
                }
            }
        }
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (j == (j - i)) {
                    diagonalInversa += matriz[i][j];
                }
            }
        }
        bandera = (diagonal == diagonalInversa);
        return bandera;
    }
}
