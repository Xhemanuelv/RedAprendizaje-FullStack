package services;

import entities.Perros;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Xhemanuelv
 */
public class PerroService {

    public Perros agregarRaza() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Introducir nueva raza");
        String dogBreed = leer.next();
        return new Perros(dogBreed);
    }

    public void mostrarRazas(ArrayList<Perros> razas) {
        razas.forEach((raza) -> {
            System.out.println(raza.getRazaPerro());
        });
    }

    public boolean eliminarRaza(ArrayList<Perros> razas, String razaQuitar) {
        Iterator<Perros> it = razas.iterator();
        boolean removed=false;
        while (it.hasNext()) {
            Perros next = it.next();
            if (next.getRazaPerro().equalsIgnoreCase(razaQuitar)) {
                it.remove();
                removed=true;
            }else {
                removed=false;
            }
            
        }
        return removed;
    }
}
