package relacionesjava.Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import relacionesjava.Entities.Blank;
import relacionesjava.Entities.Bullet;
import relacionesjava.Entities.Cylinder;
import relacionesjava.Entities.JuegoRuleta;
import relacionesjava.Entities.Jugador;
import relacionesjava.Entities.Revolver;
import relacionesjava.Enum.MarcaRevolver;

/**
 *
 * @author Xhemanuelv
 */
public class JuegoRuletaService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private Jugador cargarJugador(int id) {
        System.out.println("Introducir el nombre del jugador");
        String name = leer.next();
        int numeroJugador = 0;
        numeroJugador = id + 1;
        return new Jugador(numeroJugador, name);
    }

    /**
     * "Ensambla" el revolver definiendo que calibre tendra, la marca y la
     * posicion del proyectil en el tambor (funciona)
     *
     * @return Revolver
     */
    public Revolver cargarRevolver() {
        int rnd = (int) (Math.random() * 5 + 1);
        int placeBullet = 0;
        MarcaRevolver nameGun = null;
        Cylinder loader = cargaCilindro();
        switch (rnd) {
            case 1 ->
                nameGun = MarcaRevolver.COLT; //counter clockwise cyl rot
            case 2 ->
                nameGun = MarcaRevolver.SMITH_WESSON;//clockwise cyl rot
            case 3 ->
                nameGun = MarcaRevolver.TAURUS;//counter clockwise cyl rot
            case 4 ->
                nameGun = MarcaRevolver.RUGER;//counter clockwise cyl rot
            case 5 ->
                nameGun = MarcaRevolver.ASTRA;//counter clockwise cyl rot

        }

        //debug visualiza orden de vacios y proyectil
        /*
        for (Object cylinder : loader.getCylinder()) {
            System.out.println(cylinder);
        }*/
        Object[] cargaMunicion = new Object[6];
        for (int i = 0; i < loader.getCylinder().size(); i++) {
            cargaMunicion[i] = loader.getCylinder().get(i);
            if (!cargaMunicion[i].toString().equalsIgnoreCase("click Boom")) {
            } else {
                placeBullet = i;
            }
        }

        return new Revolver(loader, nameGun, cargaMunicion,
                placeBullet);
    }

    /**
     * Carga un proyectil en el revolver devolviendo la carga del mismo los
     * demas lugares son Object Blank que representan espacio vacio (funciona)
     *
     * @return cylinder
     */
    private Cylinder cargaCilindro() {
        ArrayList<Object> carga = new ArrayList();
        Blank vacia = new Blank();
        Bullet ronda = new Bullet();
        carga.add(vacia);
        carga.add(vacia);
        carga.add(vacia);
        carga.add(vacia);
        carga.add(vacia);
        carga.add(ronda);
        // hace aleatoria la pocision del proyectil y vacios
        Collections.shuffle(carga);
        return new Cylinder(carga);
    }

    /**
     * TO DO terminar preparar juego ruleta, agregar metodo ronda() implementar
     * el mecanismo de juego para englobar todo
     *
     * Por favor abstenerse de jugar a este juego de manera real
     * !!!!https://comercioyjusticia.info/leyes-y-comentarios/ruleta-rusa/ en el
     * link se ve algo de informacion pertinente a legislacion sobre este
     * "juego"
     */
    public void comenzarJuegoRuleta() {
        JuegoRuleta game = new JuegoRuleta();
        System.out.println("Ingrese la cantidad de jugadores (max 6)");
        int idJugador = leer.nextInt();
        if (idJugador < 1 || idJugador > 6) {
            System.out.println("Rango incorrecto, por defecto se utiliza 6");
            idJugador = 6;
        }
        for (int i = 0; i < idJugador; i++) {
            //asigna los jugadores al juego
            game.getPlayers().add(cargarJugador((i)));
        }
        //asigna el revolver al juego
        Revolver tool = cargarRevolver();
        game.setTool(tool);

        System.out.println("Seleccionen que variante jugaran :");
        System.out.println("1 - Girar tambor despues de cada jugador");//66.5% de probabilidad de haberse disparado en 6 turnos
        System.out.println("2 - Girar tambor solo al comienzo");//100% probabilidad de perder al 6to turno
        System.out.println("3 - No jugar y disfrutar la vida");
        //System.out.println("4 - DEATHWISH cargar 5 rondas y 1 vacio los jugadores juegan hasta que se llega a la ronda vacia se gira una sola vez");
        int var = leer.nextInt();
        switch (var) {
            case 1 ->
                ronda66Probabilidad(game);
            case 2 ->
                ronda100(game);
            case 3 ->
                System.out.println("Aprecien incluso los momentos dificiles pues permiten notar los buenos momentos");
            case 4 ->
                deathwish(game);
            default ->
                System.out.println("Entrada invalida");
        }

    }

    /**
     * Metodo para variante del juego en que el tambor se gira solo al comienzo
     *
     * @param game
     */
    private void ronda100(JuegoRuleta game) {

        
        int numRonda = 1, jugadorX;
        boolean finJuego=false;
        game.getTool().setName(MarcaRevolver.SMITH_WESSON);
        boolean clockwise = game.getTool().getName().equals(MarcaRevolver.SMITH_WESSON);
        if (clockwise) {
            while (!finJuego) {
                System.out.println("Ronda n°"+numRonda);
                jugadorX = 1;
                for (int i = 0; i < game.getTool().getChambered().length; i++) {
                    System.out.println("Turno Jugador" + jugadorX);
                    finJuego=disparo(game, i);
                    if ((finJuego) || (i == game.getPlayers().size())) {
                        if (finJuego) {
                            game.getPlayers().get((jugadorX-1)).setDead(true);
                        }
                        break;
                    }else{
                        System.out.println("Siguiente");
                    }
                    jugadorX++;
                }
                numRonda++;
            }
        } else {//este no esta terminado
            while (!finJuego) {
                System.out.println("Ronda n°"+numRonda);
                jugadorX = 1;
                for (int i = (game.getTool().getChambered().length - 1); i < 0; i++) {
                    System.out.println("Turno Jugador" + (jugadorX));
                    finJuego=disparo(game, i);
                    if (finJuego) {
                        break;
                    }
                    jugadorX++;
                }
                numRonda++;
            }
        }
        System.out.println("Pierde :");
        for (int i = 0; i < game.getPlayers().size(); i++) {
            if (game.getPlayers().get(i).dead) {
                System.out.println(game.getPlayers().get(i));
            }
        }
    }

    private boolean disparo(JuegoRuleta game, int posActual) {
        promptEnterKey();
        boolean endGame = bang(game.getTool(), posActual);
        return endGame;
    }

    /**
     * Equivale al metodo mojar del ejercicio
     *
     * @param r Revolver
     * @param posActual determinada por tipo de revolver e iterador bucle for
     * @return boolean
     */
    private boolean bang(Revolver r, int posActual) {
        boolean dropsDead = r.getPosBullet() == posActual;
        if (dropsDead) {
            System.out.println("Termina el juego");
        }
        return dropsDead;
    }

    /**
     * Metodo de juego mas largo, se gira el tambor a cada turno de jugador
     * 66.5% probabilidad de dispararse o haberse disparado al 6to tiro
     *
     * @param game
     */
    private void ronda66Probabilidad(JuegoRuleta game) {
        boolean finJuego = false;

        int numeroRondas = 1, giroTambor;
        while (!finJuego) {
            System.out.println("Ronda numero : " + numeroRondas);
            for (int i = 0; i < game.getPlayers().size(); i++) {
                System.out.println("Turno Jugador " + game.getPlayers().get(i).id);
                System.out.println("Disparar?");
                promptEnterKey();
                giroTambor = (int) (Math.random() * 6 + 1);
                finJuego = giroTambor == game.getTool().getPosBullet();
                if (finJuego) {
                    game.getPlayers().get(i).setDead(finJuego);
                    break;
                }
            }
            numeroRondas++;
            System.out.println("~~~~~~~~~~~~~~~~~~");
        }
        System.out.println("Termino el juego, el jugador que perdio es :");
        for (int i = 0; i < game.getPlayers().size(); i++) {
            if (game.getPlayers().get(i).dead) {
                System.out.println(game.getPlayers().get(i));
            }
        }
    }

    private void promptEnterKey() {
        System.out.println("Presione \"ENTER\" para disparar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    /**
     * Incrementa la dificultad del juego enormemente
     *
     * @param game
     */
    private void deathwish(JuegoRuleta game) {

        ArrayList<Object> auxObj = new ArrayList();
        Blank vacia = new Blank();
        Bullet ronda = new Bullet();
        auxObj.add(ronda);
        auxObj.add(ronda);
        auxObj.add(ronda);
        auxObj.add(ronda);
        auxObj.add(ronda);
        auxObj.add(vacia);
        Collections.shuffle(auxObj);
        //carga 5 rondas y deja una vacia y la asigna a revolver
        game.getTool().setChambered(auxObj.toArray());

        boolean endGame = false;

        boolean clockwise = game.getTool().getName().equals(MarcaRevolver.SMITH_WESSON);

        if (clockwise) {
            for (int i = 0; i < (game.getTool().getChambered().length); i++) {
                System.out.println("Turno Jugador" + game.getPlayers().get(i).id);
                promptEnterKey();
                endGame = rondaDeathwish(game.getTool(), i);
                if (endGame || i == game.getPlayers().size()) {
                    break;
                } else {
                    System.out.println("El Jugador " + (i + 1) + " pierde, siguiente");
                }
            }
        } else {
            int jugadorX = 1;
            for (int i = (game.getTool().getChambered().length); i > 0; i--) {
                System.out.println("Turno Jugador" + jugadorX);
                promptEnterKey();
                endGame = rondaDeathwish(game.getTool(), i - 1);
                if (endGame || jugadorX == game.getPlayers().size()) {
                    break;
                } else if (!endGame) {
                    System.out.println("El Jugador " + jugadorX + " pierde, siguiente");
                    game.getPlayers().get((jugadorX - 1)).setDead(!endGame);
                }
                jugadorX++;
            }
            if (!endGame) {
                System.out.println("El Jugador " + jugadorX + " pierde");
                game.getPlayers().get((jugadorX - 1)).setDead(!endGame);
            }
        }
    }

    /**
     * Metodo para rondas deathwish. Chequea si existe un espacio vacio y
     * devuelve boolean, si existe vacio anuncia fin de juego
     *
     * @param r
     * @param posActual
     * @return
     */
    private boolean rondaDeathwish(Revolver r, int posActual) {
        boolean vacio;
        Blank vaBlank = new Blank();
        if (r.getChambered()[posActual].toString().equalsIgnoreCase(vaBlank.toString())) {
            System.out.printf("%nTermina el Juego.%nFelicidades sobreviviste a esta locura%n");
            vacio = true;
        } else {
            vacio = false;
        }
        return vacio;
    }

}
