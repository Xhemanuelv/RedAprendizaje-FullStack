package herenciajavaguia09.Services;

import herenciajavaguia09.Entities.Electrodomestico;
import herenciajavaguia09.Entities.Lavadora;

/**
 *
 * @author Xhemanuelv
 */
public class LavadoraService extends ElectrodomesticoService {
    
    public Lavadora creaLavadora() {
        Electrodomestico father = crearElectrodomestico();
        System.out.println("Ingrese carga maxima lavadora");
        Float cargaMaxima = leer.nextFloat();
        precioFinal(father, cargaMaxima);
        
        return new Lavadora(father.getPrecio(), father.getColor(), father.getEficienciaEnergetica(), father.getPeso(), cargaMaxima);
    }
    
    /**
     * Override precioFinal Lavadora
     * @param artifact
     * @param cargaLavadora 
     */
    @Override
    public void precioFinal(Electrodomestico artifact, Float cargaLavadora) {
        super.precioFinal(artifact, cargaLavadora);
        if (cargaLavadora > 30) {
            artifact.setPrecio(artifact.getPrecio() + 500);
        }
    }
    
}
