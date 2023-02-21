package TD2;


public class testpoint {
    public static void main(String[] args) {
        // Double nbr=5.12545865;
        point m = new point('m', 3, 4);
        m.afficher();
        m.deplacer(1, 2);
        m.afficher();
        // m.distance(4, 2);
        System.out.print("la distance est egal à : ");
        System.out.format("%.2f",m.distance(4, 2) );        
    }
}
