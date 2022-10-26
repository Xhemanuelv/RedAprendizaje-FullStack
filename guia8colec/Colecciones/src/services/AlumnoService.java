package services;

import entities.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Xhemanuelv
 */
public class AlumnoService {

    private ArrayList<Alumno> curso = new ArrayList<>();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void agregarAlumno() {
        String salir;
        do {
            curso.add(crearAlumno());
            System.out.println("Desea agregar otro alumno S/N");
            salir = leer.next();
        } while (!salir.equalsIgnoreCase("n"));

    }

    private Alumno crearAlumno() {
        System.out.println("Ingrese el nombre del alumno");
        String name = leer.next();
        ArrayList<Integer> grades = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese nota n°" + (i + 1));
            int nota = leer.nextInt();
            grades.add(nota);
        }
        return new Alumno(name, grades);
    }

    public void notaFinal() {
        System.out.println("Ingrese el nombre del alumno a calcular promedio");
        String alumnoBuscado = leer.next();

        if (buscarAlumno(alumnoBuscado)) {
            System.out.printf("\nEl alumno %s tiene una nota final de %.2f \n", alumnoBuscado, promedioAlumno(alumnoBuscado));
            // System.out.println("El alumno " + alumnoBuscado + " tiene una nota final de " +promedioAlumno(alumnoBuscado));
        } else {
            System.out.println("No existe el alumno buscado");
        }
    }

    private boolean buscarAlumno(String buscarAlumno) {
        boolean bandera = false;
        for (Alumno aux : curso) {
            bandera = aux.getNameStudent().equalsIgnoreCase(buscarAlumno);

            if (bandera) {
                break;
            }
        }
        return bandera;
    }

    private float promedioAlumno(String buscarAlumno) {
        float nota = 0;
        for (Alumno auxCurso : curso) {
            if (auxCurso.getNameStudent().equalsIgnoreCase(buscarAlumno)) {
                nota = auxCurso.getGrades(0) + auxCurso.getGrades(1) + auxCurso.getGrades(2);
//                for (int i = 0; i < 3; i++) {
//                    nota+=auxCurso.getGrades(i);
//                }
            }
        }
        return (nota / 3);
    }

    public void clearDB() {
        curso.clear();
    }
}
