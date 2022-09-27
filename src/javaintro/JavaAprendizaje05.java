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
public class JavaAprendizaje05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int operar=leer.nextInt();
        int doble=operar*2;
        int triple=operar*3;
        double raizCuadrada=Math.sqrt(operar);
        System.out.println(operar+" x 2= "+doble);
        System.out.println(operar+" x 3= "+triple);
        System.out.println("raiz cuadrada:"+operar+"= "+raizCuadrada);
    }
    
}
