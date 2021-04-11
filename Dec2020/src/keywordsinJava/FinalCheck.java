package keywordsinJava;

public class FinalCheck {
	
	int mark = 50;
	final int anothermark = 70;
	
	public void showmark()
	{
		mark = 60;
		System.out.println(mark);
		
	//	anothermark = 80;
		System.out.println("another mark "+anothermark);
	}

	public static void main(String[] args) {
		
		
		FinalCheck f = new FinalCheck();
		f.showmark();
	}
	
}
