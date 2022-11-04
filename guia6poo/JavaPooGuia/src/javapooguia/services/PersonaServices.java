/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooguia.services;

import java.util.Date;
import java.util.Scanner;
import javapooguia.entities.Persona;

/**
 *
 * @author xhemanuelv
 */
public class PersonaServices {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        System.out.println("Ingresando nueva persona");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Introducir  nombre");
        String name = leer.next();
        System.out.println("Introducir edad");
        int age = leer.nextInt();
        String gender;
        boolean correcto;
        do {
            System.out.println("Introducir sexo : H (hombre) M (mujer) O (otro)");
            gender = leer.next().toUpperCase();
            correcto = gender.equals("H") || gender.equals("M")|| gender.equals("O");
            if (null == gender) {
                System.out.println("Ingreso incorrecto, intente nuevamente");
            } else {
                switch (gender) {
                    case "H":
                        gender = "hombre";
                        break;
                    case "M":
                        gender = "mujer";
                        break;
                    case "O":
                        gender = "otro";
                        break;
                    default:
                        System.out.println("Ingreso incorrecto, intente nuevamente");
                        break;
                }
            }
        } while (!correcto);

        System.out.println("Introducir peso");
        float weight = leer.nextFloat();
        System.out.println("Introducir altura");
        float height = leer.nextFloat();
        System.out.println("Introducir dia nacimiento");
        int day = leer.nextInt();
        System.out.println("Introducir mes nacimiento");
        int month = leer.nextInt();
        System.out.println("Introducir año nacimiento");
        int year = leer.nextInt();
        Date birthday = new Date(year - 1900, month - 1, day);
        return new Persona(name, age, gender, birthday, weight, height);
    }

    public double calcularIMC(Persona joenneDoe) {
        /**
         * peso ideal (peso en kg/(altura^2 en mt2)). imc < 20= -1 underweight
         * imc ~ 20 a 25 inclusive 0 ideal
         * imc>25 overweight
         */
        double imc;
        imc = (joenneDoe.getPeso()) / (joenneDoe.getAltura() * joenneDoe.getAltura());
        if (imc < 20) {
            joenneDoe.setIndiceMasaCorporal(-1);
        } else if (imc >= 20 || imc <= 25) {
            joenneDoe.setIndiceMasaCorporal(0);
        } else if (imc > 25) {
            joenneDoe.setIndiceMasaCorporal(1);
        }
        return imc;
    }

    public boolean mayoriaEdad(Persona joeDoe) {

        boolean mayorEdad = joeDoe.getEdad() >= 18;
        joeDoe.setMayorEdad(mayorEdad);
        return mayorEdad;
    }

}
