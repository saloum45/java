public class personne {
    private String nom;
    private String prenom;
    private int age;
    
    public personne(String nom, String prenom, int age){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }

    public personne(String nom, String prenom){
        // this.nom=nom;
        // this.prenom=prenom;
        this(nom,prenom,0);
    }
    

    public personne(){
        // this.nom="inconnu";
        // this.prenom="inconnu";
        // this.age=0;
        this("inconnu","inconnu",0);
    }

    public String getNom(){
        return this.nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public int getAge(){
        return this.age;
    }

    public void setNom(String nom){
    this.nom=nom;
    }

    public void setPrenom(String prenom){
    this.prenom=prenom;
    }   

    public void setAge(int age){
    this.age=age;
    }
    
    
}
