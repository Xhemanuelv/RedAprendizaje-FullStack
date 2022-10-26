package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Xhemanuelv
 */
public class ManosALaObra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        // Manos a la obra 1
        // Listas
        ArrayList<Integer> numerosA = new ArrayList();
        int x = 20;
        numerosA.add(x);
        for (int i = 0; i < 5; i++) {
            x = (int) (Math.random() * 20 + 1);
            numerosA.add(x);
        }
        System.out.println("ArrayList");
        numerosA.forEach((aux) -> {
            System.out.println(aux);
        });

        //Conjuntos
        HashSet<Integer> numerosB = new HashSet();
        int y = 20;
        numerosB.add(y);
        for (int i = 0; i < 5; i++) {
            y = (int) (Math.random() * 20 + 1);
            numerosB.add(y);
        }
        System.out.println("HashSet");
        numerosB.forEach((aux) -> {
            System.out.println(aux);
        });

        //Mapas
        
        HashMap<Integer, String> alumnos = new HashMap();
        int dni = 34576981;
        String nombreAlumno = "Pepe";
        alumnos.put(dni, nombreAlumno);
        for (int i = 0; i < 5; i++) {
            dni = (int) (Math.random() * 37964886 + 1);
            System.out.println("Ingrese el nombre del alumno");
            nombreAlumno = leer.next();
            alumnos.put(dni, nombreAlumno);

        }
        System.out.println("HashMap");
        System.out.println("Alumno y dni");
        alumnos.keySet().forEach((aux) -> {
            Object key = aux.toString();
            Object value = alumnos.get(aux);
            System.out.println(value + " " + key);
        });
        
        //Manos a la obra 2
        numerosA.remove(3);
        System.out.println("ArrayList despues de remover elemento");
        numerosA.forEach((aux) -> {
            System.out.println(aux);
        });
        numerosB.remove(20);// no permite repetidos
        System.out.println("HashSet despues de remover elemento");
        numerosB.forEach((aux) -> {
            System.out.println(aux);
        });
        alumnos.remove(34576981);//no permite repetidos, pero no puede identificarlos hay q enseñarle a diferenciarlos
        System.out.println("HashMap despues de remover elemento");
        System.out.println("Alumno y dni");
        alumnos.keySet().forEach((aux) -> {
            Object key = aux.toString();
            Object value = alumnos.get(aux);
            System.out.println(value + " " + key);
        });
    }

}
