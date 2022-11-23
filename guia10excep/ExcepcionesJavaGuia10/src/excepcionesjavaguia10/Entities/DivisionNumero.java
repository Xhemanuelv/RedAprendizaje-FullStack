package excepcionesjavaguia10.Entities;

/**
 *
 * @author Xhemanuelv
 */
public class DivisionNumero {

    private int numeroUno;
    private int numeroDos;
    private double numeroUnoDivididonumeroDos;

    public DivisionNumero() {
    }

    public DivisionNumero(int numeroUno, int numeroDos) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }

    public int getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    public int getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }

    public double getNumeroUnoDivididonumeroDos() {
        return numeroUnoDivididonumeroDos;
    }

    public void setNumeroUnoDivididonumeroDos(double numeroUnoDivididonumeroDos) {
        this.numeroUnoDivididonumeroDos = numeroUnoDivididonumeroDos;
    }

    @Override
    public String toString() {
        return "DivisionNumero{" + "numeroUno=" + numeroUno + ", numeroDos=" + numeroDos + ", numeroUnoDivididonumeroDos=" + numeroUnoDivididonumeroDos + '}';
    }

}
