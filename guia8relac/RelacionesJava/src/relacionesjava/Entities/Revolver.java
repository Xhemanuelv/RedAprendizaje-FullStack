package relacionesjava.Entities;

import java.util.Arrays;
import relacionesjava.Enum.MarcaRevolver;

/**
 *
 * @author Xhemanuelv
 */
public class Revolver {

    //cylinder indica la carga del revolver 
    private Cylinder ammo;
    //enum de marca revolver, practicar uso enum agregando propiedades extra a cada uno
    private MarcaRevolver name;
    //obtiene lo que hay en cylinder despues de hacer un shuffle, recorriendolo hasta que se dispare
    private Object[] chambered;
    private int posBullet;

    public Revolver() {
    }
    
    /**
     * constructor para "ensamblar" el revolver
     * @param ammo un ArrayList de Object para aleatorizar la posicion de object Bullet y Blank
     * @param name contiene referencia a enum con calibre de arma y nombre seleccion aleatoria
     * @param chambered paso de objects de ammo a Object[]
     * @param posBullet la posicion actual del proyectil
     */
    public Revolver(Cylinder ammo, MarcaRevolver name, Object[] chambered,
            int posBullet) {
        this.ammo = ammo;
        this.name = name;
        this.chambered = chambered;
        this.posBullet = posBullet;
    }

    public Cylinder getAmmo() {
        return ammo;
    }

    public void setAmmo(Cylinder ammo) {
        this.ammo = ammo;
    }

    public MarcaRevolver getName() {
        return name;
    }

    public void setName(MarcaRevolver name) {
        this.name = name;
    }

    public Object[] getChambered() {
        return chambered;
    }

    public void setChambered(Object[] chambered) {
        this.chambered = chambered;
    }

    public int getPosBullet() {
        return posBullet;
    }

    public void setPosBullet(int posBullet) {
        this.posBullet = posBullet;
    }

    @Override
    public String toString() {
        return "Revolver{" + "ammo=" + ammo + ", name=" + name + ", chambered=" + Arrays.deepToString(chambered) + ", posBullet=" + posBullet + '}';
    }

}
