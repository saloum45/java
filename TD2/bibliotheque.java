package TD2;

public class bibliotheque {
    public static void main(String[] args) {
        livre vie = new livre("vie de boy", "F.oyono", 185, 775);
        livre collegienne = new livre("collegienne", 5578);
        System.out.println("Titre       Auteur      Nombre_page     Num_livre");
        System.out.println(vie.getTitre()+"     "+vie.getAuteur()+"     "+vie.getNpage()+"      "+vie.getNuml());
        System.out.println(collegienne.getTitre()+"     "+collegienne.getAuteur()+"     "+collegienne.getNpage()+"      "+collegienne.getNuml());
    }
}
