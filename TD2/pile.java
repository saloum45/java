package TD2;


public class pile {
    private int sommet;
    private int piles[];

    public int getSommet() {
        return this.sommet;
    }

    public pile(int taille){
        piles = new int [taille];
        sommet = -1;
    }
    public void empiler(int valeur){
        sommet+=1;
        piles[sommet]=valeur;
    }
    public int depiler(){
        sommet-=1;
        return piles[sommet+1];
    }
    public void listerpile(){
        if(ispilevide()==true){
            System.out.println("\nla pile est vide ");
        }else{
            System.out.println("\nl'affichage du tableau :  ");
            for(int i=0;i<=sommet;i++){
                System.out.print(" "+piles[i]);
            }
        }
    }
    public void viderpile(){
        sommet=-1;
    }
    public boolean ispilevide(){
        if(sommet==-1){
            return true;
        }else{
            return false;
        }
    }


    
    
}
