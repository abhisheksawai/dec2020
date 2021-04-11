package exceptionDemo;

public class MultipleTry {
	
	public static void main(String[] args) {
		
		try
		{
			try
			{
				System.out.println("inner try");
				int num=100;
				System.out.println(num/0);
			}catch(ArithmeticException e) 	
				{ 
					System.out.println("arithmetic exception"); 	
				}
			
			String name = null;
			try {
				name = null;
				System.out.println(name.length());
			}catch (NullPointerException e )
			{ System.out.println("name.lentg inside catch");
				System.out.println(name.length());
				System.out.println("null pointer");
				//System.out.println(name.length());
				}
			
			int no=200;
			System.out.println(no/0);
			
		}catch(Exception e)
		{
			System.out.println("exception e  ->> " + e);
		}
		
		System.out.println("last code");
	}

}
