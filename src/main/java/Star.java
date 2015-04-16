import java.lang.String;import java.lang.System; /**
 * Created by Tyler on 4/15/2015.
 */
public class Star extends TreeDecorator
{
    public Star(Tree tree)
    {
        super(tree);
        if(tree.hasStar())
        {
            System.out.println("This tree already has a star!");
            this.description = "";
            this.cost = 0;
        }
        else // Doesn't have star
        {
            this.cost = 4;
            this.description = ", a Star";
            this.hasStar = true;
        }
    }

    public String getDescription()
    {
        return this.tree.getDescription() + this.description;
    }

    public int cost()
    {
        return this.cost + this.tree.cost();
    }


}
