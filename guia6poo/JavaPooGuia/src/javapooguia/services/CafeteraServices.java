/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooguia.services;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import javapooguia.entities.Cafetera;

/**
 *
 * @author Xhemanuelv
 */
public class CafeteraServices {

    Scanner leer = new Scanner(System.in);

    public void llenarCafetera(Cafetera nespresso) {
        nespresso.setCapacidadActual(nespresso.getCapacidadMaxima());
    }

    public void servirTaza(Cafetera nespresso) {

        int taza, servir;
        do {
            System.out.println("Seleccione el tipo de taza a utilizar");
            System.out.println("1 - Taza chica(expresso)");
            System.out.println("2 - Taza mediana");
            System.out.println("3 - Taza grande");
            taza = leer.nextInt();
            switch (taza) {
                case 1:
                    //taza 60ml
                    servir = 60;
                    if ((nespresso.getCapacidadActual() - servir) < 0) {
                        System.out.println("No hay suficiente cafe para llenar la taza");
                        System.out.println("Se sirvio " + nespresso.getCapacidadActual() + "ml");
                        nespresso.setCapacidadActual(0);
                    } else {
                        nespresso.setCapacidadActual(nespresso.getCapacidadActual() - servir);
                    }
                    break;
                case 2:
                    //mug cafe largo 100ml a 220ml
                    servir = ThreadLocalRandom.current().nextInt(100, 220);
                    if ((nespresso.getCapacidadActual() - servir) < 0) {
                        System.out.println("No hay suficiente cafe para llenar la taza");
                        System.out.println("Se sirvio " + nespresso.getCapacidadActual() + "ml");
                        nespresso.setCapacidadActual(0);
                    } else {
                        nespresso.setCapacidadActual(nespresso.getCapacidadActual() - servir);
                    }
                    break;
                case 3:
                    //taza latte/capuchino 240ml 320ml
                    servir = ThreadLocalRandom.current().nextInt(240, 320);
                    if ((nespresso.getCapacidadActual() - servir) < 0) {
                        System.out.println("No hay suficiente cafe para llenar la taza");
                        System.out.println("Se sirvio " + nespresso.getCapacidadActual() + "ml");
                        nespresso.setCapacidadActual(0);
                    } else {
                        nespresso.setCapacidadActual(nespresso.getCapacidadActual() - servir);
                    }
                    break;
                default:
                    System.out.println("Entrada incorrecta");
                    break;
            }
        } while (taza == 0);

    }

    public void vaciarCafetera(Cafetera nespresso) {
        nespresso.setCapacidadActual(0);
        System.out.println("Cafetera vacia, capacidad actual " + nespresso.getCapacidadActual() + "ml");
    }

    public void agregarCafe(Cafetera nespresso, int cafe) {
        //agregar checkeo de capacidad maxima no exedida
        System.out.println("Se a agregado cafe");
        nespresso.setCapacidadActual(nespresso.getCapacidadActual() + cafe);
        System.out.println("Capacidad actual " + nespresso.getCapacidadActual() + "ml");
    }

}
