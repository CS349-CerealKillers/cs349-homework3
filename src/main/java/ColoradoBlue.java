public class ColoradoBlue implements Tree {
    private boolean star;

    @Override
    public int getPrice() {
      if(getStar())
         return 24;//star plus tree
      return 20;//tree price only  
    }
    
    public String getDescription(){
      if(getStar())
         return "Colorado Blue tree, including star";
      return "Colorado Blue tree";
    }
    
    public void setStar(){
      this.star = true;
    }
    
    public boolean getStar(){
      return this.star;
    }
    
}