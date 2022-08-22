package ClassworkKonoplyanik.CW7;

public class Triangle extends Figure {
    int a,b,c;

    public Triangle (int a, int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }


    @Override
    public int getPerimeter() {
        return a+b+c;
    }
}
