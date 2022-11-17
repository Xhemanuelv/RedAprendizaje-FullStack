package herenciajavaguia09.Entities;

import herenciajavaguia09.Interfaces.RuidoAnimal;

/**
 *
 * @author Xhemanuelv
 */
public class Animal implements RuidoAnimal {

    protected String name;
    protected String alimento;
    protected Integer edad;
    protected String raza;
    protected String ruido = "Hola";

    public Animal() {
    }

    protected Animal(String name, String alimento, Integer edad, String raza) {
        this.name = name;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getAlimento() {
        return alimento;
    }

    protected void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    protected Integer getEdad() {
        return edad;
    }

    protected void setEdad(Integer edad) {
        this.edad = edad;
    }

    protected String getRaza() {
        return raza;
    }

    protected void setRaza(String raza) {
        this.raza = raza;
    }

    public void Alimentarse() {
        System.out.println(alimento);
    }

    @Override
    public String hacerRuido() {
        return ruido;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", alimento=" + alimento + ", edad=" + edad + ", raza=" + raza + ", ruido=" + ruido + '}';
    }

}
