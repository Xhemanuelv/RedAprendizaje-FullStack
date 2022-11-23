package herenciajavaguia09;

import herenciajavaguia09.Entities.Electrodomestico;
import herenciajavaguia09.Entities.Lavadora;
import herenciajavaguia09.Entities.Televisor;
import herenciajavaguia09.Services.LavadoraService;
import herenciajavaguia09.Services.TelevisorService;
import java.util.ArrayList;

/**
 *
 * @author Xhemanuelv
 */
public class Guia09Ej03Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodomestico> electroVenta = new ArrayList();
        TelevisorService teleServ = new TelevisorService();
        LavadoraService lavaServ = new LavadoraService();
        float precioTv = 0, precioLava = 0;
        electroVenta.add(teleServ.crearTelevisor());
        electroVenta.add(lavaServ.creaLavadora());
        electroVenta.add(teleServ.crearTelevisor());
        electroVenta.add(lavaServ.creaLavadora());

        for (Electrodomestico electroVenta1 : electroVenta) {
            if (electroVenta1 instanceof Lavadora) {
                precioLava = precioLava + electroVenta1.getPrecio();
            }
            if (electroVenta1 instanceof Televisor) {
                precioTv = precioTv + electroVenta1.getPrecio();
            }
        }

        System.out.println("Precio total electrodomesticos :" + (precioLava + precioTv));
        System.out.println("Precio TV :" + precioTv);
        System.out.println("Precio Lavadoras :" + precioLava);
    }

}
