public class Triangle { // если убрать public,то не будет видно из других папок
   public double a,b,c;// стороны треугольника
    private int  coefficient;
//    переменные могут быть public, private, default (если ничего не написано) и protected
    public Triangle(){
      this.a=3;
      this.b=4;
      this.c=5;
    }
    public Triangle (double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getPerimeter(){
        return this.a +this.b +this.c;
    }

    /**
     * this is my super method
     * @param coefficient - value that we use
     * @return
     */
    public double getMultiplyPerimeter(int coefficient){
        this.coefficient=coefficient;
        return this.getPerimeter() * coefficient;

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
    private void incrementA(){
        this.a++;
    }
}
