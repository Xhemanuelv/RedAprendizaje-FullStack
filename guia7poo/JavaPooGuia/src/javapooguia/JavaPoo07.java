package javapooguia;

import javapooguia.entities.Persona;
import javapooguia.services.PersonaServices;

/**
 *
 * @author xhemanuelv
 */
public class JavaPoo07 {

    public static void main(String[] args) {
        // Persona

        PersonaServices perServ = new PersonaServices();
        // public Persona(String nombre, int edad, String sexo, Date fechaNacimiento, float peso, float altura)
        Persona joe = new Persona("Marcos", 12, "H", 85.2f, 1.78f);
        Persona jane = new Persona("Noelia", 27, "M", 65.3f, 1.68f);
        Persona trent = new Persona("Arthur", 32, "O", 107.8f, 1.98f);
        Persona lucy = new Persona("Emanuel", 28, "H", 59.8f, 1.74f); //perServ.crearPersona();

        Object Persona[] = {joe, jane, trent, lucy};
        for (int i = 0; i < 4; i++) {
            //System.out.println(Persona[i]);
            perServ.calcularIMC((Persona) Persona[i]);
        }

        /*
        perServ.calcularIMC(joe);
        System.out.print(joe.getNombre() + " tiene ");
        if (joe.getIndiceMasaCorporal() < 0) {
            System.out.print(" bajo peso, IMC < 20\n");
        } else if (joe.getIndiceMasaCorporal() == 0) {
            System.out.print(" peso ideal, IMC entre 20 y 25\n");
        } else if (joe.getIndiceMasaCorporal() < 0) {
            System.out.print(" sobrepeso, IMC > 25\n");
        }
        System.out.print(jane.getNombre() + " tiene ");
        perServ.calcularIMC(jane);
        if (jane.getIndiceMasaCorporal() < 0) {
            System.out.print(" bajo peso, IMC < 20\n");
        } else if (jane.getIndiceMasaCorporal() == 0) {
            System.out.print(" peso ideal, IMC entre 20 y 25\n");
        } else if (jane.getIndiceMasaCorporal() < 0) {
            System.out.print(" sobrepeso, IMC > 25\n");
        }
        System.out.print(trent.getNombre() + " tiene ");
        perServ.calcularIMC(trent);
        if (trent.getIndiceMasaCorporal() < 0) {
            System.out.print(" bajo peso, IMC < 20\n");
        } else if (trent.getIndiceMasaCorporal() == 0) {
            System.out.print(" peso ideal, IMC entre 20 y 25\n");
        } else if (trent.getIndiceMasaCorporal() < 0) {
            System.out.print(" sobrepeso, IMC > 25\n");
        }
        System.out.print(lucy.getNombre() + " tiene ");
        perServ.calcularIMC(lucy);
        if (lucy.getIndiceMasaCorporal() < 0) {
            System.out.print(" bajo peso, IMC < 20\n");
        } else if (lucy.getIndiceMasaCorporal() == 0) {
            System.out.print(" peso ideal, IMC entre 20 y 25\n");
        } else if (lucy.getIndiceMasaCorporal() < 0) {
            System.out.print(" sobrepeso, IMC > 25\n");
        }
        System.out.println();
         */
        for (int i = 0; i < 4; i++) {
            perServ.mayoriaEdad((Persona) Persona[i]);
            if (perServ.mayoriaEdad((Persona) Persona[i])) {
                System.out.println((Persona) Persona[i] + " es mayor de edad");
            } else {
                System.out.println(Persona[i] + " es menor de edad");
            }
        }
        /*
        perServ.mayoriaEdad(joe);
        if (joe.isMayorEdad()) {
            System.out.println(joe.getNombre() + " es mayor de edad");
        } else {
            System.out.println(joe.getNombre() + " es menor de edad");
        }
        perServ.mayoriaEdad(jane);
        if (jane.isMayorEdad()) {
            System.out.println(jane.getNombre() + " es mayor de edad");
        } else {
            System.out.println(jane.getNombre() + " es menor de edad");
        }
        perServ.mayoriaEdad(trent);
        if (trent.isMayorEdad()) {
            System.out.println(trent.getNombre() + " es mayor de edad");
        } else {
            System.out.println(trent.getNombre() + " es menor de edad");
        }
        perServ.mayoriaEdad(lucy);
        if (lucy.isMayorEdad()) {
            System.out.println(trent.getNombre() + " es mayor de edad");
        } else {
            System.out.println(trent.getNombre() + " es menor de edad");
        }
         */
        float porcentajeEdad;
        int counter = 0, underweight = 0, overweight = 0, ideal = 0;
        for (int i = 0; i < 4; i++) {
            if (i == 0 && joe.isMayorEdad()) {
                counter++;
            } else if (i == 1 && jane.isMayorEdad()) {
                counter++;
            } else if (i == 2 && trent.isMayorEdad()) {
                counter++;
            } else if (i == 3 && lucy.isMayorEdad()) {
                counter++;
            }
        }
        porcentajeEdad = (counter * 100) / 4;
        System.out.println("Un " + porcentajeEdad + "% es mayor de edad");
        for (int i = 0; i < 4; i++) {
            perServ.mayoriaEdad((Persona) Persona[i]);
        }
//        if (joe.getIndiceMasaCorporal() < 0) {
//            underweight++;
//        } else if (joe.getIndiceMasaCorporal() > 0) {
//            overweight++;
//        } else if (joe.getIndiceMasaCorporal() == 0) {
//            ideal++;
//        }
//
//        if (jane.getIndiceMasaCorporal() < 0) {
//            underweight++;
//        } else if (jane.getIndiceMasaCorporal() > 0) {
//            overweight++;
//        } else if (jane.getIndiceMasaCorporal() == 0) {
//            ideal++;
//        }
//
//        if (trent.getIndiceMasaCorporal() < 0) {
//            underweight++;
//        } else if (trent.getIndiceMasaCorporal() > 0) {
//            overweight++;
//        } else if (trent.getIndiceMasaCorporal() == 0) {
//            ideal++;
//        }
//
//        if (lucy.getIndiceMasaCorporal() < 0) {
//            underweight++;
//        } else if (lucy.getIndiceMasaCorporal() > 0) {
//            overweight++;
//        } else if (lucy.getIndiceMasaCorporal() == 0) {
//            ideal++;
//        }
        for (int i = 0; i < 4; i++) {
            double imc = perServ.calcularIMC((Persona) Persona[i]);
            if (imc > 25) {
                overweight++;
            } else if (imc < 20) {
                underweight++;
            } else if (imc >= 20 && imc <= 25) {
                ideal++;
            }
        }
        float idealPorcent = (ideal * 100) / 4;
        float overweightPorcent = (overweight * 100) / 4;
        float underweightPorcent = (underweight * 100) / 4;
        System.out.println("Poseen un peso ideal " + idealPorcent + "% de las personas evaluadas");
        System.out.println("Presentan bajo peso " + overweightPorcent + "% de las personas evaluadas");
        System.out.println("Presentan elevado peso " + underweightPorcent + "% de las personas evaluadas");

    }

}
