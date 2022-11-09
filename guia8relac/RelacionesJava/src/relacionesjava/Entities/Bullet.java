package relacionesjava.Entities;

/**
 *
 * @author Xhemanuelv
 */
public class Bullet {

    private final String firingResult = " Boom";

    public String getFiringResult() {
        return firingResult;
    }

    @Override
    public String toString() {
        return "click" + firingResult ;
    }

}
