package relacionesjava.Entities;

import java.util.ArrayList;

/**
 *
 * @author Xhemanuelv
 */
public class Baraja {

    private ArrayList<Naipe> mazo = new ArrayList();

    public Baraja() {
    }

    public Baraja(ArrayList<Naipe> mazo) {
        this.mazo = mazo;
    }

    public ArrayList<Naipe> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Naipe> mazo) {
        this.mazo = mazo;
    }

    @Override
    public String toString() {
        return "Baraja{" + "mazo=" + mazo + '}';
    }

}
