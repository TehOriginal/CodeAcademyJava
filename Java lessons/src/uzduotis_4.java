import java.util.Scanner;


public class uzduotis_4 {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		int health_player = 10;
		int health_monster = 10;
		String ejimas;
		while(health_player >= 0 || health_monster >= 0)
		{
			System.out.println("Koks jusu ejimas?");
			System.out.println("Pulti: Attack | ");
			System.out.println("Gintis: Defend | ");
			System.out.println("Isgerti eleksyro: Potion | ");
			System.out.println("Iseiti is zaidimo: Exit | ");
			ejimas = input.nextLine();
			//ejimai(ejimas);
			
			
			
			
			
			
		}
		
		
	}
	
	/*public static int ejimai(String ejimas)
	{
		if(ejimas.equalsIgnoreCase("Attack"))
		{
			

			
			
		}
		
		else if  (ejimas.equalsIgnoreCase("Defend"))
		{
			
	
			
			
		}
		
		else if (ejimas.equalsIgnoreCase("Potion"))
		{
			

			
		}
		else if (ejimas.equalsIgnoreCase("Exit"))
		{
			
			System.exit(0);	
			
		}
		
		else
		{
			
			System.out.println("Negalima komanda! Jus praleidziate ejima!");


		}
		
		
		
	}*/
}
