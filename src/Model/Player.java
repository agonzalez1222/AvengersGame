package Model;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import Model.Items;
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
	ArrayList<Items> invItems;
	private int currentScore = 1000;
	private Artifacts currentWeapon;
	private Artifacts currentArmor;
	static Random rand = new Random();
	Items a1 = new Items();
	ArrayList<Items> list1 = new ArrayList<>();
	
	
	
	protected Player() {
		super(100, 1, 5);
		//currentWeapon = Artifacts.artifacts.get(0);
		//currentArmor = Artifacts.artifacts.get(7);
		//invItems = new ArrayList<>();
	}
	
	public void useItem(Items item) {
		System.out.println("What item would you like to use?");
		System.out.println(getInvItems());
		invItems.add(item.getItems(0));
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
	
	
	public void PlayerMove() {
		// Code for player movement goes here
		currentScore -= 10;
	}
	
	// The method below uses either the green herb or the mixed herbs to heal the player
	// We need to add the part where it takes it out of inventory delete this when added
	public void useHealthRegenItem(Items a1)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the name of the item that you wish to use, or type 0 to exit");
		String nameGiven = input.nextLine();
		if(nameGiven.equalsIgnoreCase("green herb"))
		{
			if(a1.getName().equalsIgnoreCase(nameGiven))
			{
				System.out.println("Are you sure that you want to use the Green Herb? (yes/no)");
				String answer = input.nextLine();
				if(answer.equalsIgnoreCase("yes"))
				{
					this.health = health + 15;
					setHealth(this.health);
					System.out.println("The Green Herb heals you. \nYour new health is " + this.health + '.');
				}
				else
				{
					System.out.println("Ok, lets try again.");
					useHealthRegenItem(a1);
				}
			 }
		}	
		if(nameGiven.equalsIgnoreCase("mixed herbs"))
		{
			if(a1.getName().equalsIgnoreCase(nameGiven))
			{
				System.out.println("Are you sure that you want to use the Mixed Herbs? (yes/no)");
				String answer = input.nextLine();
				if(answer.equalsIgnoreCase("yes"))
				{
					this.health = health + 30;
					setHealth(this.health);
					System.out.println("The Mixed Herbs heal you. \nYour new health is " + this.health + '.');
				}
				else
				{
					System.out.println("Ok, lets try again.\n");
					useHealthRegenItem(a1);
				}
			 }
		}
		if(nameGiven.equalsIgnoreCase("medkit"))
		{
			if(a1.getName().equalsIgnoreCase(nameGiven))
			{
				System.out.println("Are you sure that you want to use the MedKit? (yes/no)");
				String answer = input.nextLine();
				if(answer.equalsIgnoreCase("yes"))
				{
					this.health = health + 20;
					setHealth(this.health);
					System.out.println("The MedKit heals you. \nYour new health is " + this.health + '.');
				}
				else
				{
					System.out.println("Ok, lets try again.\n");
					useHealthRegenItem(a1);
				}
			 }
		}
		else if(nameGiven.equalsIgnoreCase("0"))
		{
			System.exit(0);
		}
		else
		{
			System.out.println("Invalid entry, please try again.");
			System.out.print("\n");
			useHealthRegenItem(a1);
		}
	}
}
