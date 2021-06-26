import java.util.Scanner;
 
public class Jaskaran_2015171_4 {
    public static void main(String args[])
    {
        double l, b, r, s;
        Area area = new Area();
        Scanner sc = new Scanner(System.in);
  
        System.out.print("\nEnter Length & Breadth of Rectangle: ");
        l = sc.nextDouble();
        b = sc.nextDouble();
        area.rectangleArea(l, b);
 
        System.out.print("\nEnter Side of a Square: ");
        s = sc.nextDouble();
        area.squareArea(s);
 
        System.out.print("\nEnter Radius of Circle: ");
        r = sc.nextDouble();
        area.circleArea(r);
    }
}   

abstract class Shape {
    abstract void rectangleArea(double l, double b);
    abstract void squareArea(double s);
    abstract void circleArea(double r);
}
 
class Area extends Shape {
 
    void rectangleArea(double l, double b)
    {
        double area = l*b;
        System.out.println("Area of Rectangle: "+area);
    }
     
    void squareArea(double s)
    {
        double area = s*s;
        System.out.println("Area of Square: "+area);
    }
     
    void circleArea(double r)
    {
        double area = 3.14*r*r;
        System.out.println("Area of Circle: "+area);
    }
}
         
