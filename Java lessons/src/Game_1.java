import java.util.Scanner;

public class Game_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int health = 10;
		int round = 1;
		String healthbar = "|";
		String head = "H";
		String belly = "B";
		String legs = "L";
		String move;
		Scanner input = new Scanner(System.in);
		pasiruosimas(health, healthbar);
		if((round & 1) == 0)
		{
			
			
			
		}
		
		else
		{
			
			
			
			
		}
		

		

	}
	
	
	public static void pasiruosimas(int health, String healthbar)
	{
		System.out.print("Health Player 1: ");
		for (int i = 0; i < health; i++)
		{
			System.out.print(healthbar);
			
		}
		System.out.println(" ");
		System.out.print("Health Player 2: ");
		for (int i = 0; i < health; i++)
		{
			
			System.out.print(healthbar);
			
		}
		System.out.println(" ");
		System.out.println("----------          ----------");
		System.out.println("|        |          |        |");
		System.out.println("|    H   |          |    H   |");
		System.out.println("|        |          |        |");
		System.out.println("----------          ----------");
		System.out.println("     -                   -    ");
		System.out.println("    - -                 - -   ");
		System.out.println("   -   -               -   -  ");
		System.out.println("  -  B  -             -  B  - ");
		System.out.println("   -   -               -   -  ");
		System.out.println("    - -                 - -   ");
		System.out.println("     -                   -    ");
		System.out.println("   || ||               || ||  ");
		System.out.println("   || ||               || ||  ");
		System.out.println("   || ||               || ||  ");
		System.out.println("   || ||               || ||  ");
		System.out.println(" __|| |L_            __|| |L_ ");
		
		
		
		
	}
}
	