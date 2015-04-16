/**
 * Created by Benjamin Daschel on 4/15/15.
 */
public abstract class TreeDecorator extends Decorator<Tree> implements Tree{

    public TreeDecorator(Tree decorated) {
        super(decorated);
    }

    public double getPrice() {
        return this.decorated.getPrice();
    }

    public String getDescription() {
        return this.decorated.getDescription();
    }
}
