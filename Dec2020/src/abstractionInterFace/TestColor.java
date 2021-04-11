package abstractionInterFace;

public class TestColor implements Color{

	public void black() {
		
		System.out.println("black");
	}

	public static void main(String[] args) {
		
		TestColor tc = new TestColor();
		tc.white();
		tc.black();
				
		
	}
	
}
