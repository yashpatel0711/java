package geometry;
import geometry.Circle;
import geometry.Rectangle;
import geometry.Triangle;

public class GeometryPackageDemo {
    public static void main(String[] args) {
        // Create an instance of Circle
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        // Create an instance of Rectangle
        Rectangle rectangle = new Rectangle(4, 87);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        // Create an instance of Triangle
        Triangle triangle = new Triangle(12, 4, 43, 4, 5);
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
    }
}
