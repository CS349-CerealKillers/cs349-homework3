/**
 * Created by Benjamin Daschel on 4/16/15.
 */
public class Lights extends TreeDecorator {
    public Lights(Tree decorated) {
        super(decorated);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " lights";
    }
}
