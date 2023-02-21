package package1;
public class Personne2 {
    protected String nom;
    protected String prenom;
    protected int age;
    protected char sexe;

    public String getNom() {
        return this.nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(this.age==0){
            System.out.println("la personne est deja morte ");
        }else{
            this.age = age;
        }
        
    }

    public char getSexe() {
        return this.sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public void grandir(int age){
        if(this.age==0){
            System.out.println("la personne est deja morte ");  
        }else{
            this.age+=age;
        }
        
    }

    public void mourrir(){
        if(this.age==0){
            System.out.println("la personne est deja morte ");
            
        }else{
            this.age=0;
        }
        
    }

    public Personne2(String nom , String prenom, int age, char sexe){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
        this.sexe=sexe;
    }

    public Personne2(String nom , String prenom, int age){
        this(nom, prenom, age, 'M');
    }

    public Personne2(String nom , String prenom){
        this(nom, prenom, 0, 'M');
    }
    

    public Personne2(){
        this("inconnu", "inconnu");
    }
    public String toString(){
        return  "{ "+"\nnom : "+this.nom+"\nprenom : "+this.prenom+"\nage : "+this.age+"\n}";
    }
    
}
