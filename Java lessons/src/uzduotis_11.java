import java.util.Scanner;

public class uzduotis_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] masyvas = new int[10];
		int n = 0;
		System.out.println("Irasykite 10 skaiciu");
		for(int i = 0; i < 10; i++)
		{
			masyvas[i] = input.nextInt();
			
			
		}
while(n < 10)
{
		for(int i = 0; i < 10; i++)
		{
			int a = masyvas[i];
			for(int u = i+1 ; u < 10; u++)
			{
				if(a == masyvas[u] )
				{
					masyvas[u]++;
					
				}
				
				
				
			}

			
			
		}
		n++;
}

		System.out.print("Masyvas: ");
		for(int i = 0; i < 10; i++)
		{
			System.out.print(masyvas[i] + " ");
			
			
			
		}
	}

}
