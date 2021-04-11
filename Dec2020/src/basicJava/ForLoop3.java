package basicJava;

public class ForLoop3 {
	
	
	public static void main(String[] args) {
		
		
		int num;
		for(num=1; num<=7;num++)
		{
			System.out.println(num);
			if(num == 3)
			{
				System.out.println("lucky number is "+num);
				break;
			}
		}
		
			
	}

}
