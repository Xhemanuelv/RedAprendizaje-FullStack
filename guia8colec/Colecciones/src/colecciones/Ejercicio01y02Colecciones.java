package colecciones;

import colecciones.utlilities.ComparadoresPerros;
import entities.Perros;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import services.PerroService;

/**
 *
 * @author Xhemanuelv
 */
public class Ejercicio01y02Colecciones {

    public static void main(String[] args) {
        // Razas perros
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Perros> razasPerros = new ArrayList();
        PerroService perrServ = new PerroService();
        String continuar;
        do {
            razasPerros.add(perrServ.agregarRaza());
            System.out.println("Desea continuar s/n");
            continuar = leer.next();
        } while (!continuar.equalsIgnoreCase("n"));
        //muestra las razas de perro sin ordenar
        perrServ.mostrarRazas(razasPerros);
        //Ejercicio 2
        System.out.println("Ingrese la raza a retirar");
        String razaQuitar = leer.next();

        if (perrServ.eliminarRaza(razasPerros, razaQuitar)) {
            System.out.println("Se elimino " + razaQuitar + " de la lista");
            Collections.sort(razasPerros, ComparadoresPerros.ordenarNombreDescendente);
            //muestra las razas ordenadas sin la raza quitada
            perrServ.mostrarRazas(razasPerros);
        } else {
            System.out.println("La raza no se encontraba en la lista");
            Collections.sort(razasPerros, ComparadoresPerros.ordenarNombreDescendente);
            //muestra las razas ordenadas 
            perrServ.mostrarRazas(razasPerros);
        }

    }

}
