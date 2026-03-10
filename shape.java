abstract class shape
{
    abstract void area();
    abstract void perimeter();
}
class circle extends shape
{
    double radius;
    circle(double radius)
    {
        this.radius=radius;
    }
    public void area()
    {
        double area=3.14*radius*radius;
        System.out.println("Area of circle is "+area);
    }
    public void perimeter()
    {
        double perimeter=2*3.14*radius;
        System.out.println("Perimeter of circle is "+perimeter);
    }
}
class rectangle extends shape
{
    double length;
    double breadth;
    rectangle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public void area()
    {
        double area=length*breadth;
        System.out.println("Area of rectangle is "+area);
    }
    public void perimeter()
    {
        double perimeter=2*(length+breadth);
        System.out.println("Perimeter of rectangle is "+perimeter);
    }
}
public class shape_main {
    public static void main(String[] args) {
        shape s=new circle(5);
        s.area();
        s.perimeter();
        shape s1=new rectangle(4,6);
        s1.area();
        s1.perimeter();
    }
}