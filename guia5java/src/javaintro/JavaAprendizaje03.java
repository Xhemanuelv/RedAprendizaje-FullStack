/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author xhemanuel
 */
public class JavaAprendizaje03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String phrase=leer.nextLine();
        String phraseCaps=phrase.toUpperCase();
        String phraseUnCaps=phrase.toLowerCase();
        System.out.println(phraseCaps);
        System.out.println(phraseUnCaps);
        
    }

}
