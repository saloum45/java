package package1;

public class Eleve extends Etudiant {
    private String classe;
    private Etudiant soeur;
    private Personne2 frere;

    public String getClasse() {
        return this.classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Etudiant getSoeur() {
        return this.soeur;
    }

    public void setSoeur(Etudiant soeur) {
        this.soeur = soeur;
    }

    public Personne2 getFrere() {
        return this.frere;
    }

    public void setFrere(Personne2 frere) {
        this.frere = frere;
    }
    
    public Eleve(String nom, String prenom, int age, char sexe, int numero,String classe,Etudiant soeur,Personne2 frere) {
        super(nom, prenom, age, sexe, numero);
        //TODO Auto-generated constructor stub
        this.soeur=soeur;
        this.frere=frere;
        this.classe=classe;

    }
    public String toString(){
        return  "{ "+"\nnom : "+this.nom+"\nprenom : "+this.prenom+"\nage : "+this.age+"\nsexe : "+this.sexe+"\nnumero : "+this.numero+"\nclasse : "+this.classe+"\nsoeur : "+this.soeur+"\nfrere : "+this.frere+"\n}";
    }

}
