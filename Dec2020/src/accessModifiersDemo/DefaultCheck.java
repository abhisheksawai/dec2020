package accessModifiersDemo;

public class DefaultCheck {
	
	
	public void m3()
	{
		System.out.println("public void m3 from test");
	}
	
	void m4()
	{
		System.out.println("void m4");
	}

	
	public static void main(String[] args) {
		DefaultCheck dc = new DefaultCheck();
		dc.m3();
		dc.m4();
		
	}
	
	
}
