/**
 * Created by Benjamin Daschel on 4/15/15.
 */
public class Ruffles extends TreeDecorator implements Tree {

    public Ruffles(Tree decorated) {
        super(decorated);
    }

    public double getPrice() {
        return super.getPrice() + 1;
    }

    public String getDescription() {
        return super.getDescription() + " Ruffles";
    }
}
