package keywordsinJava;

public class StaticKey {
	
	int rollno;
	String name;
	static String collegename="abc college";
	
	public StaticKey(int r, String nm)
	{
		rollno = r;
		name = nm;
	}
	
	public void showdetails()
	{
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(collegename);
	}
	
	public static void main(String[] args) {
		
		StaticKey sk1 = new StaticKey(100,"abhishek");
		System.out.println("sk1.rollno--> "+sk1.rollno);
		System.out.println("sk1.name--> "+sk1.name);
		System.out.println("sk1.collegename--> "+sk1.collegename);
		
		System.out.println("sk1.rollno--> "+StaticKey.collegename);
		
	//	sk1.showdetails();
		
		StaticKey sk2 = new StaticKey(101,"jayanta");
	//	sk2.showdetails();
		
		
		
		
	}
	

}
