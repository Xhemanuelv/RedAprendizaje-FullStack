package javapooguia;

import javapooguia.entities.Rectangulo;
import javapooguia.services.RectanguloServices;

/**
 *
 * @author xhemanuelv
 */
public class JavaPoo04 {

    public static void main(String[] args) {
        // Rectangulo
        RectanguloServices rs = new RectanguloServices();
        Rectangulo longBox = rs.crearRectangulo();
        rs.areaRectangulo(longBox);
        rs.perimetroRectangulo(longBox);
        rs.dibujarRectangulo(longBox);
    }

}
