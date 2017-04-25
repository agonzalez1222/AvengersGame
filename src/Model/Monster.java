package Model;
import java.util.ArrayList;

/**
 * Class: Monster
 * 
 * @author  Course : ITEC 3860, Spring, 2017 Written: April , 
 *         2017
 * 
 * 
 *         This class will 
 * 
 *         Purpose: The class will 
 *
 */
public class Monster extends Character
{
	//Monster Variables
	private String name;
	private String description;
	private Boolean isFrozen = false;
	protected ArrayList<Monster> monsters;
	protected Monster monster1;
	
	//Monster Constructor with variables
	public Monster(int health, int atk, int def, String name, String description, Boolean isFrozen)
	{
		super(health, atk, def);
		this.name = name;
		this.description = description;	
		this.isFrozen = isFrozen;
	}
	
	/**
	 * 
	 * 
	 * @param monster
	 */
	protected int damageMonster(Player player) {
		int playerAtk = player.getAtk();
		super.health = super.health - playerAtk;
		int damage = playerAtk - super.health;
		return damage;
	}
	
	public Monster getMonsterRef()
	{
		return monster1;
	}
	
	public void placeMonsters()
	{
		// We'll use this method to place the monsters in rooms via room_id later on
	}
	
	public Boolean isAlive() 
	{
		return health > 0;
	}
	
	
	
	/**
	 * @return the isFrozen
	 */
	public Boolean getIsFrozen() {
		return isFrozen;
	}
	
	public void setIsFrozen(boolean frozen)
	{
		this.isFrozen = frozen;
	}

	public int getHealth()
	{
		return (health);
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getAttack()
	{
		return  atk;
	}
	
	public String getName()
	{
		return name;
	}
	
	public ArrayList<Monster> getList()
	{
		return monsters;
	}
	
	protected Monster getMonster(int i)
	{
		return monsters.get(i);
	}
	public void setHealth(int health)
	{
		this.health = health;
	}
	
	public String getMonster() {
        return this.monster1.getName();
    }
}
