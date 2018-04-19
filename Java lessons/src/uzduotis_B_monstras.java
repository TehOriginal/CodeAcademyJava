
public class uzduotis_B_monstras {

	int x, y;
	int[] xy = new int[2];
	
	public void setPos(int x, int y)
	{
		this.x = x;
		this.y = y;

		
	}
	public int[] getPos()
	{
		xy[0] = x;
		xy[1] = y;
		return xy;
		
	}
	
	
	
	
}
