package geometry;

public class Rectangle {

	
	
	 private double length;
	    private double breadth;

	    public Rectangle(double length, double breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }

	    public double getArea() {
	        return length * breadth;
	    }

	    public double getPerimeter() {
	        return 2 * (length + breadth);
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
}
