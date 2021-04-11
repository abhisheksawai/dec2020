package exceptionDemo;

public class NullPointerExceptionHandle {
	
	public static void main(String[] args) {
		
		System.out.println("few line in start");
		
		try {
		String name = null;
		System.out.println(name.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("please initislise string "+e);
		}
		
		System.out.println("few line in end");
		
	}

}
