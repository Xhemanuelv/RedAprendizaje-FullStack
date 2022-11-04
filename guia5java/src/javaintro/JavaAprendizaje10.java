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
public class JavaAprendizaje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
        números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor maximo");
        int limite=leer.nextInt();
        for (int i = 0; i < limite;) {
            
            System.out.println("Ingrese un numero");
            int agregar=leer.nextInt();
            i+=agregar;
            
        }
        System.out.println("Alcanzo el limite, hasta luego");
    }
    
}