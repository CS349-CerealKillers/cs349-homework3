import java.lang.String; /**
 * Created by Tyler on 4/15/2015.
 */
public class Ruffles extends TreeDecorator
{
    public Ruffles(Tree tree)
    {
        super(tree);
    }

    public String getDescription()
    {
        return tree.getDescription() + ", Ruffles";
    }

    public int cost()
    {
        return 1 + this.tree.cost();
    }
}
