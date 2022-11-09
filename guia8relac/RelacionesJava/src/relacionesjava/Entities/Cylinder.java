package relacionesjava.Entities;

import java.util.ArrayList;

/**
 *
 * @author Xhemanuelv
 */
public class Cylinder {

    private ArrayList<Object> cylinder = new ArrayList();

    public Cylinder() {
    }

    public Cylinder(ArrayList<Object> ammo) {
        this.cylinder = ammo;
    }

    public ArrayList<Object> getCylinder() {
        return cylinder;
    }

    public void setCylinder(ArrayList<Object> cylinder) {
        this.cylinder = cylinder;
    }

    @Override
    public String toString() {
        return "cylinder=" + cylinder;
    }

}
