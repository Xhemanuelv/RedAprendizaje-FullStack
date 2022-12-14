package Personal.Persistence;

import Personal.Entities.Empleado;

/**
 *
 * @author Xhemanuelv
 */
public final class EmpleadoDAO extends DAO {

    public void guardarEmpleado(Empleado johnDoe) throws Exception{
        try {
            if (johnDoe == null) {
                throw new Exception ("Debe indicar un empleado");
            }
          
            String sql= "INSERT INTO";
            
        } catch (Exception e) {
            throw e;
        }
    }
}
