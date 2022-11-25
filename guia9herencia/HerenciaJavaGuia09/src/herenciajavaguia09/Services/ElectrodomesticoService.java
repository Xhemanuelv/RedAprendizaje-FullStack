package herenciajavaguia09.Services;

import herenciajavaguia09.Entities.Electrodomestico;
import herenciajavaguia09.Interfaces.ElectrodomesticoInterface;
import java.util.Scanner;

/**
 *
 * @author Xhemanuelv
 */
public class ElectrodomesticoService implements ElectrodomesticoInterface {

    /**
     * Que flojera escribir esto siempre XD
     */
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * protected Float precio; protected String color; protected char
     * eficienciaEnergetica; protected Float peso;
     *
     * @return
     */
    @Override
    public Electrodomestico crearElectrodomestico() {

        System.out.println("Ingrese el color");
        float precioBase = 1000f;
        String color = leer.next();
        if (comprobarColor(color)) {

        } else {
            color = "Blanco";
        }
        System.out.println("Ingrese la eficiencia");
        char letraEficiencia = leer.next().toUpperCase().charAt(0);

        if (comprobarEficiencia(letraEficiencia)) {

        } else {
            letraEficiencia = 'F';
        }
        System.out.println("Ingrese el peso");
        Float pesoFloat = leer.nextFloat();
        return new Electrodomestico(precioBase, color, letraEficiencia, pesoFloat);
    }

    @Override
    public boolean comprobarColor(String color) {
        //permitidos blanco, negro, rojo, azul y gris.
        return (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris"));
    }

    @Override
    public boolean comprobarEficiencia(char eficiencia) {
        return (eficiencia == 'A' || eficiencia == 'B' || eficiencia == 'C' || eficiencia == 'D' || eficiencia == 'E');
    }

    /**
     * Calcula el precio final del producto en base a eficiencia y peso
     *
     * @param artifact
     */
    @Override
    public void precioFinal(Electrodomestico artifact) {
        switch (artifact.getEficienciaEnergetica()) {
            case 'A' ->
                artifact.setPrecio(artifact.getPrecio() + 1000);
            case 'B' ->
                artifact.setPrecio(artifact.getPrecio() + 800);
            case 'C' ->
                artifact.setPrecio(artifact.getPrecio() + 600);
            case 'D' ->
                artifact.setPrecio(artifact.getPrecio() + 500);
            case 'E' ->
                artifact.setPrecio(artifact.getPrecio() + 300);
            default ->
                artifact.setPrecio(artifact.getPrecio() + 100);
        }

        if (artifact.getPeso() >= 80) {
            artifact.setPrecio(artifact.getPrecio() + 1000);
        } else if (artifact.getPeso() < 80 && artifact.getPeso() >= 50) {
            artifact.setPrecio(artifact.getPrecio() + 800);
        } else if (artifact.getPeso() < 50 && artifact.getPeso() >= 20) {
            artifact.setPrecio(artifact.getPrecio() + 500);
        } else if (artifact.getPeso() < 20 && artifact.getPeso() >= 1) {
            artifact.setPrecio(artifact.getPrecio() + 100);
        }

    }

    /**
     * Sobrecarga de precioFinal para usar con lavadora
     *
     * @param artifact
     * @param cargaLavadora
     */
    @Override
    public void precioFinal(Electrodomestico artifact, Float cargaLavadora) {
        precioFinal(artifact);
    }

    /**
     * Sobrecarga de precioFinal para usar con Televisor
     *
     * @param artifact
     * @param tdt
     * @param tamanioPulgadas
     */
    @Override
    public void precioFinal(Electrodomestico artifact, boolean tdt, float tamanioPulgadas) {
        precioFinal(artifact);
    }

}
