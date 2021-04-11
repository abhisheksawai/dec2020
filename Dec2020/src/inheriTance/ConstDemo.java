package inheriTance;

public class ConstDemo {
	
	int num;
	String name;
	
	public ConstDemo()  // default const
	{
		System.out.println("c1");
	}
	
	public static void main(String[] args) {
		ConstDemo cd = new ConstDemo();
		cd.m1();
		System.out.println("welcome");
	}

	public void m1()
	{
		System.out.println("m1");
	}
}
