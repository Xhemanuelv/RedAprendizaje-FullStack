package Tienda.Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author Xhemanuelv
 */
public abstract class DAO {

    protected Connection coneccion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;

    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "personal";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";

    protected void conectarBase() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(DRIVER);
            String urlBaseDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            coneccion = DriverManager.getConnection(urlBaseDatos, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    }

    protected void desconectarBase() throws Exception {
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (coneccion != null) {
                coneccion.close();
            }
        } catch (SQLException e) {
            System.out.println("Error");
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

    protected void insertarModificarEliminar(String sql) throws SQLException, ClassNotFoundException, Exception {
        try {
            conectarBase();
            sentencia = coneccion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            coneccion.rollback();
            throw ex;
        } finally {
            desconectarBase();
        }
    }

    protected void consultarBase(String sql) throws Exception {
        try {
            conectarBase();
            sentencia = coneccion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (ClassNotFoundException | SQLException e) {
            desconectarBase();
            throw e;
        }
    }
}
