
public class Area {

	private  double length;
	private  double breadth;
	
	public  void setDim(double length,double breadth)
	{
		
		this.length=length ;
		this.breadth=breadth;
	}
	
	 public double  getArea()
	 {
		 return length *breadth ;
	 }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Area  rectangle = new  Area ();
		rectangle.setDim(2.5, 5.5);
		System.out.println("the area of the rectangle is :"+rectangle .getArea());
	}

}
