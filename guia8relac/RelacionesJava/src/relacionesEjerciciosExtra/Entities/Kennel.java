package relacionesEjerciciosExtra.Entities;

import java.util.ArrayList;
import relacionesjava.Entities.Perro;
import relacionesjava.Entities.Persona;

/**
 *
 * @author Xhemanuelv
 */
public class Kennel {

    private ArrayList<Persona> buscanPerros = new ArrayList();
    private ArrayList<Perro> buscanDuenio = new ArrayList();

    public Kennel() {
    }

    public Kennel(ArrayList<Persona> buscanPerros, ArrayList<Perro> buscanDuenio) {
        this.buscanPerros = buscanPerros;
        this.buscanDuenio = buscanDuenio;
    }

    public ArrayList<Persona> getBuscanPerros() {
        return buscanPerros;
    }

    public void setBuscanPerros(ArrayList<Persona> buscanPerros) {
        this.buscanPerros = buscanPerros;
    }

    public ArrayList<Perro> getBuscanDuenio() {
        return buscanDuenio;
    }

    public void setBuscanDuenio(ArrayList<Perro> buscanDuenio) {
        this.buscanDuenio = buscanDuenio;
    }

    @Override
    public String toString() {
        return "Kennel{" + "buscanPerros=" + buscanPerros +"\n"+  "       buscanDuenio=" + buscanDuenio + '}';
    }

}
