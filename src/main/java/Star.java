/**
 * Created by voodoo on 4/14/15.
 */
public class Star extends TreeDecorator {
    Tree tree;
    protected static Star instance = null;
    protected Star(Tree tree) {
        this.tree = tree;
    }

    public static Star getInstance(Tree tree) {
        if(instance == null) {
            instance = new Star(tree);
        }
        else
            System.out.println("Can only have once instance of star!");

        return instance;
    }

    public String getDescription() {
        return tree.getDescription() + ", and topped with an awesome star";
    }
    public double cost() {
        return 4.00 + tree.cost();
    }
}