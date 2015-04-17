public class TreeDecoratorTest {
    public static void main(String[] args) {
      Tree mytree = new ColoradoBlue();
      mytree = new Star(mytree);
      mytree = new Ruffles(mytree);
      mytree = new Star(mytree);
      mytree = new Ruffles(mytree);
      printTree(mytree);
      
      Tree mytree2 = new BalsamFir();
      mytree2 = new Ruffles(mytree2);
      mytree2 = new Lights(mytree2);
      mytree2 = new Star(mytree2);
      printTree(mytree2);
    }
    
    private static void printTree(Tree mytree){
      System.out.println(mytree.getDescription());
      System.out.println("Price: " + mytree.getPrice());
    }
    
}