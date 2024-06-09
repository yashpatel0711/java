package multiple_catch_blocks;

public class Catch {

	public static void main(String[] args) {
		// TODO Auto-generated me;
		
		try {
            int[] a = new int[5];
            a[5] = 30 / 5; 

        } 
		
		catch (ArithmeticException e)
		{
			System.out.println("Arithmetic Exception: Division by zero is not allowed.");
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException: Array index is out of bounds.");
		}
	}

}
