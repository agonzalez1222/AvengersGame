package Model;
import java.util.Scanner;

public class Player {
	
	// Player variables
	private int health = 100;
	private int baseAtk;
	private  int baseDef;
	private static String playerCmd;
	public  Monster monster;
	private String[] invItems;
	private String[] equippedItems;
	
	protected Player(int health, int baseAtk, int baseDef) {
		this.baseAtk = baseAtk;
		this.baseDef = baseDef;
		this.health = health;
	}
	
	public static void Fight()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What would you like to do? \nAttack, Run, or Use Item?");
		String userInput = input.nextLine();
		if(userInput.equalsIgnoreCase("Attack"))
		{
			//System.out.println("You have chosen to attack: " + monsterName);
			
			
		}
		if(userInput.equalsIgnoreCase("Run"))
		{
			
		}
		if(userInput.equalsIgnoreCase("Use Item"))
		{
			
		}
		else 
		{	
			System.out.println("That action was not recognized, please try to enter another option");	
			Player.Fight();
		}

	}
	
	
	// Checks if the player is still alive if their health is above 0
	public Boolean isAlive() {
		return health > 0;
	}
	
	// Will be used to display the players current Health Pool
	public String currentHealth() {
		return "Player Health: " + health;
	}
	
	// Will be used to display the players current Attack Power
	public String currentAtk() {
		return "Current Attack Power: " + baseAtk;
	}
	
	// Will be used to display the players current Defense Power
	public String currentDef() {
		return "Current Defense Power: " + baseDef;
	}
	
}
