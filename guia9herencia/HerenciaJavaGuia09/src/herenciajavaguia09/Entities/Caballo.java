package herenciajavaguia09.Entities;

import herenciajavaguia09.Interfaces.RuidoAnimal;

/**
 *
 * @author Xhemanuelv
 */
public class Caballo extends Animal implements RuidoAnimal {

    public Caballo() {
    }

    public Caballo(String name, String alimento, Integer edad, String raza) {
        super(name, alimento, edad, raza);
    }

    @Override
    public String hacerRuido() {
        ruido="[HORSE NOISES]";
        return ruido;
    }

}
