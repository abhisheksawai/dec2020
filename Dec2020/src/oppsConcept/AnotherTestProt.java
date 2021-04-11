package oppsConcept;

import accessModifiersDemo.ProtectedCheck;

public class AnotherTestProt extends ProtectedCheck{
	
	public static void main(String[] args) {
		
		ProtectedCheck pc = new  ProtectedCheck();
	//	pc.m5();
		pc.m6();
	
		AnotherTestProt atp = new AnotherTestProt();
		atp.m5();
	}

}
