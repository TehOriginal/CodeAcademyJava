import java.util.Scanner;

public class uzduotis_B_objektai_main {

	public static void main(String[] args) {
		int x1, x2, y1, y2, x3, y3;
		
		int[] zaidejaspos = new int[2];
		int[] monstras_1pos = new int[2];
		int[] monstras_2pos = new int[2];
		String name;
		Scanner input = new Scanner(System.in);
		uzduotis_B_calc veiksmai = new uzduotis_B_calc();
		uzduotis_B_zaidejas zaidejas = new uzduotis_B_zaidejas();
		uzduotis_B_monstras monstras_1 = new uzduotis_B_monstras();
		uzduotis_B_monstras monstras_2 = new uzduotis_B_monstras();
		System.out.println("Iveskite zaidejo varda:");
		name = input.nextLine();
		zaidejas.setName(name);
		System.out.println("Iveskite zaidejo koordinates:");
		System.out.println("x: ");
		x1 = input.nextInt();
		System.out.println("y: ");
		y1 = input.nextInt();
		zaidejas.setPos(x1, y1);
		System.out.println("Iveskite monstro_1 koordinates: ");
		System.out.println("x: ");
		x2 = input.nextInt();
		System.out.println("y: ");
		y2 = input.nextInt();
		monstras_1.setPos(x2, y2);
		System.out.println("Iveskite monstro_2 koordinates: ");
		System.out.println("x: ");
		x3 = input.nextInt();
		System.out.println("y: ");
		y3 = input.nextInt();
		monstras_1.setPos(x3, y3);
		zaidejaspos = zaidejas.getPos();
		monstras_1pos = monstras_1.getPos();
		monstras_2pos = monstras_2.getPos();
		veiksmai.closest(zaidejaspos, monstras_1pos, monstras_2pos);
		
	}

}
