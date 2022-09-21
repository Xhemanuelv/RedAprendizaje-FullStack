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
public class JavaIntroEj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo
       int numero1 = 5;
       int numero2 = 11;
       int suma1 = numero1 + numero2;
       int suma2 = numero2 + numero1;
        int resta1 = numero1 - numero2;
       int resta2 = numero2 - numero1;
        boolean mayor1 = numero1 < numero2;
       boolean mayor2 = numero1 > numero2;
       
       System.out.println( numero1 + "+" + numero2 + "=" + suma1);
       System.out.println( numero2 + "+" + numero1 + "=" + suma2);
       System.out.println( numero1 + "-" + numero2 + "=" + resta1);
       System.out.println( numero2 + "-" + numero1 + "=" + resta2);
       System.out.println( numero1 + "<" + numero2 + "=" + mayor1);
       System.out.println( numero1 + ">" + numero2 + "=" + mayor2);
    }
    
}
