package oppsConcept;

public class Student {
	
	int rollno;  //0
	String name;  // null
	
	public static void main(String[] args) {
			
			Student s1 = new Student(); // creating object
			int num=100;
			s1.rollno = 100;
			s1.name = "Raghvendra"; // initialise instance variable in same class same main method
			
			System.out.println(s1.rollno);
			System.out.println(s1.name);
			
			s1.insertStudentData(300, "Reshma");
			s1.displayStudent();
			
			s1.insertStudentData(301, "sabrish");
			s1.displayStudent();
			
		}

 		public void insertStudentData(int r , String nm)
			{
				rollno = r;
				name = nm;
			}
 		
 		public void displayStudent()
 		{
 			System.out.println("roll no is "+rollno+" | name is "+name);
 		}
 		


}
