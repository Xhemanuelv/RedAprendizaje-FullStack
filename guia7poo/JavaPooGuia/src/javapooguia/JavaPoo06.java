package javapooguia;

import java.util.Scanner;
import javapooguia.entities.Cafetera;
import javapooguia.services.CafeteraServices;

/**
 *
 * @author Xhemanuelv
 */
public class JavaPoo06 {

    public static void main(String[] args) {
        // cafetera
        Scanner leer = new Scanner(System.in);

        CafeteraServices cafeserv = new CafeteraServices();
        Cafetera peabody = new Cafetera();
        System.out.println(peabody);
        cafeserv.llenarCafetera(peabody);
        System.out.println(peabody);
        cafeserv.servirTaza(peabody);
        System.out.println(peabody);
        cafeserv.vaciarCafetera(peabody);
        System.out.println("Ingrese cuanto agregara de cafe(agua?)");
        int aguaCafe = leer.nextInt();
        cafeserv.agregarCafe(peabody, aguaCafe);
        System.out.println(peabody);

    }

}
