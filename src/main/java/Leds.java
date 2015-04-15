/**
 * Created by voodoo on 4/14/15.
 */
public class Leds extends TreeDecorator {
    Tree tree;
    public Leds(Tree tree) {
        this.tree = tree;
    }
    public String getDescription() {
        return tree.getDescription() + ", cool multicolor LEDs";
    }
    public double cost() {
        return 10.00 + tree.cost();
    }
}
