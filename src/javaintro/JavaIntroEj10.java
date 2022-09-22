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
public class JavaIntroEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Introducir 4 numeros e imprimir tantos asteriscos como indique su valor
    Scanner leer= new Scanner(System.in);
    for(int i=1;i<5;i++){
        if(i>1){
            System.out.format("%nIngrese "+i+ "° numero%n");
        }else {
            System.out.println("Ingrese"+i+"° numero");
        }
        
        int asteriscos=leer.nextInt();
        RepresentarAsteriscos(asteriscos,i);
        
 
    }
    }
    public static void RepresentarAsteriscos(int dibujar,int numerar){
        Scanner leer= new Scanner(System.in);
        do{
            
        if(dibujar>=1 && dibujar<=20){
        for(int j=1;j<=dibujar;j++){
            if(j==1){
                System.out.print(dibujar);
            }
            System.out.print("*");
        }
            System.out.println("");
        }else{
            System.out.format("%nIngrese "+numerar+ "° numero entre 1 y 20%n");
            dibujar=leer.nextInt();
            for(int j=1;j<=dibujar;j++){
            if(j==1){
                System.out.print(dibujar);
            }
            System.out.print("*");
        }
            System.out.println("");
        }
        }while(dibujar>20||dibujar<1);
        
    }
    
}
