import java.util.Scanner;

public class uzduotis_B {

	public static void main(String[] args) {
		int x1, x2, y1, y2;
		Scanner input = new Scanner(System.in);
		System.out.println("Iveskite zaidejo koordinates:");
		System.out.println("x: ");
		x1 = input.nextInt();
		System.out.println("y: ");
		y1 = input.nextInt();
		System.out.println("Iveskite monstro koordinates: ");
		System.out.println("x: ");
		x2 = input.nextInt();
		System.out.println("y: ");
		y2 = input.nextInt();
		input.close();
		System.out.println(atstumas(x1, y1, x2, y2));
		
		

	}
	
	
	public static double atstumas(int x1, int y1, int x2, int y2)
	{
		
		return Math.sqrt ( Math.pow ( x2-x1 , 2 ) + Math.pow ( y2-y1 , 2 ) );
		
	}

}
