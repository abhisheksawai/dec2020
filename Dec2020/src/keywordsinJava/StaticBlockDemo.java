package keywordsinJava;

public class StaticBlockDemo {
	
	public StaticBlockDemo()
	{
		System.out.println("c1");
	}
	
	static
	{
		System.out.println("s1-byprachi");
	}
	
	public static void main(String[] args) {
		
		StaticBlockDemo sb = new StaticBlockDemo();
		
		System.out.println("m1");
		
	}


	
}
