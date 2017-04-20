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
public class Monster 
{
	//Monster Variables
	private int healthPoints;
	private int attack;
	private String name;
	private String description;
	private Boolean isFrozen = false;
	protected ArrayList<Monster> monster;
	
	//Monster Constructor with variables
	protected Monster(String name, String description, int attack, int healthPoints, Boolean isFrozen)
	{
		this.name = name;
		this.description = description;
		this.attack = attack;
		this.healthPoints = healthPoints;		
		this.isFrozen = isFrozen;
	}
	//new ArrayList that will hold the Monsters
	
	
	Monster m1 = new Monster("Insane Crew Person","Crew member driven insane by the otherworldly happenings on the ship. It's as if they have seen the other side and come back changed. Their eyes...their eyes are so crazed. So....hollow...", (int)(Math.random() * 5 + 1), 10, false);
	Monster m2 = new Monster("Cultist", "Member of a mysterious cult bent on bringing a Great Old One into this plane of existence. They seem to be constantly mumbling something. The words can almost be heard, but before one can understand, they disappear from the brain as if they were never there.", (int)(Math.random() * 4 + 5), 15, false);
	Monster m3 = new Monster("Gug", "They possess arms that split into multiple forearms that end in razor-sharp talons and a terrifying mouth that opens vertically. They chitter about looking for food. They wouldn't be out of place in a sewer and the horrendous stench confirms that. So strong the stench, one almost forgets where...or even who...they are.", (int)(Math.random() * 7 + 4), 15, false);
	Monster m4 = new Monster("Ghast", "A creature without a nose or forehead. It hops around looking for Gugs to eat on its hooved kangaroo-like legs, but will settle for anything meaty when necessary. The sounds it belches forth...the sounds burn into one's soul and will likely never leave, haunting one in this life and the next.", (int)(Math.random() * 5 + 9), 25, false);
	Monster m5 = new Monster("Mi-go", "It seems to be made of an unknown substance resembling a fungus and has huge lobster claws and bat wings. What one assumes to be its mouth drips with a beautiful, pinkish substance. So lovely this substance.....it draws one to it. One just wants to touch it. Feel it. Swim in its beauty....", (int)(Math.random() * 3 + 11), 35, false);
	Monster m6 = new Monster("Elder Thing", "A large starfish, with eyes and a mouth, sits atop a cylindrical mass of tentacles. Crab-like claws protrude hideous gaping maws that dot the writhing mass. One can hear it in their mind, speaking, praying, to some greater entity. Or maybe one is just going crazy. Yes...that must be it.", (int)(Math.random() * 6 + 10), 40, false);
	Monster m7 = new Monster("Shoggoth", "Always shifting and changing. One’s eyes cannot seem to focus on anything but the multitudes of inky, black eyes covering it. They seem so deep and transfixing. Like they contain all the secrets of all the worlds. One could lose themselves in those eyes if not careful.", (20), 60, false);
	Monster boss = new Monster("Great Old One", "A horrifying, giant, three-eyed slug with metallic spines protruding from its slimy back and pyramid-shaped feet that scrape and screech against the metallic floor.", 30, 100, false);
	
	
	protected void addMonsterToArraylist()
	{
		monster.add(m1);
		monster.add(m2);
		monster.add(m3);
		monster.add(m4);
		monster.add(m5);
		monster.add(m6);
		monster.add(m7);
	}
	
	public Boolean isAlive() 
	{
		return healthPoints > 0;
	}
	
	public int getHealth()
	{
		return (healthPoints);
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getAttack()
	{
		return  attack;
	}
	
	public String getName()
	{
		return name;
	}
}
