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
public class JavaIntroEj09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer 20 numeros y mostrar la suma, salir con 0 y no sumar negativos
    
        System.out.println("Ingrese 20 numeros a sumar, se realiza corte en 0");
        Scanner leer= new Scanner(System.in);
        int auxiliar=0;
        for (int i=1;i<=20;i++){
            System.out.println("Ingrese el "+i+"° numero");
             int numeros=leer.nextInt();
             if (numeros>0){
                 auxiliar+=numeros;
                 
             }else if(numeros==0){
                 break;
             }
        }
        System.out.println("La sumatoria de los numeros introducidos es:"+auxiliar);
    } 
}
