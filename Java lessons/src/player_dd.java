
public class player_dd {
	
	monster_dd monster;
	int x, y, health;
	String name;
	
	public player_dd(int x, int y, int health, String name)
	{
		this.x = x;
		this.y = y;
		this.health = health;
		this.name = name;
		
	}
	
	public player_dd()
	{
		
	}
	
	public void setName(String name)
	{
		this.name = name;
		
	}
	
	public int getPosX()
	{
		return x;
	}
	
	public void setPosX(int x)
	{
		this.x = x;
	}
	
	public int getPosY()
	{
		return y;
	}
	
	
	public void setPosY(int y)
	{
		this.y = y;
	}
	
	public void setHealth(int health)
	{
		this.health = health;
	}
	public int getHealth()
	{
		return health;
	}
	
	public void addHealth(int health_add)
	{
		health = health + health_add;
	}
	
	public void removeHealth(int health_remove)
	{
		health = health - health_remove;
	}
	
	public void initMonster(monster_dd monster)
	{
		
		this.monster = monster;
		
	}
	
	
	
	
	
}	
