package guia07pooExtra;

import guia07pooExtra.entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author xhemanuelv
 */
public class Guia07PooExtra01 {

    public static void main(String[] args) {
        // Cancion
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el titulo de la cancion");
        String theme=leer.nextLine();
        System.out.println("Ingrese el autor");
        String author=leer.nextLine();
        Cancion musicote=new Cancion(theme,author);
        System.out.println("Ingreso guardado, ha introducido");
        System.out.println(musicote);
        
    }

}
