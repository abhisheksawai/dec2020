package inheriTance;

public class StudentAgain {
	
	int roll;
	String name;
	
	public StudentAgain(int r, String nm)
	{
		roll = r;
		name = nm;
	}
	
	public void displayStudent()
		{
			System.out.println("roll no is "+roll+" | name is "+name);
		}
	
	public static void main(String[] args) {
		
		StudentAgain cd = new StudentAgain(100, "Arun");
		cd.displayStudent();
		
		StudentAgain cd2 = new StudentAgain(102, "Vishal");
		cd2.displayStudent();
		
		// cd.roll = 40;
		// cd.name ="abhishek";
		
		//cd.insertrecord(50,"arun")
	}

}
