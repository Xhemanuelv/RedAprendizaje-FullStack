package relacionesjava.Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import relacionesjava.Entities.Baraja;
import relacionesjava.Entities.Naipe;
import relacionesjava.Utilities.ComparadorPalos;

/**
 *
 * @author Xhemanuelv
 */
public class BarajaService {

    private ArrayList<Naipe> monton = new ArrayList();

    /**
     * Forma la baraja
     *
     * @return Baraja de naipes
     */
    public Baraja creaBaraja() {
        ArrayList<Naipe> auxBaraja = new ArrayList();
        String[] palo = {"Oro", "Espada", "Copa", "Basto"};

        for (int i = 1; i < 13; i++) {// valor carta

            for (int j = 0; j < 4; j++) {//posicion vector palo
                if (i != 8 && i != 9) {
                    Naipe carta = new Naipe(palo[j], (i));
                    auxBaraja.add(carta);
                }
            }
        }

//        for (Naipe auxBaraja1 : auxBaraja) {
//            System.out.println(auxBaraja1);
//        }
        return new Baraja(auxBaraja);
    }
    
    /**
     * Barajar el mazo
     * @param mazo 
     */
    public void barajarMazo(Baraja mazo){
        System.out.println("Se barajo el mazo");
        Collections.shuffle(mazo.getMazo());
    }

    /**
     * Muestra N° naipes disponibles
     *
     * @param mazo
     */
    public void cartasDisponibles(Baraja mazo) {
        System.out.println("En el mazo quedan " + mazo.getMazo().size() + " cartas para repartir");
    }

    /**
     * Muestra siguiente carta y la retorna  como Naipe
     *
     * @param mazo
     * @return Naipe
     */
    public Naipe siguienteCarta(Baraja mazo) {
        Naipe cartaSiguiente = mazo.getMazo().get(0);
        return cartaSiguiente;
    }

    /**
     * Reparte X cartas
     *
     * @param mazo
     */
    public void darCartas(Baraja mazo) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Elija cuantas cartas repartira");
        int x = leer.nextInt();
        boolean hayCartas = mazo.getMazo().isEmpty(), haySuficientes = mazo.getMazo().size() >= x;
        //   TRUE               FALSE
        if (haySuficientes && !hayCartas) {
            for (int i = 0; i < x; i++) {
                monton.add(mazo.getMazo().get(i));
                mazo.getMazo().remove(i);
            }
        }
        /*
        Iterator<Naipe> itBaraja = mazo.getMazo().iterator();
        System.out.println("Cartas repartidas :");
        while (itBaraja.hasNext()) {
            Naipe next = itBaraja.next();
            if (x==cont) {
                System.out.println(next);
                itBaraja.remove();
            }
            cont++;
        }*/
    }

    /**
     * Muestra las cartas que se repartieron
     * @param mazo usado para el private separar por palo
     */
    public void cartasMonton(Baraja mazo) {
        System.out.println("Cartas que se han retirado del mazo");
        for (Naipe naipeRepartido : monton) {
            System.out.println(naipeRepartido);
        }
        separarPorPalo(mazo);
    }

    /**
     * Muestra las cartas en la baraja
     *
     * @param mazo
     */
    public void mostrarBaraja(Baraja mazo) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (Naipe naipeEnMazo : mazo.getMazo()) {
            System.out.println(naipeEnMazo);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    private void separarPorPalo(Baraja mazo){
        Collections.sort(mazo.getMazo(), ComparadorPalos.separarPalos);
    }
}
