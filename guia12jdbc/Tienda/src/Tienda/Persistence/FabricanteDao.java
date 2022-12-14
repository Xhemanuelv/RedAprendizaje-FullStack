package Tienda.Persistence;

import Tienda.Entities.Fabricante;

/**
 *
 * @author Xhemanuelv
 */
public class FabricanteDao extends DAO {

    /**
     * Carga un fabricante BD
     * 
     * @param fabricante
     * @throws Exception 
     */
    public void cargarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe ingresar un fabricante");
            }

            String sql = "INSERT INTO fabricante (codigo,nombre) VALUES('" + fabricante.getCodigo() + "','" + fabricante.getNombre() + "');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }

    }

    /**
     * Modifica un fabricante BD
     * 
     * @param fabricante
     * @throws Exception 
     */
    public void modificarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe ingresar un fabricante");
            }

            String sql = "UPDATE fabricante SET " + "nombre='" + fabricante.getNombre() + "' WHERE codigo = '" + fabricante.getCodigo() + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Elimina Fabricante BD
     * 
     * @param nombre 
     */
    public void eliminarFabricantePorNombre(String nombre) {
        try {
            if (((String)nombre) == null) {
                throw new Exception("Debe indicar el fabricante a eliminar");
            }
            

            String sql = "DELETE FROM  fabricante WHERE nombre = '" + nombre + "'";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
        }
    }

}
