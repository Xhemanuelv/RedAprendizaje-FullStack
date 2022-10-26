package entities;

/**
 *
 * @author Xhemanuelv
 */
public class Perros {

    private String razaPerro;

    public Perros() {
    }

    public Perros(String razaPerro) {
        this.razaPerro = razaPerro;
    }

    public String getRazaPerro() {
        return razaPerro;
    }

    public void setRazaPerro(String razaPerro) {
        this.razaPerro = razaPerro;
    }

    @Override
    public String toString() {
        return "Perro{" + "Raza=" + razaPerro + '}';
    }

}
