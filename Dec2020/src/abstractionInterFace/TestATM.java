package abstractionInterFace;

public class TestATM extends ATMmachine{
	
	public static void main(String[] args) {
		
		TestATM am = new TestATM();
		am.Statement();		
		am.withdraw();
	}

	@Override
	void withdraw() {
		// TODO Auto-generated method stub
		
		System.out.println("take money 500");
		
		
	}

}
