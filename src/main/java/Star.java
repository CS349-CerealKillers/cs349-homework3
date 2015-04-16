/**
 * Created by voodoo on 4/14/15.
 * Star decorator can only have one instance of itself
 */
public class Star extends TreeDecorator {
    Tree tree;
    protected static Tree instance = null;
    protected Star(Tree tree) {
        this.tree = tree;
    }

    public static Tree getInstance(Tree tree) {
        if(instance == null) {
            return instance = new Star(tree);
        }
        else
            System.out.println("Can only have once instance of star!");

        return tree;
    }

    public String getDescription() {
        return tree.getDescription() + ", and topped with an awesome star";
    }
    public double cost() {
        return 4.00 + tree.cost();
    }
}