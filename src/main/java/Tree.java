import java.lang.String; /**
 * Created by Tyler on 4/15/2015.
 */
public abstract class  Tree
{
    protected String description;
    protected int cost;
    protected boolean hasStar;

    public String getDescription()
    {
        return this.description;
    }

    public abstract int cost();

    public boolean hasStar()
    {
        return this.hasStar;
    }
}
