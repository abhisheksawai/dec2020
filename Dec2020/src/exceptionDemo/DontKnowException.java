package exceptionDemo;

public class DontKnowException {
	
	public static void main(String[] args) {
		
		System.out.println("few line in start");
		
		try {
		String name = null;
		System.out.println(name.length());
		}
		catch(Exception e)
		{
			System.out.println("Exception of code is  "+e);
		}
		
		System.out.println("few line in end");
		
	}

}
