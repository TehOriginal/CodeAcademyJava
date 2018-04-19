
public class uzduotis_B_zaidejas {

	
	int x, y;
	int[] xy = new int[2];
	String name;
	
	public void setPos(int x, int y)
	{
		this.x = x;
		this.y = y;
		
	}
	
	public void setName(String name)
	{
		
		this.name = name;
		
	}
	
	public int[] getPos()
	{
		xy[0] = x;
		xy[1] = y;
		return xy;
		
	}
	
	
	
}
