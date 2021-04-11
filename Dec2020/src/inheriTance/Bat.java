package inheriTance;

public class Bat extends Cricket{
	
	int run=100;
	
	public Bat()
	{ 
		super();
		System.out.println("bat const");
	}
	
	public void b1()
	{
		System.out.println("b1");
		System.out.println("run -> "+super.run);
		c1();
	}
	
//	public void c1()
//	{
//		System.out.println("c1");
//	}

	public static void main(String[] args) {
		
		Bat b = new Bat();
		b.b1();
		b.c1();
	//	c1();
		
	}
	
}
