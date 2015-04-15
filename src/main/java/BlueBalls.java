/**
 * Created by voodoo on 4/14/15.
 */
public class BlueBalls extends TreeDecorator {
    Tree tree;
    public BlueBalls(Tree tree) {
        this.tree = tree;
    }
    public String getDescription() {
        return tree.getDescription() + ", blue ball ornaments";
    }
    public double cost() {
        return 2.00 + tree.cost();
    }
}
