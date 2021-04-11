package collectionDemo;

import java.util.ArrayList;

public class ArrayListStudent {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();  //
		a.add(new Student(101, "harshal"));
		a.add(new Student(102, "vishal"));
		a.add(new Student(103, "Jayanta"));
		a.add(new Employee(83483, "arun", 1));
		
		System.out.println(a);
		System.out.println(a.toString());
		
		for( Object b :a )
		{
			System.out.println();
			
			if(b instanceof Student)
			{
				System.out.println(((Student) b).rollno);
				System.out.println(((Student) b).name);
			}
			
			if(b instanceof Employee)
			{
				System.out.println(((Employee) b).empid);
				System.out.println(((Employee) b).empname);
				System.out.println(((Employee) b).empno);
				
			}
		}
		
	
		
	}

}
