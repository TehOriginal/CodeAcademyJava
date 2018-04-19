import java.text.DecimalFormat;

public class Main_dviratis {

	public static void main(String[] args) {
		
		int laikas = 1;
		Dviratis bike = new Dviratis("Eksde", 15.2, 20);
		Dviratis bike_1 = new Dviratis(11, 65);
		
		if(bike.vaziavimas(laikas) > bike_1.vaziavimas(laikas))
		{
			
			System.out.println("Pirmasis dviratis nuvaziuos: " + bike.vaziavimas(laikas) + " km");
			System.out.println("Antrasis dviratis nuvaziuos: " + bike_1.vaziavimas(laikas) + " km");
			System.out.println("Pirmasis dviratis, " + bike.getName() + ", nuvaziavo daugiau");
			System.out.println("Antrajam dviraciui reikia dar vaziuoti: " + kiek_liko_stop(bike.vaziavimas(laikas), bike_1.vaziavimas(laikas), bike_1.getVid()) + " h");
			
		}
		
		else if(bike.vaziavimas(laikas) < bike_1.vaziavimas(laikas))
		{
			System.out.println("Pirmasis dviratis nuvaziuos: " + bike.vaziavimas(laikas) + " km");
			System.out.println("Antrasis dviratis nuvaziuos: " + bike_1.vaziavimas(laikas) + " km");
			System.out.println("Antrasis dviratis, " + bike_1.getName() + ", nuvaziavo daugiau");
			System.out.println("Pirmajam dviraciui reikia dar vaziuoti: " + kiek_liko_stop(bike_1.vaziavimas(laikas), bike.vaziavimas(laikas), bike.getVid()) + " h");
			
			
		}
		
		else
		{
			System.out.println("Pirmasis dviratis nuvaziuos: " + bike.vaziavimas(laikas) + " km");
			System.out.println("Antrasis dviratis nuvaziuos: " + bike_1.vaziavimas(laikas) + " km");
			System.out.println("Abu dviraciai, " + bike.getName() + " ir " + bike_1.getName() + ", nuvaziavo po lygiai");
			
			
		}

	}

	public static String kiek_liko_stop(double tol_dviratis_kelias, double art_dviratis_kelias, double art_vid)
	{
		DecimalFormat df = new DecimalFormat("#.0");
		double skirtumas = tol_dviratis_kelias - art_dviratis_kelias;
		return df.format(skirtumas/art_vid);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
