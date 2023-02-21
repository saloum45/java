import java.util.Scanner;
public class testetudiant {
    public static void main(String[] args) {
        etudiant salem=new etudiant();

        Scanner sc=new Scanner(System.in);
        System.out.println("saisir les information  de l'etudiant [nom filiere age]");
        salem.setter(sc.nextLine(), sc.nextLine(), sc.nextInt());
        System.out.println("Le nom de l'etudiant est : "+salem.getnom());
        System.out.println("La filiere de l'etudiant est : "+salem.getfiliere());
        System.out.println("L'age de l'etudiant est : "+salem.getage());


        // String nom=salem.getnom();
        // String filiere=salem.getfiliere();
        // int age=salem.getage();

        


    }
}
