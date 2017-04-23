/**
 * Class: Monster Tester
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

package Model;
import Model.Monster;
import Model.Items;
import Model.Player;
import java.io.IOException;
import java.util.Scanner;

public class MonsterPlayerOperations 
{
	
	// deleted all of the comments 
	public MonsterPlayerOperations(Player player, Monster monster, Items item) throws IOException
	{
		while (player.isAlive() && monster.isAlive()) {
			System.out.println("You have encountered a(n)" + monster.getName() + ": " + monster.getDescription());
			System.out.println("Player Health: " + player.getHealth() + "\n");
			System.out.println(monster.getName() + "Health: " + monster.getHealth());
			FightSequence(player, monster, item);
		}
	}
		
	public void FightSequence(Player gamePlayer, Monster gameMonster, Items gameItem) {
		Scanner input = new Scanner(System.in);
		System.out.println("What would you like to do? \nAttack, Run, or Use Item?");
		String userInput = input.nextLine();
		if(userInput.equalsIgnoreCase("Attack"))
		{
			System.out.println("You have chosen to attack: " + gameMonster.getName());
		}
		
		if(userInput.equalsIgnoreCase("Run"))
		{
			Player.escapeRoll();
			if (Player.escapeRoll() > 5) {
				System.out.println("You managed to escape.");
				// Add code to exit the fight here.
			}
		}
		
		if(userInput.equalsIgnoreCase("Use Item"))
		{
			gamePlayer.useHealthRegenItem(gameItem);
		} else {	
			System.out.println("That action was not recognized, please try to enter another option");	
			//Player.Fight();
		}
		
		if (gamePlayer.getHealth() < 0) {
			System.out.println("You died.");
			// System.exit(0);
		} else if (gameMonster.getHealth() < 0) {
			System.out.println("You have slain: " + gameMonster.getName());
		}
		input.close();
		System.out.println("Hi");
		} 
}
