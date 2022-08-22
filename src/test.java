public class test {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(t.c);
        Triangle t1 = new Triangle(3,4,5);
        System.out.println(t1);
        System.out.println("perimeter is " +t1.getPerimeter());
        System.out.println(t1.getMultiplyPerimeter(2));
//        t.a = 3;
//        t.b = 5;
//        t.c = 4; // значения для конкретного треугольника t
    }
}
