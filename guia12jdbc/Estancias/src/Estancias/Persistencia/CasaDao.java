package Estancias.Persistencia;

import Estancias.Entidades.Casa;
import java.util.ArrayList;

/**
 *
 * @author Xhemanuelv
 */
public class CasaDao extends DAO {

    /**
     * Realiza una consulta y retorna una lista con sus resultados.
     * Recibe un MySQL query como string.
     * 
     * @param sql
     * @return
     * @throws Exception 
     */
    public ArrayList<Casa> consultaCasa(String sql) throws Exception {
        ArrayList<Casa> casas = new ArrayList();

        try {
            consultarBase(sql);
            while (resultado.next()) {
                Casa casa = new Casa();
                casa.setIdCasa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigoPostal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                //usar aux calendar para obtener datos de zona horaria
                casa.setFechaDesde(resultado.getDate(7).toLocalDate());
                casa.setFechaHasta(resultado.getDate(8).toLocalDate());
                casa.setTiempoMinimo(resultado.getInt(9));
                casa.setTiempoMaximo(resultado.getInt(10));
                casa.setPrecioHabitacion(resultado.getBigDecimal(11));
                casa.setTipoVivienda(resultado.getString(12));

                casas.add(casa);

            }

            desconectarBase();
            return casas;
        } catch (Exception e) {
            throw e;
        }

    }
}
