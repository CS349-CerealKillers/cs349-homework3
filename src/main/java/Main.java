/**
 * Created by Benjamin Daschel on 4/13/15.
 */
public class Main {

    public static void main(String[] args) {

        Tree t = new DouglasFir();
        t = new Ruffles(t);
        t = new BallsRed(t);
        t = Star.addStar(t);
        t = new BallsRed(t);
        t = Star.addStar(t);

        System.out.println("Price: " + t.getPrice());
        System.out.println(t.getDescription());

    }
}
