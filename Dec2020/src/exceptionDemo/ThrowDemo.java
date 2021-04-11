package exceptionDemo;

public class ThrowDemo {
	
	
	static void electionCheck(int age)
	{
		if(age < 18)
		{
			throw new ArithmeticException("not valid candidate for voting");
		
		}
		else
			System.out.println("go for voting");
	}

	public static void main(String[] args) {
		
		electionCheck(16);
	
		
		
	}
	
}
