public class FraseFir implements Tree {
   private boolean star;

    @Override
    public int getPrice() {
      if(getStar())
         return 16;//star plus tree
      return 12;//tree price only  
    }
    
    public String getDescription(){
      if(getStar())
         return "Frasener Fir tree, including star";
      return "Frasener Fir tree";
    }
    
    public void setStar(){
      this.star = true;
    }
    
    public boolean getStar(){
      return this.star;
    }

    
}