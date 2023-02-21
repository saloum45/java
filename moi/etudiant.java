public class etudiant {
    private String nom,filiere;
    private int age;
    public String getnom(){
        return nom;
    }
    public String getfiliere(){ 
        return filiere;
    }
    public int getage(){
        return age;
    }
    public void setter(String noms,String filieres, int ages){
        nom=noms;
        filiere=filieres;
        age=ages;
    }
}
