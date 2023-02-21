package TD2;

public class livre {
    private String titre;
    private String auteur;
    private int npage;
    private int nbl;
    private int numl;

    public int getNuml() {
        return this.numl;
    }

    public void setNuml(int numl) {
        this.numl = numl;
    }

    public int getNbl() {
        return nbl;
    }

    public void setNbl(int nbl) {
        this.nbl = nbl;
    }

    
    public String getTitre() {
        return this.titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNpage() {
        return this.npage;
    }

    public void setNpage(int npage) {
        this.npage = npage;
    }
    public livre(String titre, String auteur, int npage, int numl){
        this.titre=titre;
        this.auteur=auteur;
        this.npage=npage;
        this.numl=numl;
        nbl+=1;
    }
    public livre (String titre, int numl){
        this(titre,"inconnu",0,numl);
        nbl+=1;
    }
    public void changerp(){
        this.npage+=1;
    }
}
