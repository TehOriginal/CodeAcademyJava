import java.util.ArrayList;
import java.util.Random;

public class pamoka_list {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> randomnum = new ArrayList<Integer>();
		Random rn = new Random();
		String[] vardai = new String[20];
		int a;
		int k = 0;
		int same = 0;
		vardai[0] = "Antanas";
		vardai[1] = "Jogaila";
		vardai[2] = "Vytautas";
		vardai[3] = "Ona";
		vardai[4] = "Emilija";
		vardai[5] = "Monika";
		vardai[6] = "Ugnius";
		vardai[7] = "Arnoldas";
		vardai[8] = "Ignas";
		vardai[9] = "Aurimas";
		vardai[10] = "Viktorija";
		vardai[11] = "Karolina";
		vardai[12] = "Aiste";
		vardai[13] = "Rokas";
		vardai[14] = "Edita";
		vardai[15] = "Paulius";
		vardai[16] = "Mykolas";
		vardai[17] = "Mindaugas";
		vardai[18] = "Barbora";
		vardai[19] = "Ieva";

		for(int i = 0; i < 20; i++)
		{
		
		a = rn.nextInt(20);
			for(int b = 1; b < list.size(); b++)
			{
				list.add(vardai[a]);
				randomnum.add(a);
			}
		}
		//System.out.println(a);
		//System.out.println(list.size());
		/*while(k < 20)
		{
			System.out.println(list.size());
				a = rn.nextInt(20);
				
				for(int u = 0; u < randomnum.size(); u++)
				{
					if(randomnum.get(u) == a)
					{
						same++;
					}
					else
					{
						
						
						
					}
					
					
				}
				if(same==0)
				{
					list.add(vardai[a]);
					
					randomnum.add(a);
					k++;
				}

				

		}
		*/
		for(String i:list)
		{
			System.out.println(i);
		}

		}

	}


