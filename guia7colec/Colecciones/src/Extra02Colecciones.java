
import Entities.CantanteFamoso;
import Services.CantanteFamService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Extra02Colecciones {

    public static void main(String[] args) {

        /**
         * Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes
         * famosos y tendrá como atributos el nombre y discoConMasVentas. Se
         * debe, además, en el main, crear una lista de tipo CantanteFamoso y
         * agregar 5 objetos de tipo CantanteFamoso a la lista. Luego, se debe
         * mostrar los nombres de cada cantante y su disco con más ventas por
         * pantalla. Una vez agregado los 5, en otro bucle, crear un menú que le
         * de la opción al usuario de agregar un cantante más, mostrar todos los
         * cantantes, eliminar un cantante que el usuario elija o de salir del
         * programa. Al final se deberá mostrar la lista con todos los cambios.
         */
        ArrayList<CantanteFamoso> cantantesFamosos = new ArrayList<>();
        CantanteFamService cantFserv = new CantanteFamService();
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            cantantesFamosos.add(cantFserv.agregarCantante());
        }

        Iterator<CantanteFamoso> it = cantantesFamosos.iterator();
        int select;
        do {
            System.out.println("1 - Agregar Cantantante famoso");
            System.out.println("2- Mostrar cantantes");
            System.out.println("3- Eliminar cantante");
            System.out.println("4- Salir");
            select = leer.nextInt();
            switch (select) {
                case 1:
                    cantantesFamosos.add(cantFserv.agregarCantante());
                    break;
                case 2:
                    cantFserv.mostrarCantantes(cantantesFamosos);
                    break;
                case 3:
                    cantFserv.eliminaCantante(cantantesFamosos);
                    break;
                case 4:
                    System.out.println("Hasta otra ocasion");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        } while (select != 4);

    }
}
