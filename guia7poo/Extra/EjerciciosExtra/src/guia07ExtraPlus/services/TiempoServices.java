package guia07ExtraPlus.services;

import guia07ExtraPlus.entities.Tiempo;
import java.util.Scanner;

/**
 *
 * @author Xhemanuelv
 */
public class TiempoServices {

    public Tiempo ingresarHora() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las horas en formato 24 horas");
        int hora = leer.nextInt();
        int minutos, segundos;
        do {
            System.out.println("Ingrese los minutos");
            minutos = leer.nextInt();
            if (minutos > 60) {
                System.out.println("Una hora posee como maximo 60 minutos");
            }
        } while (minutos > 60);
        do {
            System.out.println("Ingrese los segundos");
            segundos = leer.nextInt();
            if (segundos > 60) {
                System.out.println("Un minuto posee como maximo 60 segundos");
            }
        } while (segundos > 60);

        return new Tiempo(hora,minutos,segundos);
    }
    public void imprimirHoraCompleta(Tiempo taim){
        System.out.println("La hora ingresada es :");
        System.out.println(taim.getHora()+":"+taim.getMinuto()+":"+taim.getSegundo());
    }
}
