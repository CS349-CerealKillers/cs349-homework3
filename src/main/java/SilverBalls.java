/**
 * Created by jharshman on 4/14/15.
 */
public class SilverBalls extends TreeDecorator {
    Tree tree;
    public SilverBalls(Tree tree) {
        this.tree = tree;
    }
    public String getDescription() {
        return tree.getDescription() + ", silver ball ornaments";
    }
    public double cost() {
        return 3.00 + tree.cost();
    }
}
