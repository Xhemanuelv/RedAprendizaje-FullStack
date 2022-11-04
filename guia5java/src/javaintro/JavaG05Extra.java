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
public class JavaG05Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/
        Scanner kb =new Scanner(System.in);
        float minutos,horas,dias;
        System.out.println("Ingrese cantidad de minutos");
        minutos=kb.nextFloat();
        horas=minutos/60;
        dias=horas/24;
        System.out.println(horas);
        System.out.println(dias);
        
    }
    
}
