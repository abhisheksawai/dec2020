package oppsConcept;

public class CreatObject {
	
	int rollno;  //0
	String name;  // null
	
	public static void main(String[] args) {
			
			CreatObject s1 = new CreatObject(); // creating object
			CreatObject s2 = new CreatObject();
			
			int num1=100, num2=200;
		
			System.out.println("num1 and 2"+num1+num2);
			
			int a=10,b=30;
			System.out.println("a and b"+a+b);
				
			CreatObject s7 = new CreatObject(), s8 = new CreatObject(); // 2
			
			s1.rollno = 100;
			s1.name = "Raghvendra"; 
			
			new CreatObject();
			new CreatObject().displayStudent();
			
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
