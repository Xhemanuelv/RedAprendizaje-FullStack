package herenciajavaguia09.Entities;

import herenciajavaguia09.Interfaces.RuidoAnimal;

/**
 *
 * @author Xhemanuelv
 */
public class Gato extends Animal implements RuidoAnimal {

    public Gato() {
    }

    
    
    public Gato(String name, String alimento, Integer edad, String raza) {
        super(name, alimento, edad, raza);
    }

    @Override
    public String hacerRuido() {
        ruido="Miau";
        return ruido;
    }
}
