package oppsConcept;

public class Student2 {
	
	int rollno;  //0
	String name;  // null
	
	public void welcome()
	{
		System.out.println("welcome All - method executed");
		// no of lines here
	}
	
public static void main(String[] args) {
		
		Student2 s1 = new Student2(); // creating object
		int num=100;
		
		s1.rollno = 100;
		s1.name = "Raghvendra"; // initialise instance variable in same class same main method
		
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		
		s1.welcome();
		
		s1.addStudent();  // 101 and dinesh but not print - Arun 
		System.out.println(s1.rollno); // 101 
		System.out.println(s1.name); //dinesh
		
		s1.printpassdata(200);
		s1.printpassdata(300);
		
	}

public void insertStudentData(int r , String nm)
{
	System.out.println(r);
	System.out.println(nm);
}


	public void printpassdata(int num)  // mehtod signature
	{
		System.out.println(num);
	}

public void addStudent()
{
	System.out.println("add student method");
	
	
	//s1.rollno = 101;
	// s1.name = "Dinesh";
	
}
}
