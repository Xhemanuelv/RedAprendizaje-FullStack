package relacionesEjerciciosExtra.Services;

import java.util.ArrayList;
import java.util.Scanner;
import relacionesEjerciciosExtra.Entities.Kennel;
import relacionesjava.Entities.Perro;
import relacionesjava.Entities.Persona;

/**
 *
 * @author Xhemanuelv
 */
public class KennelService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private Persona crearPersona() {
        System.out.println("Ingrese el nombre de la persona");
        String name = leer.next();
        return new Persona(name);
    }

    private ArrayList<Persona> creaListaPersonas() {
        ArrayList<Persona> quierenPerro = new ArrayList();
        System.out.println("Ingrese cuantas personas quieren un perro");
        var numPersonas = leer.nextInt();
        for (int i = 0; i < numPersonas; i++) {
            quierenPerro.add(crearPersona());
        }
        return quierenPerro;
    }

    private Perro crearPerro() {
        System.out.println("Ingrese nombre del perro");
        String dogName = leer.next();
        return new Perro(dogName);

    }

    private ArrayList<Perro> creaListaPerros() {
        ArrayList<Perro> perrosMascota = new ArrayList();
        System.out.println("Ingrese el numero de perros disponibles");
        var numPerros = leer.nextInt();
        for (int i = 0; i < numPerros; i++) {
            perrosMascota.add(crearPerro());
        }
        return perrosMascota;
    }

    private void mostrarPerros(ArrayList<Perro> perros) {
        System.out.println("Nombres de perros para adoptar");
        for (Perro perro : perros) {
            System.out.println(perro);
        }
    }

    private void mostrarPersonas(ArrayList<Persona> personas) {
        System.out.println("Lista de personas");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getMascota());
        }
    }

    private Kennel crearKennel() {
        ArrayList<Perro> buscanDuenio = creaListaPerros();
        ArrayList<Persona> buscanPerros = creaListaPersonas();
        return new Kennel(buscanPerros, buscanDuenio);
    }

    public void amigoFiel() {
        Kennel mundoPeludo = crearKennel();
        System.out.println(mundoPeludo);
        System.out.println("Seleccionen a su perro :");
        String perroElegido;
        boolean perroYaAdoptado = false;
        Perro enAdopcion = new Perro();
        if (mundoPeludo.getBuscanPerros().size() <= mundoPeludo.getBuscanDuenio().size()) {
            //perros para todos
            for (Persona personas : mundoPeludo.getBuscanPerros()) {
                System.out.println("Le toca elegir perro a " + personas.getNombre());
                do {
                    System.out.println("Elija alguno de estos perros :");
                    for (Perro perros : mundoPeludo.getBuscanDuenio()) {
                        if (!perros.isAdoptado()) {
                            System.out.println(perros.getNombre());
                        }
                    }
                    System.out.println("");
                    perroElegido = leer.next();
                    for (Perro perros : mundoPeludo.getBuscanDuenio()) {
                        if (perros.getNombre().equalsIgnoreCase(perroElegido)) {

                            if (perros.isAdoptado()) {
                                System.out.println("Ese perro ya fue adoptado");
                                perroYaAdoptado = true;
                            } else {
                                perroYaAdoptado = false;
                                personas.setMascota(perros);
                                perros.setAdoptado(true);
                                System.out.println("Felicidades para usted y su nueva mascota");
                            }

                        } else {
                            System.out.println("Ese perro no estaba en la lista");
                        }
                    }
                } while (perroYaAdoptado);

            }
        } 
        System.out.println(mundoPeludo);
    }

}
