package exceptionDemo;

public class ExceptionHandle {
	
	public static void main(String[] args) {
		
		System.out.println("few line in start");
		try {
				int number = 100/0;
				System.out.println("division is "+number);
		}catch(ArithmeticException e)
				{
					System.out.println("from dinesh exception is " +e);
				}
		
		System.out.println("few line in end");
		
	}

}
