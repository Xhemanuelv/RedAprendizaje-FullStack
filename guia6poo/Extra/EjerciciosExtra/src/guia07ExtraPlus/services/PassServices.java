package guia07ExtraPlus.services;

import guia07ExtraPlus.entities.Pass;
import java.util.Scanner;

/**
 *
 * @author Xhemanuelv
 */
public class PassServices {

    private void crearPass(Pass codigo) {
        Scanner leer = new Scanner(System.in);
        String password, newPass;
        boolean auth;
        //pide contraseña actual
        do {
            System.out.println("Ingrese su contraseña actual");
            password = leer.nextLine();
            if (!password.equals(codigo.getPass())) {
                System.out.println("Contraseña incorrecta");
            }
        } while (!password.equals(codigo.getPass()));
        //cambia la contraseña
        auth = password.equals(codigo.getPass());
        if (auth) {
            do {
                System.out.println("Ingrese nueva contraseña");
                newPass = leer.nextLine();
                if (newPass.length() < 10) {
                    System.out.println("La contraseña debe tener al menos 10 caranteres");
                }
            } while (newPass.length() < 10);

            codigo.setPass(newPass);
        }

    }

    private void changePass(Pass codigo) {
        Scanner leer = new Scanner(System.in);
        String password, newPass;
        boolean auth;
        int intentos = 0, maxTry = 5;
        //pide contraseña actual
        do {
            System.out.println("Ingrese su contraseña actual");
            password = leer.nextLine();
            auth = password.equals(codigo.getPass());
            if (!password.equals(codigo.getPass())) {
                intentos++;
                maxTry--;
                System.out.println("Contraseña incorrecta");
                System.out.println("Intentos restantes :" + maxTry);
            }
            if (intentos > 5) {
                break;
            }
        } while (!auth);

        //cambia la contraseña
        if (auth) {
            do {
                System.out.println("Ingrese nueva contraseña");
                newPass = leer.nextLine();
                if (newPass.length() < 10) {
                    System.out.println("La contraseña debe tener al menos 10 caranteres");
                }
            } while (newPass.length() < 10);

            codigo.setPass(newPass);
        } else if (intentos > 5) {
            System.out.println("Maximo numero de intentos agotado, contacte a soporte para cambiar su contraseña");
        }

    }

    private void analizarPass(Pass codigo) {
        boolean z, a;
        z = codigo.getPass().contains("z");
        int cant = 0;
        for (int i = 0; i < codigo.getPass().length(); i++) {

            String aContenido = codigo.getPass().substring(i, i + 1);

            if (aContenido.equalsIgnoreCase("a")) {
                cant++;
            }
        }

        a = cant >= 2;
        if (a && z) {
            System.out.println("La seguridad de su contraseña es : ALTA");
        } else if (z) {
            System.out.println("La seguridad de su contraseña es : MEDIA");
        } else {
            System.out.println("La seguridad de su contraseña es : BAJA");
        }
    }

    private void cambiarNombre(Pass codigo) {
        Scanner leer = new Scanner(System.in);
        String password;
        int intentos = 0, maxTry = 5;
        boolean auth = false;
        do {
            System.out.println("Ingrese su contraseña actual");
            password = leer.nextLine();
            auth = password.equals(codigo.getPass());
            if (!password.equals(codigo.getPass())) {
                intentos++;
                maxTry--;
                System.out.println("Contraseña incorrecta, intentos restantes :" + maxTry);
            }
            if (intentos > 5) {
                break;
            }
        } while (!password.equals(codigo.getPass()));
        if (auth) {
            System.out.println("Ingrese el nuevo: Nombre");
            String name = leer.nextLine();
            codigo.setNombre(name);
        } else if (intentos > 5) {
            System.out.println("Maximo numero de intentos agotado, contacte a soporte para cambiar su contraseña");
        }
    }

    private void cambiarDni(Pass codigo) {
        Scanner leer = new Scanner(System.in);
        String password;
        int intentos = 0, maxTry = 5;
        boolean auth = false;
        do {
            System.out.println("Ingrese su contraseña actual");
            password = leer.nextLine();
            auth = password.equals(codigo.getPass());
            if (!password.equals(codigo.getPass())) {
                intentos++;
                maxTry--;
                System.out.println("Contraseña incorrecta, intentos restantes :" + maxTry);
            } else if (password.equals(codigo.getPass())) {
                auth = true;
            }
            if (intentos > 5) {
                break;
            }
        } while (!password.equals(codigo.getPass()));
        if (auth) {
            System.out.println("Ingrese el nuevo: DNI");
            int dni = leer.nextInt();
            codigo.setDni(dni);
        } else if (intentos > 5) {
            System.out.println("Maximo numero de intentos agotado, contacte a soporte para cambiar su contraseña");
        }
    }

    public void menuPass(Pass codigo) {
        Scanner leer = new Scanner(System.in);
        int selector;
        do {
            System.out.println("1-Ingresar contraseña");
            System.out.println("2-Mostrar seguridad de la contraseña");
            System.out.println("3-Modificar contraseña");
            System.out.println("4-Modificar nombre");
            System.out.println("5-Modificar DNI");
            System.out.println("6-Salir");
            selector = leer.nextInt();
            switch (selector) {
                case 1:
                    crearPass(codigo);
                    break;
                case 2:
                    analizarPass(codigo);
                    break;
                case 3:
                    changePass(codigo);
                    break;
                case 4:
                    cambiarNombre(codigo);
                    break;
                case 5:
                    cambiarDni(codigo);
                    break;
                default:
                    if (selector != 6) {
                        System.out.println("Opcion invalida");
                    } else {
                        System.out.println("Gracias por utilizar nuestros servicios");
                    }
            }
        } while (selector != 6);

    }
}
