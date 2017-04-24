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
	
	//Monster Constructor with variables
	public Monster(int health, int atk, int def, String name, String description, Boolean isFrozen)
	{
		super(health, atk, def);
		this.name = name;
		this.description = description;	
		this.isFrozen = isFrozen;
		
	}
	
	public Monster() {
		super(5,5,5);
		this.monsters = new ArrayList<Monster>();
		
		Monster m1 = new Monster(10, (int)(Math.random() * 5 + 1), 0, "Insane Crew Person", "Crew member driven insane by the otherworldly happenings on the ship. It's as if they have seen the other side and come back changed. Their eyes...their eyes are so crazed. So....hollow...", false);
		Monster m2 = new Monster(15, (int)(Math.random() * 4 + 5), 0, "Cultist", "Member of a mysterious cult bent on bringing a Great Old One into this plane of existence. They seem to be constantly mumbling something. The words can almost be heard, but before one can understand, they disappear from the brain as if they were never there.", false);
		Monster m3 = new Monster(15, (int)(Math.random() * 7 + 4), 0, "Gug", "They possess arms that split into multiple forearms that end in razor-sharp talons and a terrifying mouth that opens vertically. They chitter about looking for food. They wouldn't be out of place in a sewer and the horrendous stench confirms that. So strong the stench, one almost forgets where...or even who...they are.", false);
		Monster m4 = new Monster(25, (int)(Math.random() * 5 + 9), 0, "Ghast", "A creature without a nose or forehead. It hops around looking for Gugs to eat on its hooved kangaroo-like legs, but will settle for anything meaty when necessary. The sounds it belches forth...the sounds burn into one's soul and will likely never leave, haunting one in this life and the next.", false);
		Monster m5 = new Monster(35, (int)(Math.random() * 3 + 11), 0, "Mi-go", "It seems to be made of an unknown substance resembling a fungus and has huge lobster claws and bat wings. What one assumes to be its mouth drips with a beautiful, pinkish substance. So lovely this substance.....it draws one to it. One just wants to touch it. Feel it. Swim in its beauty....", false);
		Monster m6 = new Monster(40, (int)(Math.random() * 6 + 10), 0, "Elder Thing", "A large starfish, with eyes and a mouth, sits atop a cylindrical mass of tentacles. Crab-like claws protrude hideous gaping maws that dot the writhing mass. One can hear it in their mind, speaking, praying, to some greater entity. Or maybe one is just going crazy. Yes...that must be it.", false);
		Monster m7 = new Monster(60, 20, 0, "Shoggoth", "Always shifting and changing. One’s eyes cannot seem to focus on anything but the multitudes of inky, black eyes covering it. They seem so deep and transfixing. Like they contain all the secrets of all the worlds. One could lose themselves in those eyes if not careful.", false);
		Monster boss = new Monster(100, 30, 0, "Great Old One", "A horrifying, giant, three-eyed slug with metallic spines protruding from its slimy back and pyramid-shaped feet that scrape and screech against the metallic floor.", true);
		
		monsters.add(m1);
		monsters.add(m2);
		monsters.add(m3);
		monsters.add(m4);
		monsters.add(m5);
		monsters.add(m6);
		monsters.add(m7);
		monsters.add(boss);
		
	}
	
	public void GameMonster() {
		
	//new ArrayList that will hold the Monsters
//	monsters = new ArrayList<Monster>();
//	
//	Monster m1 = new Monster(10, (int)(Math.random() * 5 + 1), 0, "Insane Crew Person", "Crew member driven insane by the otherworldly happenings on the ship. It's as if they have seen the other side and come back changed. Their eyes...their eyes are so crazed. So....hollow...", false);
//	Monster m2 = new Monster(15, (int)(Math.random() * 4 + 5), 0, "Cultist", "Member of a mysterious cult bent on bringing a Great Old One into this plane of existence. They seem to be constantly mumbling something. The words can almost be heard, but before one can understand, they disappear from the brain as if they were never there.", false);
//	Monster m3 = new Monster(15, (int)(Math.random() * 7 + 4), 0, "Gug", "They possess arms that split into multiple forearms that end in razor-sharp talons and a terrifying mouth that opens vertically. They chitter about looking for food. They wouldn't be out of place in a sewer and the horrendous stench confirms that. So strong the stench, one almost forgets where...or even who...they are.", false);
//	Monster m4 = new Monster(25, (int)(Math.random() * 5 + 9), 0, "Ghast", "A creature without a nose or forehead. It hops around looking for Gugs to eat on its hooved kangaroo-like legs, but will settle for anything meaty when necessary. The sounds it belches forth...the sounds burn into one's soul and will likely never leave, haunting one in this life and the next.", false);
//	Monster m5 = new Monster(35, (int)(Math.random() * 3 + 11), 0, "Mi-go", "It seems to be made of an unknown substance resembling a fungus and has huge lobster claws and bat wings. What one assumes to be its mouth drips with a beautiful, pinkish substance. So lovely this substance.....it draws one to it. One just wants to touch it. Feel it. Swim in its beauty....", false);
//	Monster m6 = new Monster(40, (int)(Math.random() * 6 + 10), 0, "Elder Thing", "A large starfish, with eyes and a mouth, sits atop a cylindrical mass of tentacles. Crab-like claws protrude hideous gaping maws that dot the writhing mass. One can hear it in their mind, speaking, praying, to some greater entity. Or maybe one is just going crazy. Yes...that must be it.", false);
//	Monster m7 = new Monster(60, 20, 0, "Shoggoth", "Always shifting and changing. One’s eyes cannot seem to focus on anything but the multitudes of inky, black eyes covering it. They seem so deep and transfixing. Like they contain all the secrets of all the worlds. One could lose themselves in those eyes if not careful.", false);
//	Monster boss = new Monster(100, 30, 0, "Great Old One", "A horrifying, giant, three-eyed slug with metallic spines protruding from its slimy back and pyramid-shaped feet that scrape and screech against the metallic floor.", true);
//	
//	monsters.add(m1);
//	monsters.add(m2);
//	monsters.add(m3);
//	monsters.add(m4);
//	monsters.add(m5);
//	monsters.add(m6);
//	monsters.add(m7);
//	monsters.add(boss);
	}
	
	/**
	 * 
	 * 
	 * @param monster
	 */
	protected int damageMonster(Player player) {
		int playerAtk = player.getAtk();
		super.health = super.health - playerAtk;
		int damage = playerAtk - super.def;
		return damage;
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
}
