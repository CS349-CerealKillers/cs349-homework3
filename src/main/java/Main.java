/**
 * Created by voodoo on 4/14/15.
 */
public class Main {
     public static void main(String[] args) {

        Tree mytree = new BlueSpruce();
        mytree = Star.getInstance(mytree);
        mytree = new Ruffles(mytree);
        mytree = Star.getInstance(mytree);
        mytree = new Ruffles(mytree);
        printTree(mytree);
    }

    /**
     * printTree Method
     * */
    public static void printTree(Tree mytree) {
        System.out.println(mytree.getDescription() + " will cost " + mytree.cost());
    }
}
