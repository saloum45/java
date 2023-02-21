public class testcarre {
    public static void main(String[] args) {
        carre c=new carre();
        c.setCote(5);
        float ct=c.getCote();
        float s=c.surface();
        float p=c.perimetre();
        System.out.println("le côté du carré est : "+ct);
        System.out.println("la surface du carré est : "+s);
        System.out.println("le perimetre du carré est : "+p);
    }
}
