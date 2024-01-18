
//19

class M
{
    public static void main(String ar[])
    {
        Bird o;
        o = new Eagle();
        o.fly();
        o.makeSound();
        
        o = new Hawk();
        o.fly();
        o.makeSound();
    }
}

abstract class Bird
{
    abstract void fly();
    abstract void makeSound();
}

class Eagle extends Bird
{   
    void fly()
    {
        System.out.println("Eagles flies by soring method");
    }

    void makeSound()
    {
        System.out.println("Peal Call: high-pitched, prolonged");
    }
}

class Hawk extends Bird
{
    void fly()
    {
        System.out.println("hawk flaps its wings rapidly, and then uses that momentum to glide smoothly and gracefully through the air");
    }

    void makeSound()
    {
        System.out.println("Hawk kee-eeeee-arr");
    }
}




//20
import java.util.Scanner;
class AAAA
{
    public static void main(String ma[])
    {
        Shape o;
        o = new Circle();
        System.out.println("Area of circle:"+o.calculateArea());
        System.out.println("Perimeter of circle:"+o.calculatePerimeter());
        o = new Triangle();
        System.out.println("Area of Triangle:"+o.calculateArea());
        System.out.println("Perimeter of Triangle:"+o.calculatePerimeter());
        
    }
}
abstract class Shape
{
    abstract float calculateArea();
    abstract float calculatePerimeter();
    float a,b,c,r;
    float pi = 3.14f;
}

class Circle extends Shape
{   
    Scanner sc = new Scanner(System.in);
    float calculateArea()
    {   
        System.out.println("Enter the radius");
        super.r = sc.nextFloat();
        return super.pi*(super.r)*(super.r);
    }
    float calculatePerimeter()
    {
        return 2*super.pi*(super.r);
    }
}

class Triangle extends Shape
{   
    Scanner sc = new Scanner(System.in);
    float calculateArea()
    {   
        System.out.println("Enter the three sides of triangle");
        super.a = sc.nextFloat();
        super.b = sc.nextFloat();
        super.c = sc.nextFloat();
        float s = (super.a + super.b + super.c)/(float)2;
        double area = Math.sqrt(s*(s-super.a)*(s-super.b)*(s-super.c));
        return (float)area;
    }
    float calculatePerimeter()
    {
        return super.a + super.b + super.c;
    }
}

    
