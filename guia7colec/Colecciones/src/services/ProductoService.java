package services;

import entities.Producto;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Xhemanuelv
 */
public class ProductoService {

    /**
     * El HashMap tendrá de llave el nombre del producto y de valor el precio.
     */
    private HashMap<Producto, Float> stock = new HashMap();
    private TreeMap<Producto, Float> sortedStock=new TreeMap();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Agrega un nuevo producto a stock
     */
    private void agregarStock() {
        Producto auxProd = new Producto();
        System.out.println("Ingrese el nombre del producto a agregar");
        String prodName = leer.next();
        auxProd.setProduct(prodName);
        if (!stock.containsKey(auxProd)) {
            System.out.println("Ingrese el precio del producto");
            Float auxPrice = leer.nextFloat();
            stock.put(auxProd, auxPrice);
        } else if (stock.containsKey(auxProd)) {
            System.out.println("El producto ya se encuentra cargado, modifique su precio con la opcion adecuada");
        } else {
            System.out.println("Contacte a soporte si esta viendo esto");
        }

    }

    /**
     * Modifica el precio de un producto si este existe o notifica si no se
     * encontro en stock
     */
    private void modificarPrecioProducto() {
        Producto auxProd = new Producto();
        System.out.println("Ingrese el producto a modificar");
        String prodName = leer.next();
        auxProd.setProduct(prodName);
        if (stock.containsKey(auxProd)) {
            System.out.println("Ingrese el precio del producto");
            Float auxPrice = leer.nextFloat();
            stock.put(auxProd, auxPrice);
            System.out.println("Precio cambiado adecuadamente");
        } else {
            System.out.println("El producto no se encuentra en inventario, agregelo primero");
        }
    }

    /**
     * Eliminar un producto de Hashmap stock
     */
    private void quitarDeStock() {
        Producto auxProd = new Producto();
        System.out.println("Ingrese el producto a remover");
        String prodName = leer.next();
        auxProd.setProduct(prodName);
        if (stock.containsKey(auxProd)) {
            System.out.println("El producto fue removido exitosamente");
            stock.remove(auxProd);
        } else {
            System.out.println("El producto ingresado no se encuentra en inventario");
        }
    }

    /**
     * Muestra los productos actuales en Hashmap stock
     */
    private void mostrarProductosStock() {
        System.out.println("");
        System.out.println("Lista de productos y sus precios :");
        stock.keySet().forEach((Producto aux) -> {
            Object key = aux.toString();
            Object value = stock.get(aux);
            System.out.println(key + " " + "$" + value);
        });
        System.out.println("");
    }
    
    private void mostrarProductosOrdenados(){
        sortedStock.putAll(stock);
        System.out.println("");
        System.out.println("Lista de productos ordenados y sus precios :");
        sortedStock.keySet().forEach((Producto aux)->{
            Object key = aux.toString();
            Object value = sortedStock.get(aux);
            System.out.println(key + " " + "$" + value);
        });
        System.out.println("");
    }

    /**
     * Busca productos de cierto precio y los muestra por pantalla, si no se
     * encuentra informa al usuario
     */
    private void mostrarProductosPorPrecioSimilar() {
        System.out.println("");
        System.out.println("Ingrese el precio que desea buscar");
        Float priceProd = leer.nextFloat();
        if (stock.containsValue(priceProd)) {
            System.out.println("Lista de productos al precio buscado :");
            stock.keySet().forEach((Producto aux) -> {
                Object key = aux.toString();
                Object value = stock.get(aux);
                if (Objects.equals(priceProd, value)) {
                    System.out.println(key + " " + "$" + value);
                }
            });
        } else {
            System.out.println("No se encontro ningun producto con ese precio");
        }
        System.out.println("");
    }

    /**
     * Administrar productos y precios de productos en venta
     */
    public void appTienda() {
        int selector;
        do {
            System.out.println("1 - Agregar un producto");
            System.out.println("2 - Modificar precio producto");
            System.out.println("3 - Quitar un producto");
            System.out.println("4 - Mostrar productos y precios cargados ");
            System.out.println("5 - Mostrar productos por precio");
            System.out.println("6 - Mostrar productos ordenados");
            System.out.println("7 - Salir");
            selector = leer.nextInt();
            switch (selector) {
                case 1:
                    agregarStock();
                    break;
                case 2:
                    modificarPrecioProducto();
                    break;
                case 3:
                    quitarDeStock();
                    break;
                case 4:
                    mostrarProductosStock();
                    break;
                case 5:
                    mostrarProductosPorPrecioSimilar();
                    break;
                case 6:
                    mostrarProductosOrdenados();
                    break;
                case 7:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Ingreso invalido");
            }
        } while (selector != 7);

    }
}
