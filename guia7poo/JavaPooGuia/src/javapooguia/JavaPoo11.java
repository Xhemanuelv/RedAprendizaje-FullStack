
package javapooguia;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author xhemanuelv
 */
public class JavaPoo11 {

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
