package keywordsinJava;

public class Student {
	
	int roll;
	String name;
	
	public Student(int roll, String n) {
		
		//this.roll = roll;
		//this.name = name;
	
 //instance     //localvaribale
		this.roll       =   roll;
		name = n;
	
	}
	
	public void display()
	{
		System.out.println(roll);
		System.out.println(name);
	}

	public static void main(String[] args) {

		Student s = new Student(100,"savita");
		s.display();
		
	}

}
