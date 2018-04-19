import java.util.Scanner;

public class uzduotis_3 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		int bloko_mase = 7874;
		int bloko_turis = 9;
		int luito_mase = (bloko_mase/bloko_turis);
		int salmo_mase = luito_mase*5;
		int krutines_mase = luito_mase*8;
		int koju_mase = luito_mase*7;
		int batu_mase = luito_mase*4;
		int visa_mase = salmo_mase + krutines_mase + koju_mase + batu_mase;
		System.out.println("Ar jus su sarvais? Y or N");
		String ats = input.nextLine();
		if(ats.equalsIgnoreCase("Y"))
		{
			
			
			System.out.println("Visa sarvu mase: " + visa_mase);
			System.out.println("Salmo mase: " + salmo_mase);
			System.out.println("Krutines sarvu mase: " + krutines_mase);
			System.out.println("Koju sarvu mase: " + koju_mase);
			System.out.println("Batu sarvu mase: " + batu_mase);
			
			
		}
		
		else
		{
			
			
		}
		
		System.out.println("Kiek turite bloku gelezies? ");
		int ats1 = input.nextInt(); 
		//gelezies bloku skaicius
		System.out.println("Kiek turite gelezies luitu? ");
		int ats2 = input.nextInt(); 
		//gelezies luitu skaicius
		System.out.println("Luito mase: " + luito_mase);
		System.out.println("Visa sarvu mase: " + visa_mase);
		System.out.println("Visa mase: " + (luito_mase*ats2) + (bloko_mase*ats1) + visa_mase);
		
		
		
	}
	
	
}
