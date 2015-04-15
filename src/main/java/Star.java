/**
 * Created by voodoo on 4/14/15.
 */
public class Star extends TreeDecorator {
    Tree tree;
    public Star(Tree tree) {
        this.tree = tree;
    }
    public String getDescription() {
        return tree.getDescription() + ", and topped with an awesome star";
    }
    public double cost() {
        return 4.00 + tree.cost();
    }
}