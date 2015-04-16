import java.lang.String; /**
 * Created by Tyler on 4/15/2015.
 */
public abstract class TreeDecorator extends Tree
{
    Tree tree;

    public TreeDecorator(Tree tree)
    {
        if(tree.hasStar())
        {
            this.hasStar = true;
        }
        this.tree = tree;
    }

    public abstract String getDescription();
}
