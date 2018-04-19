import java.util.Scanner;

public class setup_dd {
	
	player_dd player;
	Scanner input = new Scanner(System.in);
	int class_ats, diff_ats;
	
	
	public setup_dd()
	{
		
		
		
	}
	public void setup()
	{
		Scanner input = new Scanner(System.in);
		askName();
		askClass();
		askDiff();
		input.close();
	}
	private void askName()
	{
		
		System.out.println("Sveiki atvyke! Koks jusu vardas?");
		player.setName(input.nextLine());
		
	}
	
	private void askClass()
	{
	
		System.out.println("Kokia jusu klase? Irasykite klases numeri: ");
		System.out.println("1. Karys");
		System.out.println("2. Lankininkas");
		System.out.println("3. Burtininkas");
		class_ats = input.nextInt();
		
	}
	
	private void askDiff()
	{
		
		System.out.println("Kokio sunkumo noretumete? Iveskite sunkumo numeri: ");
		System.out.println("1. Lengvas");
		System.out.println("2. Vidutiniskas");
		System.out.println("3. Sunkus");
		System.out.println("4. Labai sunkus");
		diff_ats = input.nextInt();
		
		
	}
	
	public int getClassAts()
	{
		return class_ats;
	}
	
	public int getDiffAts()
	{
		return diff_ats;
	}
	
	public void initPlayer(player_dd player)
	{
		
		this.player = player;
		
	}
	
	
	
	
	
}
