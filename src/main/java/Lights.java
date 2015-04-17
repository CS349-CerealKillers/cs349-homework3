public class Lights extends TreeDecorator {

    public Lights (Tree treeToDecorate) {
        super(treeToDecorate);
    }
 
    @Override
    public int getPrice() {
        return super.getPrice()+5;
    }
    
    public boolean getStar() {
        return super.getStar();
    }
 
    @Override
    public String getDescription() {
        return super.getDescription() + ", including lights";
    }
    
}