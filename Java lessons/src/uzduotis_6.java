import java.util.Scanner;

public class uzduotis_6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n;
		int a = 0;
		
		
		System.out.print("Masyvo ilgis: ");
		n = input.nextInt();
		int[] masyvas = new int[n];
		int[] neigiami = new int[n];
		for(int i = 0; i < n; i++)
		{
			System.out.println("Iveskite skaiciu esanti masyvo " + i + " vietoje: ");
			masyvas[i] = input.nextInt();
			if(masyvas[i] > 10)
			{
				
				masyvas[i] = 10;
				
			}
			if(masyvas[i] < 0)
			{
				neigiami[a] = masyvas[i];
				a++;
				
			}
		}
		
		System.out.print("Masyvas 1: ");
		for(int i = 0; i < n-1; i++)
		{
			System.out.print(masyvas[i] + ", ");
			
			
		}
		
		System.out.println(masyvas[n-1] + ".");
		if(a != 0)
		{
			System.out.print("Masyvas 2: ");
			for(int i = 0; i < a-1; i++)
			{
				System.out.print(neigiami[i] + ", ");
				
				
				
			}
			System.out.print(neigiami[a-1] + ".");
		}
		else
		{
			
			System.out.println("Neigiamu skaiciu nera");
			
		}
		

	}

}
