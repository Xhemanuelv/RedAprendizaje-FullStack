/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooguia;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author kmurg
 */
public class JavaPoo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        Date fecha = new Date(); //Fecha actual automaticamente
        
        LocalDate fecha2=LocalDate.now();
        
        System.out.println("Ingrese el año");
        int anio = (leer.nextInt());
        System.out.println("Ingrese el mes");
        int mes = (leer.nextInt());
        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();
        
        LocalDate fechan=LocalDate.of(anio, mes, dia);
        
        //Date fechan = new Date(anio,mes,dia); //Fecha ingresada por el usuario
        //System.out.println("Han pasado " +(fecha.getYear()-fechan.getYear()) + " años.");
        
        System.out.println("Han pasado " +(fecha.getYear()-fechan.getYear()) + " años.");
        System.out.println(Period.between(fechan, fecha2).getYears());
    }
    
}
