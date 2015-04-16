import java.lang.String; /**
 * Created by Tyler on 4/15/2015.
 */
public class Lights extends TreeDecorator
{
    public Lights(Tree tree)
    {
        super(tree);
    }

    public String getDescription()
    {
        return tree.getDescription() + ", Lights";
    }

    public int cost()
    {
        return 5 + this.tree.cost();
    }
}
