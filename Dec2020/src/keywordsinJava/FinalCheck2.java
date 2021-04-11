package keywordsinJava;

public class FinalCheck2 {
	
	final int anothermark;
	
	public FinalCheck2()
	{
		anothermark = 60;
	}
	
	public void showmark()
	{
		//anothermark = 50;
		System.out.println("another mark "+anothermark);
	}

	public static void main(String[] args) {
		
		
		FinalCheck2 f = new FinalCheck2();
		f.showmark();
	}
	
}
