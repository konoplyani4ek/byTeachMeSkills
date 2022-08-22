package ClassworkKonoplyanik.CW7;

public class TestClass {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Triangle t = new Triangle(3,2,1);
        System.out.println("circle " +c.getPerimeter());
        System.out.println("triangle "+ t.getPerimeter());
    }
}
