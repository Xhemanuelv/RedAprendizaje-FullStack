package guia07ExtraPlus.services;

import guia07ExtraPlus.entities.Fecha;
import java.util.Scanner;

/**
 *
 * @author Xhemanuelv
 */
public class FechaService {

    public void ingresarFecha(Fecha inptUsr) {
        Scanner leer = new Scanner(System.in);
        int dia, mes, anio;
        System.out.println("Ingrese el dia");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes = leer.nextInt();
        System.out.println("Ingrese el año");
        anio = leer.nextInt();
        // analizar con metodos independientes si son datos validos
        boolean pideDia;
        
        if (verificarAnio(anio)) {
            inptUsr.setAnio(anio);
        } else {
            System.out.println("Año ingresado invalido se usara el valor por defecto :" + inptUsr.getAnio());
        }
        inptUsr.setMes(mes);
        if (mes < 1 || mes > 12) {
            do {
                System.out.println("En la tierra los años poseen 12 meses, ingrese un mes valido");
                mes = leer.nextInt();
            } while (mes == 0 || mes > 12);
            inptUsr.setMes(mes);
        }
        if (verificarDiasMes(mes, dia, anio) && dia > 0) {
            inptUsr.setDia(dia);
        } else {

            do {
                System.out.println("Cantidad de dias incorrecta para el mes");
                System.out.println("Ingrese la cantidad adecuada para el mes");
                dia = leer.nextInt();
                pideDia=verificarDiasMes(mes, dia, anio);
            } while (!pideDia);
            inptUsr.setDia(dia);
        }

    }

    private boolean verificarAnio(int anio) {
        //check entre año default y actual
        return anio < 2023 && anio >= 1900;
    }

    private boolean verificarDiasMes(int mes, int dia, int anio) {
        /*1	Enero           31 días
    2	Febrero         28 días o 29 en año bisiesto
    3	Marzo           31 días
    4	Abril           30 días
    5	Mayo            31 días
    6	Junio           30 días
    7	Julio           31 días
    8	Agosto          31 días
    9	Septiembre	30 días
    10	Octubre         31 días
    11	Noviembre	30 días
    12	Diciembre	31 días
        31 = 1 3 5 7 8 10 12
        30 = 4 6 9 11
         */
        boolean diasMes;
        switch (mes) {
            case 1://enero
                diasMes = dia < 32 && dia > 0;
                break;
            case 2://febrero
                if (comprobarBisiesto(anio)) {
                    diasMes = dia < 30;
                } else {
                    diasMes = dia < 29;
                }
                break;
            case 3://marzo
                diasMes = dia < 32;
                break;
            case 4://abril
                diasMes = dia < 31;
                break;
            case 5://mayo
                diasMes = dia < 32;
                break;
            case 6://junio
                diasMes = dia < 31;
                break;
            case 7://julio
                diasMes = dia < 32;
                break;
            case 8://agosto
                diasMes = dia < 32;
                break;
            case 9://septiembre
                diasMes = dia < 31;
                break;
            case 10://octubre
                diasMes = dia < 32;
                if (dia == 31) {
                    System.out.println("Feliz Halloween");
                }
                break;
            case 11://noviembre
                diasMes = dia < 31;
                break;
            case 12://diciembre
                diasMes = dia < 32;
                break;
            default:
                System.out.println("Mes invalido");
                diasMes = false;
        }
        return diasMes;
    }

    private boolean comprobarBisiesto(int anio) {
        // año bisiesto divisible por 4, no divisible por 100 y divisible por 400
        //p y [!q ó r] expresion logica
        boolean p, q, r;
        p = (anio % 4 == 0);
        q = (anio % 100 == 0);
        r = (anio % 400 == 0);
        return (p && (!q || r));
    }

    public void mostrarDiaAnterior(Fecha inptUsr) {
        System.out.println("Fecha actual");
        System.out.println(inptUsr);
        System.out.print("Ayer fue : ");
        int dia = inptUsr.getDia(), mes = inptUsr.getMes(), anio = inptUsr.getAnio();
        if ((inptUsr.getDia() - 1) > 0) {
            System.out.println((inptUsr.getDia() - 1) + "/" + (inptUsr.getMes()) + "/" + (inptUsr.getAnio()));
        } else {
            mes--;
            if (mes < 1) {
                anio--;
                mes = 12;
            }
            switch (mes) {
                case 1://enero
                    dia = 31;
                    break;
                case 2://febrero
                    if (comprobarBisiesto(anio)) {
                        dia = 29;
                    } else {
                        dia = 28;
                    }
                    break;
                case 3://marzo
                    dia = 31;
                    break;
                case 4://abril
                    dia = 30;
                    break;
                case 5://mayo
                    dia = 31;
                    break;
                case 6://junio
                    dia = 30;
                    break;
                case 7://julio
                    dia = 31;
                    break;
                case 8://agosto
                    dia = 31;
                    break;
                case 9://septiembre
                    dia = 30;
                    break;
                case 10://octubre
                    dia = 31;
                    break;
                case 11://noviembre
                    dia = 30;
                    break;
                case 12://diciembre
                    dia = 31;
                    break;
            }
            System.out.println((dia) + "/" + (mes) + "/" + (anio));
        }
        System.out.println("");
    }

    public void mostrarDiaPosterior(Fecha inptUsr) {
        int dia = inptUsr.getDia(), mes = inptUsr.getMes(), anio = inptUsr.getAnio();

        switch (dia) {
            case 28:
                if (!comprobarBisiesto(inptUsr.getAnio()) && inptUsr.getMes() == 2) {

                    mes++;
                }
                break;
            case 29:
                if (comprobarBisiesto(inptUsr.getAnio()) && inptUsr.getMes() == 2) {

                    mes++;
                }
                break;
            case 30:
                //30 = 4 6 9 11
                if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    mes++;

                }
                if (mes == 10) {
                    System.out.print("Que pases feliz Halloween ");
                }
                break;
            case 31:
                //31 = 1 3 5 7 8 10 12
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    mes++;
                }
                break;
        }
        if ((mes != inptUsr.getMes())) {
            dia = 1;
        } else if (mes == inptUsr.getMes()) {
            dia++;
        }
        if (mes > 12) {
            anio++;
            mes = 1;
        }
        System.out.print("Mañana : ");
        System.out.print(dia + "/" + mes + "/" + anio);
        System.out.println("");

    }
}
