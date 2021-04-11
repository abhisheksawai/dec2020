package basicJava;

public class ForContinue2 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 4; i++) {  // outerloop is executing 3 times
			for (int j = 1; j < 4; j++) {  // inner loop is executing 3 times
				{
					System.out.println("i is "+i+" | j is-> "+j);
					if(j==2)
					{
						System.out.println("j is "+j+ " hence continue");
						continue;
						//System.out.println("arun doubt");
					}
				}
			}
		}
		
		
		
		
	}
	
	
}
