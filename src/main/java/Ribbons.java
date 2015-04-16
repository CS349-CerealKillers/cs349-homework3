import java.lang.String; /**
 * Created by Tyler on 4/15/2015.
 */
public class Ribbons extends TreeDecorator
{
    public Ribbons(Tree tree)
    {
        super(tree);
    }

    public String getDescription()
    {
        return tree.getDescription() + ", Ribbons";
    }

    public int cost()
    {
        return 2 + this.tree.cost();
    }
}
