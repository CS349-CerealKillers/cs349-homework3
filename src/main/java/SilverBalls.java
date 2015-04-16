import java.lang.String; /**
 * Created by Tyler on 4/15/2015.
 */
public class SilverBalls extends TreeDecorator
{
    public SilverBalls(Tree tree)
    {
        super(tree);
    }

    public String getDescription()
    {
        return tree.getDescription() + ", Balls (Silver)";
    }

    public int cost()
    {
        return 3 + this.tree.cost();
    }
}
