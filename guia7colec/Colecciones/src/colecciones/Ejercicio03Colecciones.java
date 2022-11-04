package colecciones;

import services.AlumnoService;

/**
 *
 * @author Xhemanuelv
 */
public class Ejercicio03Colecciones {

    public static void main(String[] args) {
        // Promedio de un alumno seleccionado, devuelto solo si existe el alumno en el arraylist
        
        AlumnoService alumnServ=new AlumnoService();
        alumnServ.agregarAlumno();
        alumnServ.notaFinal();
        alumnServ.clearDB();
    } 

}
