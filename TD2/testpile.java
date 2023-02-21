package TD2;

public class testpile {
    public static void main(String[] args) {
        pile tab = new pile(4);
        tab.empiler(5);
        tab.empiler(-1);
        tab.empiler(9);
        tab.empiler(33);
        tab.listerpile();
        tab.depiler();
        tab.listerpile();
        tab.viderpile();
        tab.listerpile();
        System.out.println(tab.ispilevide());
        
    }
}
