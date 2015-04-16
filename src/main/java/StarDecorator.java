/**
 * Created by Benjamin Daschel on 4/13/15.
 */
public class StarDecorator {

    public static class Star extends TreeDecorator{
        private final TreeDecorator decorated;

        private Star(TreeDecorator tree){
            this.decorated = tree;
        }

        @Override
        public double getPrice() {
            return 10.0;
        }

        @Override
        public double getTotal() {
            return this.decorated.getPrice() + this.getPrice();
        }

        @Override
        public TreeDecorator getDecorated() {
            return decorated;
        }
    }

    public static Tree addStar(Tree tree){
        return null; //TODO
    }
}
