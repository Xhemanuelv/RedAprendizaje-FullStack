package guia07ExtraPlus.services;

import guia07ExtraPlus.entities.Triangulos;

/**
 *
 * @author Xhemanuelv
 */
public class TrianguloService {

    public Triangulos crearTriangulos() {
        int base = (int) (Math.random() * 20 + 1);
        int ladoIgual = (int) (Math.random() * 50 + 1);

        return new Triangulos(base, ladoIgual);
    }

    public void calculaAltTriang(Triangulos isoceles) {

        isoceles.setAltura(Math.sqrt(((Math.pow(isoceles.getLadoIgual(), 2) - (Math.pow(isoceles.getBase(), 2) / 4)))));
    }

    public void obtenerArea(Triangulos isoceles) {
        isoceles.setArea((isoceles.getBase() * isoceles.getAltura()) / 2);
    }

    public void obtenerPerimetro(Triangulos isoceles) {
        isoceles.setPerimetro((2 * isoceles.getLadoIgual()) + isoceles.getBase());
    }

    public void mostrarTrianguloMayor(Triangulos isoceles[]) {
        double areaMayor = 0;
        int posicionMayorTriangulo = 0;
        for (int i = 0; i < 4; i++) {
            if (areaMayor < isoceles[i].getArea()) {
                areaMayor = isoceles[i].getArea();
                posicionMayorTriangulo++;
            }
        }
        for (int i = 0; i < 4; i++) {
            if (areaMayor == isoceles[i].getArea()) {
                System.out.format("La mayor area : %.2f\n",areaMayor);
                System.out.println("Del triangulo n° " + (posicionMayorTriangulo + 1 + " cuyos datos son :"));
                System.out.println(isoceles[i]);
            }
        }

    }

}
