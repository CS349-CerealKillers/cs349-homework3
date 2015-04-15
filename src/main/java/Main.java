/**
 * Created by voodoo on 4/14/15.
 */
public class Main {
     public static void main(String[] args) {

         /*
        Tree mytree = new BlueSpruce();
        mytree = new Star(mytree);
        mytree = new Ruffles(mytree);
        mytree = new Star(mytree); //this is problematic!
        mytree = new Ruffles(mytree);
        printTree(mytree);
          */

         Tree test = new FraserFir();
         test = new Ruffles(test);
         test = new BlueBalls(test);
         test = Star.getInstance(test);
         test = Star.getInstance(test);
         printTree(test);
    }

    //print tree method
    public static void printTree(Tree mytree) {
        System.out.println(mytree.getDescription() + " will cost " + mytree.cost());
    }
}
