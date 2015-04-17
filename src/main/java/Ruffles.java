public class Ruffles extends TreeDecorator {

    public Ruffles (Tree treeToDecorate) {
        super(treeToDecorate);
    }
 
    @Override
    public int getPrice() {
        return super.getPrice()+1;
    }
    
    public boolean getStar() {
        return super.getStar();
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", including ruffles";
    }
   
    
}