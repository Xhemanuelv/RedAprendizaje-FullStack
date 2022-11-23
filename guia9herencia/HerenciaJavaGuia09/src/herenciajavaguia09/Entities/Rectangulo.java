package herenciajavaguia09.Entities;

/**
 *
 * @author Xhemanuelv
 */
public class Rectangulo {

    private float base;
    private float altura;
    private float perimetro;
    private float area;

    public Rectangulo(float base, float altura, float perimetro, float area) {
        this.base = base;
        this.altura = altura;
        this.perimetro = perimetro;
        this.area = area;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", perimetro=" + perimetro + ", area=" + area + '}';
    }

}
