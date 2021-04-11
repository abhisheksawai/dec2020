package keywordsinJava;

public class TestBlocks extends ParentBlock{
	
	
	{
		System.out.println("i1-7");
	}
	
	
	static
	{
		System.out.println("s1");
	}
	
	{
		System.out.println("i1");
	}
	
	public TestBlocks()
	{
		System.out.println("c1");
	}
	
	{
		System.out.println("i1-20");
	}
	
	public static void main(String[] args) {
		
		TestBlocks t = new TestBlocks();
		// s1 i1 c1 
		// s0,s1,i0,i1,p0,c1 - jayanta,
		// s1,s0,i0,i1,p1,c1 - divyani
		// s0 s1 i0 p0 i1 c1- crrect


	}
	{
		System.out.println("i1-34");
	}
}
