package inheriTance;

public class Child extends Parent {  // single level inheritance
	
	public void p1()
	{
		System.out.println("cp");
	}
	
	public void education()
	{
		System.out.println("C - doing mbbs");
	}
	
	public void marriage()
	{
		System.out.println("C- love marriage");
	}
	
	public void addition(int num)
	{
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		Parent p = new Child();
		c.education();
		c.marriage();
		c.property();
		c.addition(100);
		c.p1();
		p.p1();
	}
}
