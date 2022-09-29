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
public class JavaAprendizaje21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*verificar si una matriz nxn  contiene una matriz mxm y m<n
        https://www.geeksforgeeks.org/check-if-a-matrix-contains-a-square-submatrix-with-0-as-boundary-element/
         */
        int[][] matrix = devolverMatriz(10, 10);
        int[][] subMatrix = devolverMatriz(3, 3);
        boolean contenido = contieneSubmatriz(matrix, 10, subMatrix, 3);
        if (contenido) {
            System.out.println("La matriz se encuentra contenida en esas posiciones");

        } else {
            System.out.println("La matriz[3][3] no se encuentra contenida en la matriz[10][10]");
        }
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
        boolean flag = false, contained;
        int counter = 0, cordinateX = 0, cordinateY = 0, recursiveJ, recursiveI;
        int[][] auxMatrix = new int[3][3];
        //Obtengo coordenadas si existen coincidencias en el primer elemento de  submatriz{3}{3} de m[10][10] y altM[3][3] 
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                //Analizar submatrices de matriz[10][10] verificando la diagonal con matriz[3][3]
                for (int k = 0; k < tamanoSub; k++) {
                    for (int l = 0; l < tamanoSub; l++) {
                        if (k == l) {
                            if (matriz[k][l] == subMatriz[k][l]) {
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
                /* Copia manual de array
                for (int j = cordinateY; j < tamano; j++) {
                    auxMatrix[i][j]=matriz[i][j];
                }*/
                System.arraycopy(matriz[i], cordinateY, auxMatrix[i], cordinateY, tamanoSub - cordinateY);
            }
        }
        return contained = auxMatrix == subMatriz;
    }

}
