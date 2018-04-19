import java.util.Scanner;

public class uzduotis_8 {

	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int n = 5;
		int[] masyvas = new int[n];
		
		System.out.println("Irasykite n (5) skaiciu");
		for(int i = 0; i < n; i++ )
		{
			masyvas[i] = input.nextInt();
			sum = sum + masyvas[i];
			
		}
		System.out.println("Suma: " + sum);
		

	}

}
