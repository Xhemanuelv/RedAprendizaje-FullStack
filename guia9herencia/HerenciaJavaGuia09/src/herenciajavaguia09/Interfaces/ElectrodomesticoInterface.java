package herenciajavaguia09.Interfaces;

import herenciajavaguia09.Entities.Electrodomestico;

/**
 *
 * @author Xhemanuelv
 */
public interface ElectrodomesticoInterface {

    public Electrodomestico crearElectrodomestico();

    public boolean comprobarColor(String Color);

    public boolean comprobarEficiencia(char eficiencia);

    public void precioFinal(Electrodomestico artifact);

    public void precioFinal(Electrodomestico artifact, Float cargaLavadora);

    public void precioFinal(Electrodomestico artifact, boolean tdt, float tamanioPulgadas);

}
