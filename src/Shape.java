abstract class Shape {
    public abstract double area();
    public abstract double L();
}
class Circle extends Shape {
    private double r;
    public Circle(double r) {
        this.r = r;
    }
    public double L() {
        return 2*Math.PI*r;
    }
    public double area() {
        return Math.PI*r*r;
    }
}
class Rectangle extends Shape{
    private double a;
    private double b;
    public Rectangle(double s1, double s2) {
        a=s1; b=s2;
    }
    public double L() {
        return 2*(a+b);
    }
    public double area(){
        return a*b;
    }
}
class result {
    public static void main(String args[])
{
    Shape s1=new Circle(10);
    System.out.println("圆形面积为:"+s1.area());
    System.out.println("圆形周长为:"+s1.L());
    Shape s2=new Rectangle(2, 3);
    System.out.println("长方形面积为:"+s2.area());
    System.out.println("长方形周长为:"+s2.L());
}
}
