public class DouglasFir implements Tree {
   private boolean star;

    @Override
    public int getPrice() {
      if(getStar())
         return 19;//star plus tree
      return 15;//tree price only  
    }
    
    public String getDescription(){
      if(getStar())
         return "Douglas Fir tree, including star";
      return "Douglas Fir tree";
    }
    
    public void setStar(){
      this.star = true;
    }
    
    public boolean getStar(){
      return this.star;
    }
   

    
}