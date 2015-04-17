public abstract class TreeDecorator implements Tree {
    protected Tree treeToDecorate;
 
    public TreeDecorator (Tree treeToDecorate) {
        this.treeToDecorate = treeToDecorate;
    }
    
    public TreeDecorator(Tree t, boolean star){
      if(t.getStar())
         System.out.println("Christmas trees only have one star you jerk! :)");
      t.setStar();
      this.treeToDecorate = t;
    }
    
    public int getPrice() {
        return treeToDecorate.getPrice();
    }
    
    public String getDescription() {
        return treeToDecorate.getDescription(); //Delegation
    }
    
    
    public boolean getStar() {
        return treeToDecorate.getStar();
    }
    
    public void setStar() {
        treeToDecorate.setStar();
    }
}