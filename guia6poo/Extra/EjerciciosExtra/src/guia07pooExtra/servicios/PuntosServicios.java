/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07pooExtra.servicios;

import guia07pooExtra.entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author xhemanuelv
 */
public class PuntosServicios {

    Scanner leer = new Scanner(System.in);

    public Puntos crearPuntos() {
        double x1, y1, x2, y2;
        System.out.println("Ingrese la coordenada x1");
        x1 = leer.nextDouble();
        System.out.println("Ingrese la coordenada x2");
        x2 = leer.nextDouble();
        System.out.println("Ingrese la coordenada y1");
        y1 = leer.nextDouble();
        System.out.println("Ingrese la coordenada y2");
        y2 = leer.nextDouble();

        return new Puntos(x1, y1, x2, y2);
    }

    public void calcularDistancia(Puntos a) {

    
        System.out.println("La distancia entre ambos coordenadas es: "+Math.sqrt(Math.pow((a.getX2() - a.getX1()), 2) + (Math.pow((a.getY2() - a.getY1()), 2) ) ) );

    
    System.out.println("La distancia entre ambos coordenadas es: "+Math.sqrt(Math.pow((a.getX2() - a.getX1()), 2) + (Math.pow((a.getY2() - a.getY1()), 2) ) ) );
    }

}
