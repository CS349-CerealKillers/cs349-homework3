/**
 * Created by Benjamin Daschel on 4/15/15.
 */
public class Star extends TreeDecorator implements Tree {

    private Star(Tree decorated) {
        super(decorated);
    }

    public double getPrice() {
        return super.getPrice() + 4;
    }

    public String getDescription() {
        return super.getDescription() + " a Star";
    }

    /**
     * @param t the tree you want to put a star on top of
     * @return a tree with a star on top
     */
    public static Tree addStar(Tree t){
        Tree in = t;
        while(t instanceof TreeDecorator){
            if(t instanceof Star){
                System.out.println("Tree already has a star. Returning tree unchanged.");
                return in;
            }
            TreeDecorator td = (TreeDecorator) t;
            t = td.decorated;
        }
        return new Star(in);
    }
}
