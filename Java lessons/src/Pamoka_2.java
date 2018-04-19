import java.util.Random;

public class Pamoka_2 {
	public static void main(String[] args) {
		
		int[] x = new int [5];
		
		Random ran = new Random();
		x[0] = ran.nextInt(10);
		x[1] = ran.nextInt(10);
		x[2] = x[0] * x[1];
		if (x[2] % 2 == 0)
		{
			x[3] = 1;
			
		}
		
		else
		{
			
			x[3] = 0;
			
		}
		
		x[4] = java.lang.Math.max(x[0], x[1]);
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println(x[i]);
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	

}
