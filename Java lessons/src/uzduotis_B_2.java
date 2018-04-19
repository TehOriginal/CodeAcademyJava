import java.util.Scanner;

public class uzduotis_B_2 {

	public static void main(String[] args) {
		int x1, x2, y1, y2, x3, y3;
		Scanner input = new Scanner(System.in);
		System.out.println("Iveskite zaidejo koordinates:");
		System.out.println("x: ");
		x1 = input.nextInt();
		System.out.println("y: ");
		y1 = input.nextInt();
		System.out.println("Iveskite monstro_1 koordinates: ");
		System.out.println("x: ");
		x2 = input.nextInt();
		System.out.println("y: ");
		y2 = input.nextInt();
		System.out.println("Iveskite monstro_2 koordinates: ");
		System.out.println("x: ");
		x3 = input.nextInt();
		System.out.println("y: ");
		y3 = input.nextInt();
		input.close();
		if(atstumas(x1, y1, x2, y2) > atstumas(x1, y1, x3, y3))
		{
			
			System.out.println("Monstras_1 yra arciau zaidejo");
			System.out.println(atstumas(x1, y1, x2, y2) + " > " + atstumas(x1, y1, x3, y3));
		}
		else if(atstumas(x1, y1, x2, y2) < atstumas(x1, y1, x3, y3))
		{
			
			System.out.println("Monstras_2 yra arciau zaidejo");
			System.out.println(atstumas(x1, y1, x2, y2) + " < " + atstumas(x1, y1, x3, y3));
		}
		else
		{
			
			System.out.println("Monstrai yra vienodai nutole nuo zaidejo");
			System.out.println(atstumas(x1, y1, x2, y2) + " = " + atstumas(x1, y1, x3, y3));
			
		}
		
		

	}

	public static double atstumas(int x1, int y1, int x2, int y2)
	{
		
		return Math.sqrt ( Math.pow ( x2-x1 , 2 ) + Math.pow ( y2-y1 , 2 ) );
		
	}
	
}
