import java.util.Scanner;

public class uzduotis_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		int kiekis = 0;
		int[] masyvas = new int[5];
		System.out.println("Iveskite n: ");
		n = input.nextInt();
		System.out.println("Iveskite 5 skaicius");
		for(int i = 0; i < 5; i++ )
		{
			masyvas[i] = input.nextInt();
			
			if(masyvas[i] == n)
			{
				
				kiekis++;
				
			}
			else
			{
				
				
			}
			
			
		}
		
		System.out.println("N skaicius: " + kiekis);

	}

}
