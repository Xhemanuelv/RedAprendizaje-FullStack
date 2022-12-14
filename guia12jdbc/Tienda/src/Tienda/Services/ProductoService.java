package Tienda.Services;

import Tienda.Entities.Producto;
import Tienda.Persistence.ProductoDao;
import java.util.Scanner;

/**
 *
 * @author Xhemanuelv
 */
public class ProductoService {

    private ProductoDao proDAO = new ProductoDao();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Producto crearProducto(){
        System.out.println("Ingrese el codigo de producto");
        int idProducto=leer.nextInt();
        System.out.println("Ingrese el nombre de producto");
        String nomProd=leer.next();
        System.out.println("Ingrese el precio de producto");
        double precio=leer.nextDouble();
        System.out.println("Ingrese el codigo de fabricante del producto");
        int id_fabricante=leer.nextInt();
        return new Producto();
    }
}
