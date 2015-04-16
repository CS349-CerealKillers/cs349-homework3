import java.lang.String; /**
 * Created by Tyler on 4/15/2015.
 */
public class Leds extends TreeDecorator
{
    public Leds(Tree tree)
    {
        super(tree);
    }

    public String getDescription()
    {
        return tree.getDescription() + ", LEDs";
    }

    public int cost()
    {
        return 1 + this.tree.cost();
    }
}
