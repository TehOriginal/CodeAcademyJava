import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class main_zmones {

	public static void main(String[] args) {
		int number = 3;
		String ats1, ats2, ats3;
		int min = 500;
		int rn_1, rn_2, rn_3;
		int algarn_1 = ThreadLocalRandom.current().nextInt(200, 1500);
		int algarn_2 = ThreadLocalRandom.current().nextInt(200, 1500);
		int algarn_3 = ThreadLocalRandom.current().nextInt(200, 1500);
		zmogus zmogus_0 = new zmogus();
		zmogus zmogus_1 = new zmogus();
		zmogus zmogus_2 = new zmogus();
		Scanner input = new Scanner(System.in);
		int[] random = new int[3];
		String[] fullnames = new String[3];
		int[] algarandom = new int[3];
		algarandom[0] = algarn_1;
		algarandom[1] = algarn_2;
		algarandom[2] = algarn_3;
		String[] names = new String[number];
		String[] surnames = new String[number];
		for(int i = 0; i < number; i++)
		{
			
			System.out.println("Irasykite " + (i+1) + "-à varda");
			names[i] = input.nextLine();
			System.out.println("Irasykite " + (i+1) + "-à pavarde");
			surnames[i] = input.nextLine();
			
		}
		rn_1 = ThreadLocalRandom.current().nextInt(0, 3);
		rn_2 = ThreadLocalRandom.current().nextInt(0, 3);
		while(rn_1 == rn_2)
		{
			rn_2 = ThreadLocalRandom.current().nextInt(0, 3);
			
			
		}
		rn_3 = ThreadLocalRandom.current().nextInt(0, 3);
		while(rn_3 == rn_2 || rn_3 == rn_1)
		{
			
			rn_3 = ThreadLocalRandom.current().nextInt(0, 3);
			
		}
		zmogus_0.setName(names[rn_1] + " " + surnames[rn_3]);
		zmogus_1.setName(names[rn_2] + " " + surnames[rn_1]);
		zmogus_2.setName(names[rn_3] + " " + surnames[rn_2]);
		fullnames[0] = names[rn_3] + " " + surnames[rn_2];
		fullnames[1] = names[rn_2] + " " + surnames[rn_1];
		fullnames[2] = names[rn_3] + " " + surnames[rn_2];
		
		zmogus_0.setAlga(algarn_1);
		zmogus_1.setAlga(algarn_2);
		zmogus_2.setAlga(algarn_3);
		
		
		

		
		
		zmogus_0.check(min);
		zmogus_1.check(min);
		zmogus_2.check(min);
		
	}

}
