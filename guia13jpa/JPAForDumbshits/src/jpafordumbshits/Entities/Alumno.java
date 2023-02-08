package jpafordumbshits.Entities;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Xhemanuelv
 */
@Entity
public class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String surName;

    private LocalDate birtDate;

    private LocalDate courseStartDate;

    private LocalDate courseEnDate;

    public Alumno() {
    }

    public Alumno(String name, String surName, LocalDate birtDate, LocalDate courseStartDate, LocalDate courseEnDate) {
        this.name = name;
        this.surName = surName;
        this.birtDate = birtDate;
        this.courseStartDate = courseStartDate;
        this.courseEnDate = courseEnDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public LocalDate getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(LocalDate birtDate) {
        this.birtDate = birtDate;
    }

    public LocalDate getCourseStartDate() {
        return courseStartDate;
    }

    public void setCourseStartDate(LocalDate courseStartDate) {
        this.courseStartDate = courseStartDate;
    }

    public LocalDate getCourseEnDate() {
        return courseEnDate;
    }

    public void setCourseEnDate(LocalDate courseEnDate) {
        this.courseEnDate = courseEnDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", name=" + name + ", surName=" + surName + ", birtDate=" + birtDate + ", courseStartDate=" + courseStartDate + ", courseEnDate=" + courseEnDate + '}';
    }

}
