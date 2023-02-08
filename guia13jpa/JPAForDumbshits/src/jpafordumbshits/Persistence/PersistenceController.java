

package jpafordumbshits.Persistence;

import jpafordumbshits.Entities.Alumno;

/**
 *
 * @author Xhemanuelv
 */
public class PersistenceController {

    AlumnoJpaController aluJpa =new AlumnoJpaController();

    public void cargarAlumno(Alumno alumno) {
        aluJpa.create(alumno);
    }
    
}
