/**
 * Created by Benjamin Daschel on 4/16/15.
 */
public class BallsBlue extends TreeDecorator {

    public BallsBlue(Tree decorated) {
        super(decorated);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Blue balls";
    }
}
