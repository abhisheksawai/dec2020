package stringDemo;

public class StringSplit {
	
	public static void main(String[] args) {
		
		String n1 ="We are learning Selenium with Java";
		
		String words[] = n1.split("\\s");
		
		System.out.println(words.length);
		
		for( String w:words )
		{
			System.out.println(w);
		}
		
		
		
	}

}
