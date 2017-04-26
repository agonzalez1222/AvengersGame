package Model;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Control.RoomMaker;
import Model.Items;
import Model.Room;
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
	public ArrayList<Items> invItems;
	ArrayList<Artifacts> equipment;
	public static int currentScore = 1000;
	public Artifacts currentWeapon;
	public Artifacts currentArmor;
	static Random rand = new Random();
	Items a1 = new Items();
	ArrayList<Items> list1 = new ArrayList<>();
	ArrayList<Artifacts> artifacts = new ArrayList<>();
	protected Monster m1;
	private int currentX = 0;
	private int currentY = 4;
	public RoomMaker rm;
	
	public Player() {
		super(100, 1, 5);

//		currentWeapon = rm.w1;
//		currentArmor = rm.w8;
		invItems = new ArrayList<>();
	}
	
	
	public int getCurrentX()
	{
		return this.currentX;
	}
	
	public int getCurrentY()
	{
		return this.currentY;
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
	public int escapeRoll() {
		int diceRoll = rand.nextInt((10 - 1) + 1) + 1;
		return diceRoll;
	}
	
	public void setHealth(int health)
	{
		this.health = health;
	}
	
	/**
	 * This method adds items to the players inventory.
	 * 
	 * @param item
	 */
	public void addToInv(Items item) {
		for (Items i: invItems) {
			invItems.add(i);
		}
	}
	
	/**
	 * This method adds items to the players inventory.
	 * 
	 * @param item
	 */
	public void addToEquip(Artifacts artifact) {
		for (Artifacts i: equipment) {
			equipment.add(i);
		}
	}
	
	/**
	 * This method removes items from the players inventory.
	 * 
	 * @param item
	 */
	public void removeFromInv(Items item) {
		for (Items i: invItems) {
			invItems.remove(i);
		}
	}
	
	public int getCurrentScore() {
		return currentScore;
	}

	// The method below uses either the green herb or the mixed herbs to heal the player
	// We need to add the part where it takes it out of inventory delete this when added
	public void useHealthRegenItem(Items a1)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the name of the item that you wish to use, or type exit");
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
			input.close();
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
		else if(nameGiven.equalsIgnoreCase("exit"))
		{
			System.exit(0);
		}
		else
		{
			System.out.println("Invalid entry, please try again.");
			System.out.print("\n");
			useHealthRegenItem(a1);
		}
		input.close();
	}
	//This method replenishes data based on the item being used
	public void ammoReplenish(Items a1)
	{
		Scanner input = new Scanner(System.in);
		
		if(a1.getName().equalsIgnoreCase("gas canister"))
		{
			System.out.println("Are you sure that you want to use " + a1.getName() + "? (yes or no)");
			String response = input.nextLine();
			if(response.equalsIgnoreCase("yes"))
			{
				int newGasAmmo = a1.getIncreaseAmmo() + 50;
				a1.setIncreaseAmmo(newGasAmmo);
				if(a1.getIncreaseAmmo() >= 100)
				{
					newGasAmmo = 100;
					a1.setIncreaseAmmo(newGasAmmo);
					System.out.println("The new ammo for the gas canister is " + a1.getIncreaseAmmo());
				}
				else
				{
					System.out.println("The new ammo for the gas canister is " + a1.getIncreaseAmmo());
				}
			}
		}
		else if(a1.getName().equalsIgnoreCase("plasma rounds"))
		{
			System.out.println("Are you sure that you want to use " + a1.getName() + "? (yes or no)");
			String response = input.nextLine();
			if(response.equalsIgnoreCase("yes"))
			{
				int pistolAmmo = a1.getIncreaseAmmo() + 6;
				a1.setIncreaseAmmo(pistolAmmo);
				if(a1.getIncreaseAmmo() >= 12)
				{
					pistolAmmo = 12;
					a1.setIncreaseAmmo(pistolAmmo);
					System.out.println("The new ammo for the Plasma Pistol is " + a1.getIncreaseAmmo());
				}
			}
			else
			{
			
				System.out.println("The new ammo for the Plasma Pistol is " + a1.getIncreaseAmmo());
			}
		}
		else
		{
			System.out.println("Please enter a valid Item entry.");
			System.exit(0);
		}
		input.close();
	}
	
	
		
	
	protected void increaseAttack(Artifacts artifacts)
	{
		super.atk = artifacts.getAttack();
		System.out.println(this.atk);
	}
	
	protected void increaseDefense(Artifacts artifacts)
	{
		super.def = artifacts.getDamageResist();
	}
	
	/**
	 * Returns the player's current weapon.
	 * 
	 * @return
	 */
	public Artifacts getCurrentWeapon() {
		return currentWeapon;
	}
	
	/**
	 * Returns the player's current Armor.
	 * 
	 * @return
	 */
	public Artifacts getCurrentArmor() {
		return currentArmor;
	}
	
    //test player movement 
	
//	private boolean roomExists(int x, int y) {
//		this.currentX = x;
//		this.currentY = y;
//		return true;
//		
//	 // return true;
//    
//}
	
	/**
	 * 
	 * @param monster
	 * @return
	 */
	protected int damagePlayer(Monster monster) {
		int monsterAtk = monster.getAtk();
		super.health = super.health - monsterAtk;
		int damage = monsterAtk - super.def;
		return damage;
	}
	
	/**
	 * 
	 * 
	 * @param player
	 * @throws IOException
	 */
//    public void movePlayer(Player player) throws IOException {
//    
//    boolean northPossible = roomExists(currentX, currentY + 1);
//    boolean southPossible = roomExists(currentX, currentY - 1);
//    boolean eastPossible = roomExists(currentX + 1, currentY);
//    boolean westPossible = roomExists(currentX - 1, currentY);
//    System.out.print("Where would you like to go :");
//    if (northPossible) {
//        System.out.print(" North (n)");
//    }
//    if (eastPossible) {
//        System.out.print(" East (e)");
//    }
//    if (southPossible) {
//        System.out.print(" South (s)");
//    }
//    if (westPossible) {
//        System.out.print(" West (w)");
//    }
//    System.out.print(" ? ");
//    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//    String direction = in.readLine();
//    if (direction.equals("n") && northPossible) {
//       this.currentY = currentY++;
//    } else if (direction.equals("s") && southPossible) {
//        this.currentY = currentY--;
//    } else if (direction.equals("e") && eastPossible) {
//        this.currentX = currentX++;
//    } else if (direction.equals("w") && westPossible) {
//        this.currentX = currentX--;
//    }
//   // currentRoom = getRoom(currentX, currentY);
//  // currentRoom.enter(player);
//    System.out.println(currentX);
//    System.out.println(currentY);
//}

protected void useCanister(Items item)
{
	Scanner input = new Scanner(System.in);
	
	if(item.getName().equalsIgnoreCase("Cryo-Canister"))
	{
		boolean frozen = false;
		this.m1.setIsFrozen(frozen);
		
	}
}

public boolean isFighting()
{
	
	return false;
}


    
} 



