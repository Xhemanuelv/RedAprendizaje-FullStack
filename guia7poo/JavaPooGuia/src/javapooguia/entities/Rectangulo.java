/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooguia.entities;

/**
 *
 * @author Xhemanuelv
 */
public class Rectangulo {

    private int base;
    private int altura;
    private int area;
    private int perimetro;

    public Rectangulo() {
    }
    /**
     * constructor necesario para creacion de rectangulo
     * @param base
     * @param altura 
     */
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(int base, int altura, int area, int perimetro) {
        this.base = base;
        this.altura = altura;
        this.area = area;
        this.perimetro = perimetro;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", area=" + area + ", perimetro=" + perimetro + '}';
    }

}
