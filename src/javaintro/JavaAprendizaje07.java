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
public class JavaAprendizaje07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String fraseSecreta="eureka";
        System.out.println("Ingrese una frase");
        String intentoFrase=leer.next();
        if (intentoFrase.equals(fraseSecreta)) {
            System.out.println("Frase correcta");
            
        }else{
            System.out.println("Frase incorrecta");
        }
    }

}
