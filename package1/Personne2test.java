package package1;

public class Personne2test {
    public static void main(String[] args) {
        Personne2 anna = new Personne2("diop", "anna" ,23, 'F');
        Personne2 modou = new Personne2("ndiaye","modou", 34);
        Personne2 bb = new Personne2("bebe","ouzou");
        Personne2 neant = new Personne2();
        // Etudiant salem = new Etudiant("malick", "salem", 22, 'M',"AB77CV");
        // Etudiant salemEtudiant = new Etudiant("aicha", "kounte", 18, 'M', "B55PO");
        // Personne2 frere =new Personne2("matar", "fall", 40, 'M');
        // Eleve der = new Eleve("der", "diop", 15, 'M', "YI559O", salem, salem);
        Etudiant soeur = new Etudiant("kounte", "aicha", 22, 'M', 220215);
        Personne2 frere = new Personne2("fall", "matar", 40, 'M');
        Eleve salem = new Eleve("malick", "salem", 20, 'M', 220215,"second", soeur, frere);
        // System.out.println(anna.getNom()+" "+anna.getPrenom()+" "+anna.getAge()+" "+anna.getSexe());
        // System.out.println(modou.getNom()+" "+modou.getPrenom()+" "+modou.getAge());
        // System.out.println(bb.getNom()+" "+bb.getPrenom());
        // System.out.println(neant.getNom()+" "+neant.getPrenom());
        // anna.grandir(5);
        // System.out.println("anna a grandi de 5 ans");
        // System.out.println(anna.getNom()+" "+anna.getPrenom()+" "+anna.getAge()+" "+anna.getSexe());
        // anna.mourrir();
        // System.out.println(" \t anna est morte");
        // System.out.println(anna.getNom()+" "+anna.getPrenom()+" "+anna.getAge()+" "+anna.getSexe());
        // modou.grandir(45);
        // System.out.println(modou.getNom()+" "+modou.getPrenom()+" "+modou.getAge());
        // System.out.println(anna);
        // System.out.println(modou);
        System.out.println(salem);
        // System.out.println(salem.getSoeur());
        // System.out.println(salem.getFrere());


        
    }
}
