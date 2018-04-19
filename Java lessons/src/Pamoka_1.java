
import java.util.Scanner;


public class Pamoka_1 {

	//2018-03-15
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Run?");
		System.out.println("Y or N");
		String run = sc.nextLine();
		if (run.equalsIgnoreCase("N"))
			{
			
				System.exit(0);
			
			}
		
		else
			{
			
			}
			
		while(true) {
			
			System.out.print("x: ");
			int x = sc.nextInt();
			System.out.print("y: ");
			int y = sc.nextInt();
			int z;
			
			z = y;
			y = x;
			x = z;
			System.out.println("< - - - - - - - - - - - >");
			System.out.println("----------");
			System.out.println("| x: " + x + "   |");
			System.out.println("| y: " + y + "   |");
			System.out.println("----------");
			
			if(tikrinimas(x, y) == true)
				{
					System.out.println("X yra didesnis uz Y");
				
				}
			else
				{
				
					System.out.println("Y yra didesnis uz X");
				
				}
			
		}

	}
	
	public static boolean tikrinimas(int x, int y)
	{
		
		if (x > y)
			{
			
				return true;
			
			}
		
		else
			{
			
				return false;
			}
	
	}
}
