package colecciones;

import services.AlumnoService;

/**
 *
 * @author Xhemanuelv
 */
public class Ejercicio03Colecciones {

    public static void main(String[] args) {
        // TODO llamar metodos de clase servicio alumno ejercicio 03 colecciones
        
        AlumnoService alumnServ=new AlumnoService();
        alumnServ.agregarAlumno();
        alumnServ.notaFinal();
        alumnServ.clearDB();
    } 

}
