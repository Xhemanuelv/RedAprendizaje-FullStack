package relacionesjava.Entities;

/**
 *
 * @author Xhemanuelv
 */
public class Jugador {

    public int id;
    public String playerName;
    public boolean dead;

    public Jugador() {
    }

    public Jugador(String playerName) {
        this.playerName = playerName;
        this.dead = false;
    }

    public Jugador(int id, String playerName) {
        this.id = id;
        this.playerName = playerName;
        this.dead = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    @Override
    public String toString() {
        return "Jugador" + id + " mojado " + dead;
    }

}
