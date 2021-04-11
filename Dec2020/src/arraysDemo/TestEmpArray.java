package arraysDemo;

public class TestEmpArray {
	
	public static void main(String[] args) {
		
		EmpArrayDemo e1 = new EmpArrayDemo(100,"abhishek");
		EmpArrayDemo e2 = new EmpArrayDemo(102,"harshal");
		EmpArrayDemo e3 = new EmpArrayDemo(103,"savita");
		
		//int a[] = new int[5]; 
		
		EmpArrayDemo e[] = new EmpArrayDemo[3];
		e[0] = e1;
		e[1] = e2;
		e[2] = e3;
		
		for( EmpArrayDemo d : e )
		{
			System.out.println(d.empName);
			System.out.println(d.empno);
		}
		
	}

}
