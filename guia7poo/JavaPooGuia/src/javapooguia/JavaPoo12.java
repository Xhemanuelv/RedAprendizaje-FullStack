package javapooguia;

import java.util.Scanner;
import javapooguia.entities.Persona12;
import javapooguia.services.Persona12Services;

/**
 *
 * @author xhemanuelv
 */
public class JavaPoo12 {

    public static void main(String[] args) {
        // persona ejercicio 12 edit
        
        Scanner leer = new Scanner(System.in);
        Persona12Services p12s = new Persona12Services();
        Persona12 guybrush = p12s.crearPersona();
        System.out.println(guybrush);
        int edadPersona12 = p12s.calcularEdad(guybrush);
        System.out.println("Introducir edad de otra persona para analizar si es menor a la ingresada anteriormente");
        int edad = leer.nextInt();
        boolean menorQue = p12s.menorQue(edad, edadPersona12);
        if (menorQue) {
            System.out.println("La nueva persona es menor");
        } else {
            System.out.println("La nueva persona es mayor");
        }
    }

}
