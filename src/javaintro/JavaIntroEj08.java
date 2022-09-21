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
public class JavaIntroEj08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Validar nota entre 0 y 10, repetir hasta estar dentro de los parametros
    Scanner leer = new Scanner(System.in);
    int nota;
        System.out.println("Ingrese una nota");
        nota = leer.nextInt();
        if(nota>10||nota<0){
            do{
                System.out.println("Nota Invalida, ingrese una nota entre 0 y 10");
                nota=leer.nextInt();
            }while(nota>10|| nota<0);
        }else if(nota<=10||nota>=0) {
            System.out.println("La nota es valida");
        }
        if(nota<=10||nota>=0) {
            System.out.println("La nota es valida");
        }
    }
}
