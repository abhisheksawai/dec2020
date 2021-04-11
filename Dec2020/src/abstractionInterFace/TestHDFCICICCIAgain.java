package abstractionInterFace;

public class TestHDFCICICCIAgain implements Hdfc,Icici  {
	
	public void offer()
	{
		System.out.println("20% off");
	}
	
	public static void main(String[] args) {  // voice breaking arun
		
		Hdfc  t2 = new TestHdfcIcici();  /// chrome class  chrome c = new chrome .// savita
		Hdfc  t3 = new TestHDFCICICCIAgain(); // firefox  fire f = new fire | common
		
	//	t2.offer();  //The method offer() is undefined for the type Hdfc
	//	t3.offer();
		
		TestHdfcIcici  t4 = new TestHdfcIcici();
		TestHDFCICICCIAgain  t5 = new TestHDFCICICCIAgain();
		
		t2.creditcard();
		t3.creditcard();
		
		System.out.println("t4.offer");
		t4.offer();
		
		System.out.println("t5.offer");
		t5.offer();
		
	}

	public void creditcard() {
		
		System.out.println("creditcard from TestHDFCICICCIAgain");
	}

}
