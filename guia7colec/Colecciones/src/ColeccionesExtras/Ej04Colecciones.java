package ColeccionesExtras;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Xhemanuelv
 */
public class Ej04Colecciones {

    /**
     * Almacena en un HashMap los códigos postales de 10 ciudades a elección de
     * esta página: https://mapanet.eu/index.htm. Nota: Poner el código postal
     * sin la letra, solo el numero. • Pedirle al usuario que ingrese 10 códigos
     * postales y sus ciudades. • Muestra por pantalla los datos introducidos •
     * Pide un código postal y muestra la ciudad asociada si existe sino avisa
     * al usuario. • Muestra por pantalla los datos • Agregar una ciudad con su
     * código postal correspondiente más al HashMap. • Elimina 3 ciudades
     * existentes dentro del HashMap, que pida el usuario. • Muestra por
     * pantalla los datos
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Map<Integer, String> codPostal = new HashMap();

        codPostal.put(1234, "Mendoza");
        codPostal.put(1734, "Salta");
        codPostal.put(1294, "Cordoba");
        codPostal.put(9234, "Buenos Aires");
        codPostal.put(5234, "Neuquen");
        codPostal.put(6234, "Jujuy");
        codPostal.put(3234, "Catamarca");
        codPostal.put(8234, "San Juan");
        codPostal.put(1284, "La Rioja");
        codPostal.put(7234, "Santa Fe");

        for (Map.Entry<Integer, String> entry : codPostal.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(value + " Cod postal :" + key);

        }
        System.out.println("Ingrese el codigo postal a buscar sin la letra");
        int mostrarCiudad = leer.nextInt();
        if (codPostal.containsKey(mostrarCiudad)) {
            for (Map.Entry<Integer, String> entry : codPostal.entrySet()) {
                Integer key = entry.getKey();
                String value = entry.getValue();
                if (entry.getKey() == mostrarCiudad) {
                    System.out.println(value + " Cod postal :" + key);
                }
            }
        } else {
            System.out.println("La ciudad no se encuentra cargada");
        }

        System.out.println("Ingrese una ciudad a añadir");
        String city = leer.next();
        System.out.println("Ingrese el codigo postal sin la letra");
        int codPos = leer.nextInt();
        codPostal.put(codPos, city);
        int aux = 0;
        codPostal.entrySet().forEach((entry) -> {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(value + " Cod postal :" + key);
        });
        System.out.println("Se quitaran de la lista 3 ciudadades");
        do {
            System.out.println("Ingrese el codigo postal de una ciudad a quitar");
            codPos = leer.nextInt();
            if (codPostal.containsKey(codPos)) {
                codPostal.remove(codPos);
                aux++;
                System.out.println("Ciudad removida");
            }else {
                System.out.println("La ciudad no se encuentra");
            }
        } while (aux < 3);
        codPostal.entrySet().forEach((entry) -> {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(value + " Cod postal :" + key);
        });
    }

}
