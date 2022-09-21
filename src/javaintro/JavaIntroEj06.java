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
public class JavaIntroEj06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Implementar un programa que le pida dos números enteros a usuario y determine si ambos o alguno de ellos es mayor a 25.
        System.out.println("Ingrese un número");
        Scanner leer = new Scanner(System.in);
        int num1= leer.nextInt();
        System.out.println("Ingrese otro número");
        int num2= leer.nextInt();
        int veinticinco=25;
        if(num1> veinticinco && num2>veinticinco){
            System.out.println("Ambos son mayores que 25");
        }else if(num1>veinticinco){
            System.out.println("Solo "+ num1 + " es mayor que 25");
        }else if(num2>veinticinco){
        System.out.println("Solo "+ num2 + " es mayor que 25");
        }else if(num1==num2 && num1==veinticinco){
            System.out.println("Los números son iguales al de control y entre si");
        }else if(num2==veinticinco){
            System.out.println("El segundo número es igual al numero de control");
        }else if(num1==veinticinco){
            System.out.println("El primer número es igual al numero de control");
        }
    }
    
}
