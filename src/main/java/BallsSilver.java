/**
 * Created by Benjamin Daschel on 4/16/15.
 */
public class BallsSilver extends TreeDecorator {
    public BallsSilver(Tree decorated) {
        super(decorated);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 3;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Silver balls";
    }
}
