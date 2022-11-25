package herenciajavaguia09.Services;

import herenciajavaguia09.Entities.Electrodomestico;
import herenciajavaguia09.Entities.Televisor;

/**
 *
 * @author Xhemanuelv
 */
public class TelevisorService extends ElectrodomesticoService {

    public Televisor crearTelevisor() {
        Electrodomestico father = crearElectrodomestico();
        System.out.println("Ingrese el tamaño del televisor en pulgadas");
        float screensize = leer.nextFloat();
        System.out.println("Tiene decodificador TDT? s/n");
        boolean tdtAbool = ('s' == leer.next().toLowerCase().charAt(0));
        System.out.println(tdtAbool);
        precioFinal(father, tdtAbool, screensize);
        return new Televisor(tdtAbool, screensize, father.getPrecio(), father.getColor(), father.getEficienciaEnergetica(), father.getPeso());
    }

    /**
     * Override precioFinal Televisor
     *
     * @param artifact
     * @param tdt
     * @param tamanioPulgadas
     */
    @Override
    public void precioFinal(Electrodomestico artifact, boolean tdt, float tamanioPulgadas) {
        super.precioFinal(artifact, tdt, tamanioPulgadas);
        if (tdt) {
            artifact.setPrecio(artifact.getPrecio() + 500);
        }

        if (tamanioPulgadas > 40) {
            artifact.setPrecio((float) 1.3 * artifact.getPrecio());
        }

    }

}
