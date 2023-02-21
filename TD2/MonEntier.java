package TD2;

public class MonEntier {
    private int entier;

    public int getEntier() {
        return this.entier;
    }
   

    public void setEntier(int entier) {
        this.entier = entier;
    }
    
    public MonEntier(int entier){
        this.entier=entier;
    }

    // public void ajouter(int entier){
    //      this.entier+=entier; 
    //      System.out.println("l'addition de l'entier  par "+entier+" est egal à "+ this.entier);
    // }
    
    // public void diminuer(int entier){
    //     this.entier-=entier;
    //     System.out.println("la diminution de l'entier  par "+entier+" est egal à "+ this.entier);
    // }
    // public void multiplier(int entier){
    //      this.entier*=entier; 
    //      System.out.println("la multiplication de l'entier  par "+entier+" est egal à "+ this.entier);
    // }
    
    // public void diviser(int entier) {
    //     this.entier=Math.divideExact(this.entier, entier);
    //     System.out.println("la division de l'entier  par "+entier+" est egal à "+ this.entier);
        
    // }
    // public void puissance(int entier){
    //     this.entier= math.pw
        
    // }
    public int ajouter(int entier){
        return this.entier+entier;  
   }
   
   public int diminuer(int entier){
       return this.entier-entier;
   }
   public int multiplier(int entier){
        return this.entier*entier; 
   }
   
   public int diviser(int entier) {
       return Math.divideExact(this.entier, entier);
   }
   public double puissance(int entier){
       return Math.pow(this.entier, entier);   
   }
   public int factoriel(int entier){
    if(entier==1  || entier==0){
        return 1;
    }else{
        return entier*factoriel(entier-1);
    }
   }
   public void afficher(){
    System.out.println("\tl'entier est : "+this.entier);
   }
}
