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
public class JavaAprendizaje21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*verificar si una matriz nxn  contiene una matriz mxm y m<n
        https://www.geeksforgeeks.org/check-if-a-matrix-contains-a-square-submatrix-with-0-as-boundary-element/
         */
        int[][] matrix = devolverMatriz(10, 10);
        int[][] subMatrix = cargarMatriz(3, 3);
//        int[][] matrix = {{36, 5, 67, 47, 5, 6, 72, 81, 95, 10}, 
//                          {89, 90, 75, 21, 41, 22, 67, 20, 10, 61}, 
//                          {14, 22, 26, 90, 9, 90, 17, 12, 87, 67}, 
//                          {41, 87, 24, 56, 97, 74, 87, 42, 64, 35}, 
//                          {32, 76, 79, 1, 36, 5, 67, 96, 12, 11}, 
//                          {99, 13, 54, 88, 89, 90, 75, 12, 41, 76}, 
//                          {67, 78, 87, 45, 14, 22, 26, 42, 56, 78}, 
//                          {98, 45, 34, 23, 32, 56, 74, 16, 19, 18}, 
//                          {24, 67, 97, 46, 87, 13, 67, 89, 93, 24}, 
//                          {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};

//        int[][] subMatrix = {
//            {36, 5, 67}, 
//            {89, 90, 75}, 
//            {14, 22, 26}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + subMatrix[i][j] + "]");
            }
            System.out.println();
        }
        existe(matrix,subMatrix);
       

//        boolean contenido = contieneSubmatriz(matrix, 10, subMatrix, 3);
//        if (contenido) {
//            System.out.println("La matriz[3][3] no se encuentra contenida en la matriz[10][10]");
//        } else {
//            System.out.println("La matriz se encuentra contenida en esas posiciones");
//            
//        }
    }

    public static void existe(int[][] matrizM, int[][] matrizP) {
        boolean bandera = true, bandera2 = false;
        int cordinateX=0, cordinateY=0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrizM[i][j] == matrizP[0][0] && matrizM[i][j + 1] == matrizP[0][1] && matrizM[i][j + 2] == matrizP[0][2]) {
                    bandera2 = true;
                    System.out.println("Primera fila encontrada en: [" + i + "][" + j + "]");
                    for (int k = 1; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (matrizM[i + k][j + l] == matrizP[k][l]) {
                                cordinateX = i;
                                cordinateY = j;
                            } else {
                                bandera = false;
                            }
                        }
                    }
                }
            }
        }
        boolean contenida=bandera&&bandera2;
        if (contenida) {
            for (int i = cordinateX; i < cordinateX+3; i++) {
                for (int j = cordinateY; j < cordinateY+3; j++) {
                    if (i==cordinateX && j == cordinateY) {
                        
                        System.out.format("%nSe encontro la matriz en las coordenadas: ");
                    }
                    System.out.print(" ["+i+"]["+j+"]"+",");
                }
            }
        }
        System.out.println();
//        return contenida;
    }

    public static int[][] cargarMatriz(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        int usr;
        Scanner leer = new Scanner(System.in);
        //llenar matriz [n][m]
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese [" + i + "]" + "[" + j + "]");
                usr = leer.nextInt();
                matriz[i][j] = usr;
            }

        }
        return matriz;
    }

    public static int[][] devolverMatriz(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        //llenar matriz [n][m]
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 10);

            }

        }
        //mostrar matriz [n][m]
        System.out.println("Matriz[" + filas + "][" + columnas + "] :");
        System.out.println();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println();
        return matriz;
    }

    public static boolean contieneSubmatriz(int[][] matriz, int tamano, int[][] subMatriz, int tamanoSub) {
        //numero posible de matrices de 3x3 contenidas en una matriz de 10x10 64 recorro diagonales, si coincide  con submatriz se analiza filas
        boolean flag = false, contained = false;
        int counter = 0, cordinateX = 0, cordinateY = 0, valor = 0;
        int[][] auxMatrix = new int[3][3];
        //Obtengo coordenadas si existen coincidencias en el primer elemento de  submatriz{3}{3} de m[10][10] y altM[3][3] 
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                //Analizar submatrices de matriz[10][10] verificando la diagonal con matriz[3][3]
                for (int k = 0; k < tamanoSub; k++) {
                    for (int l = 0; l < tamanoSub; l++) {
                        if (k == l) {
                            if (matriz[i][j] == subMatriz[k][l]) {
                                if (k == 0 && l == 0) {
                                    cordinateX = i;
                                    cordinateY = j;
                                }
                                ++counter;
                            }
                        }
                    }
                }
                if (counter == 3) {
                    flag = true;
                    //si se encuentra una diagonal similar se aborta el chequeo del resto de las matrices de 3x3 dentro de la matriz 10x10
                    //volver recursiva la funcion y chequear si se encuentra en mas de una posicion?
                    //requiere cambiar el inicio de recorrido en linea 62 y 63 i & j
                    break;
                }
            }
        }
        if (flag) {
            for (int i = cordinateX; i < tamanoSub; i++) {
//                 Copia manual de array
                for (int j = cordinateY; j < tamano; j++) {
                    auxMatrix[i][j] = matriz[i][j];
                }
//                System.arraycopy(matriz[i], cordinateY, auxMatrix[i], cordinateY, tamanoSub - cordinateY);
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        for (int l = 0; l < 10; l++) {

                        }
                        System.out.println("");
                    }
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (auxMatrix[i][j] == subMatriz[i][j]) {
                    valor++;
                }
            }
        }
        if (valor == 9) {
            contained = true;
            for (int i = cordinateX; i < 10; i++) {
                for (int j = cordinateY; j < 10; j++) {

                }
            }
        }
        return contained;
    }

}
