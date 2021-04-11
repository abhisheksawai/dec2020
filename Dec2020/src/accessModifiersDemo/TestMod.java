package accessModifiersDemo;

public class TestMod {
	
	public static void main(String[] args) {
		
		PrivateAces pa = new PrivateAces();
		System.out.println(pa.i);
	//	System.out.println(pa.num);
		
		pa.m1();
		pa.m2();
		
		
		DefaultCheck dc = new DefaultCheck();
		dc.m3();
		dc.m4();
		
	}

}
