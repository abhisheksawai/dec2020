package exceptionDemo;

public class TryCatchTry {
	
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
			{ 
				
				try
				{
					System.out.println("try block in catch");
				}catch(NullPointerException e1)
				{
					System.out.println("null inside"+e1);
				}
				System.out.println("null "+e);
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
