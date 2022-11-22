
package herenciajavaguia09;

import herenciajavaguia09.Entities.Lavadora;
import herenciajavaguia09.Entities.Televisor;
import herenciajavaguia09.Services.LavadoraService;
import herenciajavaguia09.Services.TelevisorService;

/**
 *
 * @author Xhemanuelv
 */
public class Guia09Ej02Herencia {

    
    public static void main(String[] args) {
        TelevisorService teleServ=new TelevisorService();
        LavadoraService lavaServ=new LavadoraService();
        Televisor tele=teleServ.crearTelevisor();
        Lavadora dora=lavaServ.creaLavadora();
        System.out.println(tele);
        System.out.println(dora);
    }

}
