package javapooguia.services;

import java.util.Scanner;
import javapooguia.entities.Circunferencia;

/**
 *
 * @author xhemanuelv
 */
public class CircunferenciaServices {

    public Circunferencia crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia");
        double rad = leer.nextDouble();
        double diam = rad * 2;
        return new Circunferencia(rad, diam);
    }

    public void area(Circunferencia circulo) {
        double areaCirculo = Math.PI * circulo.getRadio() * circulo.getRadio();
        circulo.setArea(areaCirculo);
    }

    public void perimetro(Circunferencia circulo) {
        double perimetroCirculo = 2 * Math.PI * circulo.getRadio();
        circulo.setPerimetro(perimetroCirculo);
    }

}
