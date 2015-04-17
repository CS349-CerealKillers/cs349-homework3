/**
 * Created by jharshman on 4/14/15.
 */
public class Ruffles extends TreeDecorator {
    Tree tree;
    public Ruffles(Tree tree) {
        this.tree = tree;
    }
    public String getDescription() {
        return tree.getDescription() + ", ruffles";
    }
    public double cost() {
        return 1.00 + tree.cost();
    }
}
