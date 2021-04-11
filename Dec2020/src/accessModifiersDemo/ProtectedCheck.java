package accessModifiersDemo;

public class ProtectedCheck {
	
	protected void m5()
	{
		System.out.println("prot m5 ");
	}
	
	public void m6()
	{
		System.out.println("m6");
	}
	
	public static void main(String[] args) {
		
		
		ProtectedCheck pc = new  ProtectedCheck();
		pc.m5();
	}

}
