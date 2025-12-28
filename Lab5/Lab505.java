import java.util.Scanner;

class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public double calculateArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    protected double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14159 * radius * radius;
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class Lab505 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextDouble()) {
            double r = sc.nextDouble();
            double w = sc.nextDouble();
            double h = sc.nextDouble();

            Shape[] shapes = new Shape[2];
            
            shapes[0] = new Circle("Circle", r);
            shapes[1] = new Rectangle("Rectangle", w, h);

            for (Shape s : shapes) {
                System.out.println(s.calculateArea());
            }
        }

        sc.close();
    }
}