/**
 * carre
 */
public class carre {

    private float cote;

    public float perimetre (){
        return cote*4;
    }

    public float surface (){
        return cote*cote;
    }

    public float getCote(){
        return cote;
    }

    public void setCote(int valeur){
        cote=valeur;
    }
}

 