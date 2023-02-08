package Tienda.Services;

import Tienda.Entities.Producto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Xhemanuelv
 */
public class ServicioTienda {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ProductoService prodServ = new ProductoService();
    private FabricanteService fabServ = new FabricanteService();

    public void menu() throws Exception {

        int selector;
        do {
            System.out.println("Seleccione la operacion deseada");
            System.out.println("1 - Lista el nombre de todos los productos que hay en la tabla producto.");
            System.out.println("2 - Lista los nombres y los precios de todos los productos de la tabla producto.");
            System.out.println("3 - Listar aquellos productos que su precio esté entre 120 y 202.");
            System.out.println("4 - Buscar y listar todos los Portátiles de la tabla producto.");
            System.out.println("5 - Listar el nombre y el precio del producto más barato.");
            System.out.println("6 - Ingresar un producto a la base de datos.");
            System.out.println("7 - Ingresar un fabricante a la base de datos.");
            System.out.println("8 - Editar un producto con datos a elección (no podra cambiar el codigo de producto).");
            System.out.println("9 - Salir");

            try {
                selector = leer.nextInt();
                String sql;
                switch (selector) {
                    case 1 -> prodServ.listarTodosLosProductosNombre();
                    case 2 -> prodServ.listarTodosLosProductosNombrePrecio();
                    case 3 -> {
                        sql = "SELECT * FROM producto where precio BETWEEN 120 AND 202;";
                        prodServ.productosCondicion(sql);
                    }
                    case 4 -> {
                        sql = "SELECT * FROM producto where nombre LIKE '%Portatil%';";
                        prodServ.productosCondicion(sql);
                    }
                    case 5 -> {
                        sql = "SELECT * FROM producto ORDER BY precio ASC LIMIT 1;";
                        prodServ.productosCondicion(sql);
                    }
                    case 6 -> {
                        sql = "SELECT * FROM producto;";
                        System.out.println("Productos Actuales");
                        prodServ.productosCondicion(sql);
                        prodServ.crearProducto();
                    }
                    case 7 -> {
                        System.out.println("Fabricantes actuales");
                        fabServ.listaFabricantes();
                        fabServ.ingresarFabricanteEnBD();
                        fabServ.listaFabricantes();
                    }
                    case 8 -> editarProducto();
                    case 9 -> {
                        System.out.println("Gracias por utilizar nuestros servicios");
                        System.out.println("Hasta pronto!");
                    }
                    default -> throw new AssertionError();
                }

            } catch (Exception e) {
                throw e;
            }
        } while (selector != 9);

    }

    private void editarProducto() throws Exception {
        String sql = "SELECT * FROM producto;";
        ArrayList<Producto> listaProductos = prodServ.productosCondicion(sql);
        System.out.println("Seleccione el codigo de producto a modificar");
        Producto modProducto = listaProductos.get(leer.nextInt());
        prodServ.modificarProducto(modProducto);
        prodServ.productosCondicion(sql);

    }

}
