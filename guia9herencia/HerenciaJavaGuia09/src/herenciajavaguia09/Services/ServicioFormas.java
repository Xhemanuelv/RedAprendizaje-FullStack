package herenciajavaguia09.Services;

import herenciajavaguia09.Entities.Circulo;
import herenciajavaguia09.Entities.Rectangulo;
import herenciajavaguia09.Interfaces.CalculoFormas;
import java.util.Scanner;

/**
 *
 * @author Xhemanuelv
 */
public class ServicioFormas implements CalculoFormas {

    public void calcularFormas() {
        calcularCirculo();
        calculoRectangulo();
    }

    @Override
    public Rectangulo calculoRectangulo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Calculo de rectangulo");
        System.out.println("Ingrese la base");
        float base = leer.nextFloat();
        System.out.println("Ingrese la altura");
        float alt = leer.nextFloat();
        float area, perimetro;
        area = base * alt;
        perimetro = (base + alt) * 2;
        System.out.println("El area del rectangulo es:" + area);
        System.out.println("El perimetro del rectangulo es:" + perimetro);
        Rectangulo rec = new Rectangulo(base, alt, perimetro, area);
        System.out.println(rec);
        return rec;
    }

    @Override
    public Circulo calcularCirculo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Calculo de un circulo");
        System.out.println("Ingrese el radio");
        float rad = leer.nextFloat();
        float area, perimetro;

        area = (float) (Math.pow(rad, 2) * Math.PI);
        perimetro = (float) (Math.PI * (rad * 2));
        System.out.println("El area del circulo es :" + area);
        System.out.println("El perimetro del circulo es :" + perimetro);
        Circulo cir = new Circulo(rad, area, perimetro);
        cir.setDiametro(rad*2);
        System.out.println(cir);
        return cir;
    }

}
