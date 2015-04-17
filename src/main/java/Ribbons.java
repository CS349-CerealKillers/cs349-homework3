public class Ribbons extends TreeDecorator {

    public Ribbons (Tree treeToDecorate) {
        super(treeToDecorate);
    }
 
    @Override
    public int getPrice() {
        return super.getPrice()+2;
    }
    
    public boolean getStar() {
        return super.getStar();
    }
 
    @Override
    public String getDescription() {
        return super.getDescription() + ", including ribbons";
    }
    
}