package abstractionInterFace;

public class TestWorkAndBank implements BankOfAmerica,RBI,WorldBank {
	
	public static void main(String[] args) {
		
		TestWorkAndBank t = new TestWorkAndBank();
		System.out.println(t.rateofInterest());
		System.out.println(t.world());
		t.boa();
		
	}

	public int world() {
		return 10;
	}

	public int rateofInterest() {
		return 20;
	}

	public void boa() {
		System.out.println("boa");
	}

}
