package relacionesjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import relacionesjava.Entities.Perro;
import relacionesjava.Entities.Persona;
import relacionesjava.Enum.RazaPerro;
import relacionesjava.Utilities.ComparadorPersona;

/**
 *
 * @author Xhemanuelv
 */
public class JavaRelacionesEj01 {

    public static void main(String[] args) {
        /**
         * Realizar un programa para que una Persona pueda adoptar un Perro.
         * Vamos a contar de dos clases. Perro, que tendrá como atributos:
         * nombre, raza, edad y tamaño; y la clase Persona con atributos:
         * nombre, apellido, edad, documento y Perro. Ahora deberemos en el main
         * crear dos Personas y dos Perros. Después, vamos a tener que pensar la
         * lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
         * mostrar desde la clase Persona, la información del Perro y de la
         * Persona.
         */
        //creamos personas por constructor
        Persona kevin = new Persona("Kevin", "Murgana", 28, 373737256);
        Persona emanuel = new Persona("Emanuel", "Villarin", 28, 37964886);
        Persona regularGuy = new Persona("John", "Doe", 22, 41964886);

        //creamos perros por constructor
        Perro hellSpawn = new Perro("Baal", 7900, "Inmenso");
        Perro providence = new Perro("Dagon", 15276953, "Gigante");
        Perro doge = new Perro("Firulais", 8, "Grande");

        //Seteamos la raza del perro con un enum
        hellSpawn.setRaza(RazaPerro.BULLSQUID);
        providence.setRaza(RazaPerro.HOUNDEYE);
        doge.setRaza(RazaPerro.PITBULL);

        //asignamos 1 mascota a cada persona
        kevin.setMascota(hellSpawn);
        emanuel.setMascota(providence);
        regularGuy.setMascota(doge);

        //creo una lista de personas
        List<Persona> gente = new ArrayList();
        gente.add(kevin);
        gente.add(emanuel);
        gente.add(regularGuy);

        //ordeno personas por apellido con un comparador y muestro por pantalla
        System.out.println("Personas y su mascota ordenadas por apellido");
        Collections.sort(gente, ComparadorPersona.compararApellido);
        for (Persona aux : gente) {
            System.out.println(aux);
        }
        System.out.println("");

        //ordeno personas por nombre con un comparador y muestro por pantalla
        System.out.println("Personas y su mascota ordenadas por nombre");
        Collections.sort(gente, ComparadorPersona.compararNombres);
        for (Persona aux : gente) {
            System.out.println(aux);
        }
    }

}
