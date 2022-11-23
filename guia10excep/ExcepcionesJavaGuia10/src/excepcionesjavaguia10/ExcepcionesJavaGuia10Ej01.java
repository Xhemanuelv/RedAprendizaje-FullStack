package excepcionesjavaguia10;

import excepcionesjavaguia10.Entities.Persona;
import excepcionesjavaguia10.Services.PersonaServices;

/**
 *
 * @author Xhemanuelv
 */
public class ExcepcionesJavaGuia10Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaServices perServ = new PersonaServices();
        
        Persona johnCena = null;

        try {
            perServ.mayoriaEdad(johnCena);
        } catch (NullPointerException e) {
            System.out.println("No se puede acceder al objeto deseado, el mismo se encuentra vacio");
            Throwable fillInStackTrace = e.fillInStackTrace();
            System.out.println(fillInStackTrace);
        } catch (Exception e) {
            System.out.println("Si ve este mensaje contacte a soporte tecnico");
        }

    }

}
