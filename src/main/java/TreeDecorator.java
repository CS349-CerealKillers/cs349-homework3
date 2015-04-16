/**
 * Created by Benjamin Daschel on 4/13/15.
 */
public abstract class TreeDecorator extends Tree implements Decorator<TreeDecorator>{

    private TreeDecorator decorated;

    public abstract TreeDecorator getDecorated();

    public TreeDecorator decorate(TreeDecorator decorated) {
        this.decorated = decorated;
        return this;
    }

    @Override
    public double getTotal() {
        return this.getPrice() + decorated.getTotal();
    }

}
