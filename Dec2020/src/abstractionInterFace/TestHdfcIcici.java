package abstractionInterFace;

public class TestHdfcIcici implements Hdfc,Icici {
	public void creditcard() {
		
		System.out.println("credit card");
	}
	public void offer()
	{
		System.out.println("10% off");
	}
	public static void main(String[] args) {
		TestHdfcIcici t = new TestHdfcIcici();
		Hdfc  t2 = new TestHdfcIcici();
		t.creditcard();
		t.offer();
		Icici t3 = new TestHdfcIcici();
	//	Hdfc  t4 = new Hdfc();
		t2.creditcard();
	//	t2.offer();
		t3.creditcard();
	//	t3.offer();
	//	TestHdfcIcici t1 = new Icici();
		
		
	}
	
}
