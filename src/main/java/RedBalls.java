/**
 * Created by voodoo on 4/14/15.
 */
public class RedBalls extends TreeDecorator {

    Tree tree;
    public RedBalls(Tree tree) {
        this.tree = tree;
    }
    public String getDescription() {
        return tree.getDescription() + ", Red Ball Ornaments";
    }
    public double cost() {
        return 1.00 + tree.cost();
    }
}
