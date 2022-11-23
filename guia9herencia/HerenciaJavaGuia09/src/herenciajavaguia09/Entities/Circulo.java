package herenciajavaguia09.Entities;

/**
 *
 * @author Xhemanuelv
 */
public class Circulo {

    private float radio;
    private float area;
    private float perimetro;
    private float diametro;

    public Circulo(float radio, float area, float perimetro) {
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }
    
    

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + ", diametro=" + diametro + '}';
    }

}
