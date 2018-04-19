import java.util.Scanner;

public class uzduotis_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sum = 0;
		int n = 5;
		int[] masyvas = new int[n];
		double vidurkis;
		
		System.out.println("Irasykite n (5) skaiciu");
		for(int i = 0; i < n; i++ )
		{
			masyvas[i] = input.nextInt();
			sum = sum + masyvas[i];
			
		}
		
		vidurkis = sum/n;
		System.out.println("Suma: " + sum);
		System.out.println("Vidurkis: " + vidurkis);

	}

}
