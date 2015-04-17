public class LedLights extends TreeDecorator {

    public LedLights (Tree treeToDecorate) {
        super(treeToDecorate);
    }
 
    @Override
    public int getPrice() {
        return super.getPrice()+10;
    }
    
    public boolean getStar() {
        return super.getStar();
    }
 
    @Override
    public String getDescription() {
        return super.getDescription() + ", including Led lights";
    }
    
}