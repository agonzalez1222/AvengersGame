package Model;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Class: Player
 * 
 * @author Team Avengers
 *   Course : ITEC 3860, Spring, 2017 Written: April 8, 2017
 * 
 * 
 *         This class will 
 * 
 *         Purpose: The class will 
 *
 */

public class Player extends Character {
	
	// Player variables
	private ArrayList<Items> invItems;
	private Artifacts currentWeapon;
	private Artifacts currentArmor;
	static Random rand = new Random();
	
	protected Player() {
		super(100, 1, 5);
		//currentWeapon = Artifacts.artifacts.get(0);
		//currentArmor = Artifacts.artifacts.get(7);
		//invItems = new ArrayList<>();
	}
	
	public ArrayList<Items> getInvItems() {
		return new ArrayList<Items>(this.invItems);
	}

	// Checks if the player is still alive and returns true if their health is above 0
	public Boolean isAlive() {
		return health > 0;
	}
	
	// Will be used to display the players current Health Pool
	public int getHealth() {
		return health;
	}
	
	// Random number generator used for escaping battles
	public static int escapeRoll() {
		int diceRoll = rand.nextInt((10 - 1) + 1) + 1;
		return diceRoll;
	}
	
	public void setHealth(int health)
	{
		this.health = health;
	}
	
	
}
