package Personal.Entities;

import java.time.LocalDate;

/**
 *
 * @author Xhemanuelv
 */
public class Empleado {

    private int id_empleado;
    private String nombre;
    private String sexo_empleado;
    private LocalDate fecha_nacimiento;
    private LocalDate fecha_incorporacion;
    private float salario;
    private float comision;
    private String cargo;
    private String cod_jefe;
    private int id_depto;

    public Empleado() {
    }

    public Empleado(int id_empleado, String nombre, String sexo_empleado, LocalDate fecha_nacimiento, LocalDate fecha_incorporacion, float salario, float comision, String cargo, String cod_jefe, int id_depto) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.sexo_empleado = sexo_empleado;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_incorporacion = fecha_incorporacion;
        this.salario = salario;
        this.comision = comision;
        this.cargo = cargo;
        this.cod_jefe = cod_jefe;
        this.id_depto = id_depto;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo_empleado() {
        return sexo_empleado;
    }

    public void setSexo_empleado(String sexo_empleado) {
        this.sexo_empleado = sexo_empleado;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public LocalDate getFecha_incorporacion() {
        return fecha_incorporacion;
    }

    public void setFecha_incorporacion(LocalDate fecha_incorporacion) {
        this.fecha_incorporacion = fecha_incorporacion;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCod_jefe() {
        return cod_jefe;
    }

    public void setCod_jefe(String cod_jefe) {
        this.cod_jefe = cod_jefe;
    }

    public int getId_depto() {
        return id_depto;
    }

    public void setId_depto(int id_depto) {
        this.id_depto = id_depto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id_empleado=" + id_empleado + ", nombre=" + nombre + ", sexo_empleado=" + sexo_empleado + ", fecha_nacimiento=" + fecha_nacimiento + ", fecha_incorporacion=" + fecha_incorporacion + ", salario=" + salario + ", comision=" + comision + ", cargo=" + cargo + ", cod_jefe=" + cod_jefe + ", id_depto=" + id_depto + '}';
    }

}
