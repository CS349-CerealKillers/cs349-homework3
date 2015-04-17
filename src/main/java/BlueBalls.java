public class BlueBalls extends TreeDecorator {

    public BlueBalls (Tree treeToDecorate) {
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
        return super.getDescription() + ", including blue balls";
    }
    
}