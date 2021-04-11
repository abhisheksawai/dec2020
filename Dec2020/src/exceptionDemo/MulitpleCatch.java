package exceptionDemo;

public class MulitpleCatch {
	
	public static void main(String[] args) {
		
		System.out.println("few line in start");
		
		try {
		int number = 100/0;
		System.out.println("division is "+number);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("arraindex "+e);
		}
		catch(NullPointerException e)
		{
			System.out.println("null pointer "+e);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("arith "+e);
			int num=100;
			num=num+20;
			System.out.println("num +20 "+num);
		}
		
		System.out.println("few line in end");
		
	}

}
