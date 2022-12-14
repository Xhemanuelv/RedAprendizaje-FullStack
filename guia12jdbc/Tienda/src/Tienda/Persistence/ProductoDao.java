package Tienda.Persistence;

import Tienda.Entities.Producto;

/**
 *
 * @author Xhemanuelv
 */
public class ProductoDao extends DAO{
    /**
     * Agrega un producto a la base de datos
     * 
     * @param producto
     * @throws Exception 
     */
    public void cargarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe ingresar un fabricante");
            }

            //String sql = "INSERT INTO fabricante (codigo,nombre) VALUES ('" + producto.getCodigo() + "','" + fabricante.getNombre() + "');";
            String sql = "INSERT INTO producto (codigo,nombre,precio,codigo_fabricante) VALUES('"+producto.getCodigo()+"','"+producto.getNombre()
                            +"','"+producto.getPrecio()+"','"+producto.getCodigo_fabricante()+"');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }

    }
    
    /**
     * Modifica un producto de la base de datos
     * 
     * @param producto
     * @throws Exception 
     */
    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe ingresar un fabricante");
            }

            String sql = "UPDATE fabricante SET " + "nombre='" + producto.getNombre() + "' WHERE codigo = '" + producto.getCodigo() + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Elimina un producto de la base de datos por nombre
     * 
     * @param nombre 
     * @throws java.lang.Exception 
     * @author Juan Leiva
     */
    public void eliminarProductoPorNombre(String nombre) throws Exception {
        try {
            if (nombre == null) {
                throw new Exception("Debe indicar el nombre del fabricante a eliminar");
            }
            

            String sql = "DELETE FROM  producto WHERE nombre = '" + nombre + "';";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Elimina un producto de la base de datos por codigo o id
     * 
     * @param iD 
     * @throws java.lang.Exception 
     */
    public void eliminarProductoPorID(int iD) throws Exception{
        try {
            String sql = "DELETE FROM producto WHERE codigo = '"+iD+"';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
}
