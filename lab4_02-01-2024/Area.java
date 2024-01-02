import java.util.Scanner;

abstract class Shape {
    int a, b;
    abstract void printArea();
}


class Rectangle extends Shape {
    void printArea() {
        double area = a * b;
        System.out.println("Area of rectangle = " + area);
    }
}

class Triangle extends Shape {
    void printArea() {
        double area = (a * b) / 2.0;
        System.out.println("Area of triangle = " + area);
    }
}

class Circle extends Shape {
    void printArea() {
        double area = 3.14 * a * a;
        System.out.println("Area of circle = " + area);
    }
}

class Area {
    public static void main(String a[]) {

        Scanner sc = new Scanner(System.in);

        Shape ob1 = new Rectangle();
        System.out.println("Enter the dimensions of the rectangle (length and breadth)");
        ob1.a = sc.nextInt();
        ob1.b = sc.nextInt();
        Shape ob2 = new Triangle();
        System.out.println("Enter the dimensions of the triangle (base and height)");
        ob2.a = sc.nextInt();
        ob2.b = sc.nextInt();
        

        Shape ob3 = new Circle();
        System.out.println("Enter the dimensions of the circle (radius)");
        ob3.a = sc.nextInt();

	      ob1.printArea();
	      ob2.printArea();
        ob3.printArea();
    }
}
