/**
 * Created by voodoo on 4/14/15.
 */
public class Lights extends TreeDecorator {
    Tree tree;
    public Lights(Tree tree) {
        this.tree = tree;
    }
    public String getDescription() {
        return tree.getDescription() + ", old fashioned lights";
    }
    public double cost() {
        return 5.00 + tree.cost();
    }
}
