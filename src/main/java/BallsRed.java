/**
 * Created by Benjamin Daschel on 4/15/15.
 */
public class BallsRed extends TreeDecorator implements Tree {

    public BallsRed(Tree decorated) {
        super(decorated);
    }

    public double getPrice() {
        return super.getPrice() + 1;
    }

    public String getDescription() {
        return super.getDescription() +  " Red balls";
    }
}
