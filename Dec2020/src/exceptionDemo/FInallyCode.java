package exceptionDemo;

public class FInallyCode {
	// exception does not occur
	
	public static void main(String[] args) {
		
		try {
			int number = 25;
			System.out.println(number/5);
		}catch(NullPointerException e)
		{
			System.out.println("null pointer "+e);
		}
		
		finally {
			System.out.println("finally block");
		}
		
		System.out.println("last line of code ");
	}

}
