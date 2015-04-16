import java.lang.String; /**
 * Created by Tyler on 4/15/2015.
 */
public class BlueBalls extends TreeDecorator
{
    public BlueBalls(Tree tree)
    {
        super(tree);
    }

    public String getDescription()
    {
        return tree.getDescription() + ", Balls (Blue)";
    }

    public int cost()
    {
        return 2 + this.tree.cost();
    }
}
