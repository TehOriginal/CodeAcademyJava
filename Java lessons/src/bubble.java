

public class bubble {

	String name;
	int x;
	int y;
	int result;
	boolean x_is_bigger;
	boolean equal;
	
	public bubble()
	{
		x = 0;
		y = 0;
		equal = false;
		
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	
	}
	
	
	public void setPos(int x, int y)
	{
		this.x = x;
		this.y = y;
	
	}
	
	public void calc()
	{
		if (x > y)
		{
			
			x_is_bigger = true;
			
		}
		if (x == y)
		{
			
			equal = true;
			
		}
		else
		{
			
			x_is_bigger = false;
			
		}
		
		
	}
	
	public void calc2()
	{
		if(x_is_bigger == true)
		{
			result = x*y + 10;
		}
		if(equal == true)
		{
			result = 0;
			
		}
		if(x_is_bigger == false)
		{
			
			
		}
		
		
	}
	
}
