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
        do{
            
        if(asteriscos>=1 && asteriscos<=20){
        for(int j=1;j<=asteriscos;j++){
            if(j==1){
                System.out.print(asteriscos);
            }
            System.out.print("*");
        }
            System.out.println("");
        }else{
            System.out.format("%nIngrese "+i+ "° numero entre 1 y 20%n");
            asteriscos=leer.nextInt();
            for(int j=1;j<=asteriscos;j++){
            if(j==1){
                System.out.print(asteriscos);
            }
            System.out.print("*");
        }
            System.out.println("");
        }
        }while(asteriscos>20||asteriscos<1);
 
    }
    }
    
}
