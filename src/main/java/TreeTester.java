import java.lang.String;import java.lang.System; /**
 * Created by Tyler Herrin on 4/15/2015.
 */
public class TreeTester
{
    public static void main(String[] args)
    {
        Tree myTree = new BlueSpruceTree();
        myTree = new Star(myTree);
        myTree = new Ruffles(myTree);
        myTree = new Star(myTree);
        myTree = new Ruffles(myTree);
        myTree = new SilverBalls(myTree);
        myTree = new Star(myTree);
        myTree = new Leds(myTree);
        myTree = new Lights(myTree);
        myTree = new BlueBalls(myTree);
        printTree(myTree);
    }

    public static void printTree(Tree tree)
    {
        System.out.println(tree.getDescription() + " costs: $" + tree.cost());
    }
}
