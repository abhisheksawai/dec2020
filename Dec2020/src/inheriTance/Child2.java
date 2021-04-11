package inheriTance;

public class Child2 extends Parent {  // single level inheritance
	
	public void education()
	{
		System.out.println("C - doing mbbs");
	}
	
	public static void main(String[] args) {
		
		Child2 c = new Child2();
		Parent c2 = new Child2();
		GrandParent c3  = new GrandParent();
		c3.house();
		Parent c4 = new Parent();
		// 221 or 224 ?
		
		//Child c5 = new Parent();
		
		
		c.education();
		
		c.property();
		c.marriage();
		c.house();
		
		c2.property();
		c2.house();
		
		
	}

}
