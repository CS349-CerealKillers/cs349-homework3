public class BalsamFir implements Tree {
   private boolean star;

    @Override
    public int getPrice() {
      if(getStar())
         return 9;//star plus tree
      return 5;//tree price only  
    }
    
    public String getDescription(){
      if(getStar())
         return "Balsam Fir tree, including star";
      return "Balsam Fir tree";
    }
    
    public void setStar(){
      this.star = true;
    }
    
    public boolean getStar(){
      return this.star;
    }
   
    
}