package abstractionInterFace;

public class TestInterFaceBank {
	
	public static void main(String[] args) {
		
		SBI s = new SBI();
		PNB p = new PNB();
		
		System.out.println("sbi rate of interest--> "+s.rateofInterest());
		System.out.println("pnb rate of interest --> "+p.rateofInterest());
		
	}

}
