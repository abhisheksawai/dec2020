package keywordsinJava;

public class StatMethod {
	
	
	public void m1()
	{
		System.out.println("m1");
	}
	
	static void m2()
	{
		System.out.println("m2-static");
	}
	
	public static void main(String[] args) {
		
		StatMethod sm = new StatMethod();
		sm.m1();
		sm.m2();
		StatMethod.m2();
		
	}

}
