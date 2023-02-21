package TD2;
import java.lang.Math;

public class point {
    private char nom;
    // private char nom1;
    private float X;
    private float Y;

    // les getters et setters
    public char getNom() {
        return this.nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public float getX() {
        return this.X;
    }

    public void setX(float X) {
        this.X = X;
    }

    public float getY() {
        return this.Y;
    }

    public void setY(float Y) {
        this.Y = Y;
    }

    // le contructeur 
    public point(char nom, float X, float Y){
        this.nom=nom;
        this.X=X;
        this.Y=Y;
    }

    // les comportements
    public void afficher(){
        System.out.print("affichage du point : ");
        System.out.print(this.nom);
        System.out.println("("+this.X+","+this.Y+")");
    }

    public void deplacer(float X, float Y){
        this.X+=X;
        this.Y+=Y;
    }

    public double distance(float X, float Y){
        return Math.sqrt(Math.pow((this.X-X), 2)+Math.pow((this.Y-Y), 2));
    }

}
