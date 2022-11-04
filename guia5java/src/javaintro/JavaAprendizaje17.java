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
public class JavaAprendizaje17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
        de 2 dígitos, etcétera (hasta 5 dígitos).*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int sizeOfArray = leer.nextInt();
        int[] vector = devolverVector(sizeOfArray);
        digitosValoresVector(vector, sizeOfArray);

    }

    public static int[] devolverVector(int tamano) {
        Scanner leer = new Scanner(System.in);

        int[] vector = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            vector[i] = (int) (Math.random() * 100000);//deberia llegar solo hasta 99999
            System.out.println(vector[i]);
        }

        return vector;
    }

    public static void digitosValoresVector(int[] vector, int tamano) {
        int unidad = 0, decena = 0, centena = 0, unidadMil = 0, decenaMil = 0;
        for (int i = 0; i < tamano; i++) {
            int count = 0;

            while (vector[i] != 0) {
                // numero = numero/10
                vector[i] /= 10;
                ++count;
            }
            switch (count) {
                case 1://unidades
                    ++unidad;
                    break;
                case 2://decenas
                    ++decena;
                    break;
                case 3://centenas
                    ++centena;
                    break;
                case 4://unidades de Miles
                    ++unidadMil;
                    break;
                case 5://decenas de Miles
                    ++decenaMil;
                    break;
            }
        }
        System.out.println("Los valores alojados en el vector contienen:  "
                + "\nUn digito: " + unidad
                + "\nDos digitos: " + decena
                + "\nTres digitos: " + centena
                + "\nCuatro digitos: " + unidadMil
                + "\nCinco digitos: " + decenaMil);
    }
}
