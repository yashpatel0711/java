package geometry;
import geometry.Circle;
import geometry.Rectangle;
import geometry.Triangle;

public class GeometryPackageDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an instance of Circle
        Circle circle = new Circle(5);
        System.out.print("Circle Area: " + circle.getArea());
        System.out.print("Circle Perimeter: " + circle.getPerimeter());

        // Create an instance of Rectangle
        Rectangle rectangle = new Rectangle(4, 7);
        System.out.print("Rectangle Area: " + rectangle.getArea());
        System.out.print("Rectangle Perimeter: " + rectangle.getPerimeter());

        // Create an instance of Triangle
        Triangle triangle = new Triangle(3, 4, 3, 4, 5);
        System.out.print("Triangle Area: " + triangle.getArea());
        System.out.print("Triangle Perimeter: " + triangle.getPerimeter());

	}

}
