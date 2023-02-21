package package1;

public class Etudiant extends Personne2 {
    protected int numero;

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    public Etudiant(String nom, String prenom, int age,char sexe, int numero){
        super(nom,prenom,age,sexe);
        this.numero=numero;
    }
    public String toString(){
        return  "{ "+"\nnom : "+this.nom+"\nprenom : "+this.prenom+"\nage : "+this.age+"\nsexe : "+this.sexe+"\nnumero : "+this.numero+"\n}";
    }
    
}