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
public class JavaAprendizaje08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String palabra=leer.nextLine();
        if (palabra.length()>8) {
            System.out.println("Incorrecto");
        } else if (palabra.length()<8){
            System.out.println("Incorrecto");
        }else if (palabra.length()==8){
            System.out.println("Correcto");
        }
    }
    
}
