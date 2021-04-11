package arraysDemo;

public class MultiDArray {
	
	public static void main(String[] args) {
		
		int a[][] = new int [2][2];
		a[0][0] = 500;
		a[0][1] = 501;
		a[1][0] = 510;
		a[1][1] = 511;
		
		for(int i = 0 ; i < 2; i ++)  // row
		{
			for(int j =0 ; j < 2 ; j ++)  // column
			{
				System.out.println(a[i][j]);
			}
		}
		
		
	}

}
