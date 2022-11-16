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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void Alimentarse() {
        System.out.println(alimento);
    }

    @Override
    public String hacerRuido() {
        return ruido;
    }

}
