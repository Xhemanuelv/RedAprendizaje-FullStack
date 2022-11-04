package javapooguia.services;

import java.util.Date;
import java.util.Scanner;
import javapooguia.entities.Persona12;

/**
 *
 * @author xhemanuelv
 */
public class Persona12Services {

    public Persona12 crearPersona() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introducir  nombre");
        String name = leer.next();

        System.out.println(
                "Introducir dia nacimiento");
        int day = leer.nextInt();

        System.out.println(
                "Introducir mes nacimiento");
        int month = leer.nextInt();

        System.out.println(
                "Introducir año nacimiento");
        int year = leer.nextInt();
        Date birthday = new Date(year - 1900, month - 1, day);
        return new Persona12(name, birthday);
    }

    public int calcularEdad(Persona12 guy) {
        int edad;
        Date date=new Date();
        if ((guy.getBirtday() != null)) {
            edad = ((date.getYear()) - (guy.getBirtday().getYear()));
            System.out.println(edad);
            return edad;
        } else {
            return 0;
        }
    }

    /**
     * Agregar a la clase el método menorQue(int edad) que recibe como parámetro
     * otra edad y retorna true en caso de que el receptor tenga menor edad que
     * la persona que se recibe como parámetro, o false en caso contrario.
     *
     * @param edad
     * @param edadPersona12
     * @return
     */
    public boolean menorQue(int edad, int edadPersona12) {

        return edad < edadPersona12;
    }
}
