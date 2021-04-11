package arraysDemo;

public class MultiDArray2 {
	
	public static void main(String[] args) {
		
		int a[][] = new int [3][3];
		a[0][0] = 500;
		a[0][1] = 501;
		a[0][2] = 502;
		
		a[1][0] = 510;
		a[1][1] = 511;
		a[1][2] = 512;
		
		a[2][0]=20;
		a[2][1]=21;
		a[2][2]=22;
		
		
		
		for(int i = 0 ; i < 3; i ++)  // row
		{
			for(int j =0 ; j < 3 ; j ++)  // column
			{
				System.out.println(a[i][j]);
			}
		}
		
		
	}

}
