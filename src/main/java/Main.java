/**
 * Created by Benjamin Daschel on 4/13/15.
 */
public class Main {

    public static void main(String[] args) {
        /*
        Tree mytree = new BlueSpruce();
        mytree = new Star(mytree);
        mytree = new Ruffles(mytree);
        mytree = new Star(mytree); //this is problematic!
        mytree = new Ruffles(mytree);
        printtree(mytree);
         */

        Tree t = new DouglasFir();
        t = new Ruffles(t);
        t = new BallsRed(t);

        System.out.println("Price: " + t.getPrice());
        System.out.println(t.getDescription());

    }
}
