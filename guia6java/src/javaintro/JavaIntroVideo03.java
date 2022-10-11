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
public class JavaIntroVideo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Muestre N sumatoria de los primeros numeros enteros siendo N par
        
        int num;
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese un numero entero positivo");
            num = leer.nextInt();
            if(num>1000) {
                System.out.println("Este programa podria tardar,¿Está seguro? (s/n)");
                String confirma = leer.next();
                if(confirma.equals("s")) {
                    break; //detener el bucle y continuar ejecucion del resto del bloque de codigo
                }
            }
        } while ( num <= 0 || num > 1000 );
        
        int j,suma;
        for(int i=1; i<=num;i++){
            if(i%2 != 0)
                continue;
            suma=0;
            j=1;
            while(j<=i){
                suma+= j;
                j++;
            }
            System.out.println("La suma de los " + i + " números naturales es: "+ suma);
        }
    }
    
}
