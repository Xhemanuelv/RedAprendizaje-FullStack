package relacionesjava.Entities;

import java.util.ArrayList;

/**
 *
 * @author Xhemanuelv
 */
public class JuegoRuleta {

    private ArrayList<Jugador> players=new ArrayList();
    private Revolver tool;

    public JuegoRuleta() {
    }

    public JuegoRuleta(ArrayList<Jugador> players, Revolver tool) {
        this.players = players;
        this.tool = tool;
    }

    public ArrayList<Jugador> getPlayers() {
        return players;
    }

    /**
     * Carga una lista de jugadores
     *
     * @param players
     */
    public void setPlayers(ArrayList<Jugador> players) {
        this.players = players;
    }

    public Revolver getTool() {
        return tool;
    }

    /**
     * Asigna un revolver al juego, se hara aleatoriamente entre 5 posibles
     * revolver
     *
     * @param tool
     */
    public void setTool(Revolver tool) {
        this.tool = tool;
    }

    @Override
    public String toString() {
        return "JuegoRuleta{" + "players=" + players + ", tool=" + tool + '}';
    }
    
    

}
