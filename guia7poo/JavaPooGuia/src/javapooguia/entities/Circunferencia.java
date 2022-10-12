package javapooguia.entities;

/**
 *
 * @author xhemanuelv
 */
public class Circunferencia {

    private double radio;
    private double diametro;
    private double area;
    private double perimetro;

    public Circunferencia() {
    }

    public Circunferencia(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Circunferencia(double radio, double diametro, double area, double perimetro) {
        this.radio = radio;
        this.diametro = diametro;
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", diametro=" + diametro + ", area=" + area + ", perimetro=" + perimetro + '}';
    }

}
