package Tienda.Services;

import Tienda.Entities.Fabricante;
import Tienda.Persistence.FabricanteDao;
import java.util.Scanner;

/**
 *
 * @author Xhemanuelv
 */
public class FabricanteService {

    private FabricanteDao fabDAO = new FabricanteDao();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private Fabricante agregaFabricante() {
        System.out.println("Ingresar codigo Fabricante");
        int cod = leer.nextInt();
        System.out.println("Ingresar nombre Fabricante");
        String nombre = leer.next();
        return new Fabricante(cod, nombre);
       
    }
    
    public void ingresarFabricanteEnBD() throws Exception{
       Fabricante f1 = agregaFabricante();
       fabDAO.cargarFabricante(f1);
    }

}
