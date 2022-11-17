package herenciajavaguia09.Entities;

import herenciajavaguia09.Interfaces.RuidoAnimal;

/**
 *
 * @author Xhemanuelv
 */
public final class Perro extends Animal implements RuidoAnimal {

    public Perro() {
    }

    
    
    public Perro(String name, String alimento, Integer edad, String raza) {
        super(name, alimento, edad, raza);
    }

    @Override
    public String toString() {
        return "Perro"+"{"+"Nombre="+getName()+", Alimento="+getAlimento()+", Edad="+getEdad()+", Raza="+getRaza()+'}';
    }
    
    @Override
    public String hacerRuido() {
        ruido="Guau";
        return ruido;
    }
}
