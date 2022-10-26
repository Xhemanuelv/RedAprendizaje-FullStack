package entities;

import java.util.ArrayList;

/**
 *
 * @author Xhemanuelv
 */
public class Alumno {

    private String nameStudent;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Alumno() {
    }

    public Alumno(String nameStudent, ArrayList<Integer> grades) {
        this.nameStudent = nameStudent;
        this.grades = grades;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public Integer getGrades(int i) {
        return grades.get(i);
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nameStudent=" + nameStudent + ", grades=" + grades + '}';
    }

}
