/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07pooExtra;

import guia07pooExtra.entidades.Raices;
import guia07pooExtra.servicios.RaicesServicios;

/**
 *
 * @author xhemanuelv
 */
public class Guia07PooExtra03 {

    public static void main(String[] args) {
        // TODO code application logic here

        RaicesServicios rs = new RaicesServicios();
        Raices ecuacion2doGrado = rs.llenarParametros();
        
        rs.getDiscriminante(ecuacion2doGrado);
        rs.calcular(ecuacion2doGrado);
    }

}
