package Model;
import java.util.ArrayList;

public class Monster 
{
	//Monster Variables
	private int healthPoints;
	private int attack;
	private String name;
	private Boolean isFrozen = false;
	
	//Monster Constructor with variables
	protected Monster(String name, int attack, int healthPoints)
	{
		this.name = name;
		this.attack = attack;
		this.healthPoints = healthPoints;		
	}
	//new ArrayList that will hold the Monsters
	public static ArrayList<Monster> monsterArray = new ArrayList<Monster>(); {
	
	Monster m1 = new Monster("Insane Crew Person", (int)(Math.random() * 5 + 1), 10);
	Monster m2 = new Monster("Cultist", (int)(Math.random() * 4 + 5), 15);
	Monster m3 = new Monster("Gug", (int)(Math.random() * 7 + 4), 15);
	Monster m4 = new Monster("Ghast", (int)(Math.random() * 5 + 9), 20);
	Monster m5 = new Monster("Mi-go", (int)(Math.random() * 3 + 11), 25);
	Monster m6 = new Monster("Elder Thing", (int)(Math.random() * 6 + 10), 35);
	Monster m7 = new Monster("Shoggoth", (20), 40);
	Monster boss = new Monster("Great Old One", 30, 50);
	
	
	monsterArray.add(m1);
	monsterArray.add(m2);
	monsterArray.add(m3);
	monsterArray.add(m4);
	monsterArray.add(m5);
	monsterArray.add(m6);
	monsterArray.add(m7);
	
	}
	public int getHealth()
	{
		return (healthPoints);
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
