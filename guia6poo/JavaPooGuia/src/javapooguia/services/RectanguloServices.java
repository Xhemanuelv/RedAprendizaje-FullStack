package javapooguia.services;

import java.util.Scanner;
import javapooguia.entities.Rectangulo;

/**
 *
 * @author Xhemanuelv
 */
public class RectanguloServices {

    public Rectangulo crearRectangulo() {
        Scanner leer = new Scanner(System.in)/*.useDelimiter("\n")*/;
        System.out.println("Creando un nuevo rectangulo");
        System.out.println("Ingrese la base del rectangulo");
        int b, h;
        do {
            b = leer.nextInt();
            if (b == 0) {
                System.out.println("La base del rectangulo no puede ser cero");
            }
        } while (b == 0);

        System.out.println("Ingrese la altura del rectangulo");
        do {
            h = leer.nextInt();
            if (h == 0) {
                System.out.println("La altura del rectangulo no puede ser cero");
            }
        } while (h == 0);

        return new Rectangulo(h, b);
    }

    public void areaRectangulo(Rectangulo pedro) {
        pedro.setArea(pedro.getBase() * pedro.getAltura());
    }

    public void perimetroRectangulo(Rectangulo pedro) {
        pedro.setPerimetro((pedro.getAltura() + pedro.getBase()) * 2);
    }

    public void dibujarRectangulo(Rectangulo pedro) {
        for (int i = 0; i < pedro.getBase(); i++) {
            for (int j = 0; j < pedro.getAltura(); j++) {
                //borde lateral
                if (j == 0 || j == (pedro.getAltura() - 1)) {
                    System.out.print("*");
                    //borde superior
                } else if (i == 0 && (j != 0 || j != (pedro.getAltura() - 1))) {
                    System.out.print("*");
                    //borde inferior
                } else if (i == pedro.getBase() - 1) {
                    System.out.print("*");
                    //espacios internos
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
