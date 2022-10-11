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
public class JavaIntroVideo05Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int resultado = suma(10, 10);
        System.out.println(resultado);
        System.out.println("Ingrese su nombre");
        Scanner leer = new Scanner(System.in);
        String name = leer.nextLine();
        saludoPersonalizado(name);
    }

    public static int suma(int a, int b) {
        //logica del programa
        int resultado = a + b;
        return resultado;
    }

    public static void saludoPersonalizado(String nombre) {
        System.out.println("Hola " + nombre + " ¿Como estas hoy?");
    }
}
