package inheriTance;

public class Polymorphism extends GrandParent {
	
	public void addition(int num)
	{
		System.out.println(num+num);
	}

	public void addition(int num1, int num2)
	{
		System.out.println(num1+num2);
	}

	public void addition(String name)
	{
		//System.out.println(num+num);
	}

	public static void main(String[] args) {
		
		
		Polymorphism p = new Polymorphism();
		p.addition(10);
		p.addition(5,7);
		
	}
	
}
