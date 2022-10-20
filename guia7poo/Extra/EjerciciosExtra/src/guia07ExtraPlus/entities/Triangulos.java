package guia07ExtraPlus.entities;

/**
 *
 * @author Xhemanuelv
 */
public class Triangulos {

    private int base;
    private int ladoIgual;
    private double altura;//alturah = √(ladoIgual2 – (base2/4))
    private double area;//area = ((base)(√ladoIgual2 – (base2/4)))/2

    private int perimetro; // 2*ladoIgual+base

    public Triangulos() {
    }

    public Triangulos(int base, int ladoIgual) {
        this.base = base;
        this.ladoIgual = ladoIgual;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getLadoIgual() {
        return ladoIgual;
    }

    public void setLadoIgual(int ladoIgual) {
        this.ladoIgual = ladoIgual;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
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
        return "Triangulos{" + "base=" + base + ", ladoIgual=" + ladoIgual + ", altura=" + altura + ", area=" + area + ", perimetro=" + perimetro + '}';
    }

}
