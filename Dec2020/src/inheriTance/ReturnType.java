package inheriTance;

public class ReturnType {
	
	
	public void mesage()
	{
		System.out.println("mesage");
	}
	
	public void addition()
	{
		int sum;
		int num1=10,num2=12;
		sum = num1+num2;
		System.out.println(sum);
	}
	
	public int addition(int n, int m)
	{
		int sum;
		String name="xyz";
		sum = n+m;
		//System.out.println(sum);
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		ReturnType r = new ReturnType();
		r.mesage();
		r.addition();
		int myfriend = r.addition(10,  20 );
		
		System.out.println("my frined rupee "+myfriend);
		
	}

}
