package accessModifiersDemo;

public class PrivateAces {
	
	public int i =10;
	private int num = 100;
	
	public void m1()
	{
		System.out.println("public m1");
	}
	
	private void m2()  //bitter data
	{
		System.out.println("private m2");
	}
	
	
	public static void main(String[] args) {
		
		PrivateAces pa = new PrivateAces();
		System.out.println(pa.i);
		System.out.println(pa.num);
		
		pa.m1();
		pa.m2();
		
		
		
	}

}
