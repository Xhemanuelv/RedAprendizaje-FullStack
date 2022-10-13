package javapooguia.entities;

import java.util.Date;

/**
 *
 * @author xhemanuelv
 */
public class Persona12 {

    private String name;
    private Date birtday;

    public Persona12() {
    }

    public Persona12(String name, Date birtday) {
        this.name = name;
        this.birtday = birtday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirtday() {
        return birtday;
    }

    public void setBirtday(Date birtday) {
        this.birtday = birtday;
    }

    @Override
    public String toString() {
        return "Persona12{" + "name=" + name + ", birtday=" + birtday + '}';
    }

}
