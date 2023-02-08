package jpafordumbshits.Services;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import jpafordumbshits.Entities.Alumno;
import jpafordumbshits.Persistence.PersistenceController;

/**
 *
 * @author Xhemanuelv
 */
public class AlumnoServices {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private PersistenceController persistenceController = new PersistenceController();

    private Alumno crearAlumno() {

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("d MMM uuuu");
        System.out.println("Ingrese el nombre");
        String nombre = leer.next();
        System.out.println("Ingrese el apellido");
        String apellido = leer.next();
        System.out.println("Ingrese fecha nacimiento");
        System.out.println("Ingrese dia");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese año");
        int anio = leer.nextInt();
        LocalDate birthday = LocalDate.of(anio, mes, dia);
        System.out.println("Ingrese fecha inicio curso");
        System.out.println("Ingrese dia");
        dia = leer.nextInt();
        System.out.println("Ingrese mes");
        mes = leer.nextInt();
        System.out.println("Ingrese año");
        anio = leer.nextInt();
        LocalDate courseStart = LocalDate.of(anio, mes, dia);
        System.out.println("Ingrese fecha fin curso");
        System.out.println("Ingrese dia");
        dia = leer.nextInt();
        System.out.println("Ingrese mes");
        mes = leer.nextInt();
        System.out.println("Ingrese año");
        anio = leer.nextInt();
        LocalDate courseEnd = LocalDate.of(anio, mes, dia);

        return new Alumno(nombre, apellido, birthday, courseStart, courseEnd);
    }

    private void cargarAlumno(Alumno alumno) {
        persistenceController.cargarAlumno(alumno);
    }

    public void agregarAlumno() {
        Alumno aux = crearAlumno();
        cargarAlumno(aux);
    }

}
