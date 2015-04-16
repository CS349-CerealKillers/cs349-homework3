/**
 * Created by Benjamin Daschel on 4/16/15.
 */
public class Leds extends TreeDecorator {
    public Leds(Tree decorated) {
        super(decorated);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " LEDs";
    }
}
