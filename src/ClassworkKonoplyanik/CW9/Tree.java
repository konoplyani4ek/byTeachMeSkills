package ClassworkKonoplyanik.CW9;

public class Tree {
    public static int Tree_count = 0;
    private String treeName;

    public static void printTreecount(){
        System.out.println(Tree_count);
    }
    static {
        System.out.println("we start doing it");
    }
    private static class TreeHolder {

    }

    public Tree(){
        Tree_count++;
    }
}
