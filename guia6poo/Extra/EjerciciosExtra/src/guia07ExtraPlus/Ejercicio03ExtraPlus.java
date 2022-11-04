package guia07ExtraPlus;

import guia07ExtraPlus.entities.Pass;
import guia07ExtraPlus.services.PassServices;

/**
 *
 * @author Xhemanuelv
 */
public class Ejercicio03ExtraPlus {
    
    public static void main(String[] args) {
        // pass
        Pass usr = new Pass("1234567890", "Emanuel", 37964886);
        PassServices passServ = new PassServices();
        passServ.menuPass(usr);
    }
    
}
