package exceptionDemo;

public class FInallyCode3 {
	// exception occur
	
	public static void main(String[] args) {
		
		try {
			int number = 25;
			System.out.println(number/0);
		}catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException pointer "+e);
		}
		
		finally {
			System.out.println("finally block");
		}
		
		System.out.println("last line of code ");
	}

}
