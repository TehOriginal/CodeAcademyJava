
public class Dviratis {

	String pavadinimas;
	double vid_greitis;
	double kilometrai;
	double nuv_kelias;
	
	public Dviratis(double vid, double nuv_kelias)
	{
		
		vid_greitis = vid;
		this.nuv_kelias = nuv_kelias;
		pavadinimas = "noname";
		System.out.println("New bike appears: noname");
		
	}
	
	public Dviratis(String name, double vid, double nuv_kelias)
	{
		
		vid_greitis = vid;
		this.nuv_kelias = nuv_kelias;
		pavadinimas = name;
		System.out.println("New bike appears: " + pavadinimas);
		
	}
	
	public double vaziavimas(int laikas)
	{
		
		kilometrai = (vid_greitis*laikas) + nuv_kelias;
		return kilometrai;
		
	}
	
	public String getName()
	{

			return pavadinimas;
		
	}
	
	public double getVid()
	{
		
		return vid_greitis;
		
	}
	

	
	
	
	
}
