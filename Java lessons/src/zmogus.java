
public class zmogus {

	String name;
	int alga;
	int proc;
	int min;
	
	public void setName(String name)
	{
		
		this.name = name;
		
		
	}
	
	public void setAlga(int alga)
	{
		
		this.alga = alga;
		
	}
	
	public void check(int min)
	{
		this.min = min;
		if(alga < min)
		{
			
			System.out.println(name + " turi mazesne uz minimuma alga: " + alga);
			System.out.println("Alga turetu padideti " + procent() + "%");
		}
		else
		{
			
			System.out.println(name + " turi aukstesne uz minimuma alga: " + alga);
			
		}
		
		
		
	}
	
	public int procent()
	{
		
		return proc = ((min - alga)*100)/alga;
		
		
	}
	
	public void changealga(int proc)
	{
		
		alga = alga + ((alga/100)*proc);
		
		
	}
	
	
	
	
	
}
