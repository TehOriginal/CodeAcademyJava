
public class uzduotis_B_calc {

	public void closest(int[] xy1, int[] xy2, int[] xy3)
	{

		double length_1 = Math.sqrt ( Math.pow ( xy2[0]-xy1[0] , 2 ) + Math.pow ( xy2[1]-xy1[1] , 2 ) );
		double length_2 = Math.sqrt ( Math.pow ( xy3[0]-xy1[0] , 2 ) + Math.pow ( xy3[1]-xy1[1] , 2 ) );
		if(length_1 > length_2)
		{
			
			System.out.println("Antrasis monstras yra arciau: " + length_2 + " < " + length_1);
			
			
		}
		if(length_1==length_2)
		{
			
			
			System.out.println("Abu monstrai yra vienodai nutole: " + length_1 + " = " + length_2);
			
		}
		else
		{
			
			System.out.println("Pirmasis monstras yra arciau: " + length_1 + " < " + length_2);
			
		}
		
		
		
		
		
	}


	
	
}
