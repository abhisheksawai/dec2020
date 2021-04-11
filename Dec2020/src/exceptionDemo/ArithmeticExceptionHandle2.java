package exceptionDemo;

public class ArithmeticExceptionHandle2 {
	
	public static void main(String[] args) {
		
		System.out.println("few line in start");
		try {
				int number = 100/0;
				System.out.println("division is "+number);
		}catch(ArithmeticException e)
				{
					System.out.println("from dinesh exception is " +e);
				}
		
		System.out.println("400 few line in end"); // 400
		
	}

}
