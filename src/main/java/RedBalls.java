/**
 * Created by Tyler on 4/15/2015.
 */
public class RedBalls extends TreeDecorator
{
    public RedBalls(Tree tree)
    {
        super(tree);
    }

    public String getDescription()
    {
        return tree.getDescription() + ", Balls (Red)";
    }

    public int cost()
    {
        return 1 + this.tree.cost();
    }
}
