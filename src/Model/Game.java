package Model;
import java.io.Serializable;

/**
 * Class: Game
 * 
 * @author Magdalena Ledezma Course : ITEC 3860, Spring, 2017 Written: April 3, 
 *         2017
 * 
 * 
 *         This class will 
 * 
 *         Purpose: The class will 
 *
 */


public class Game  implements Serializable {

	private static int puzzlesCompleted;
	private static int currentRoom;
	private static int currentScore;

	//public string Story. put story in there start game
	public static void gameStartText(){
	String story = "Story: The exploratory ship Legacy becomes"
			+ " stranded in space when a part of the crew, belonging"
			+ " to a mysterious cult, summons a cosmic being and floods"
			+ " the ship with horrors beyond imagination.";

	String storyDescription = "Title: Astral Possession " + "Theme: Sci-Fi/Cosmic Horror " 
	+ " Player: Un-named engineer";
	}

	//S: The player selects the Exit Game option from the main menu.

	//R: The current game is closed and the player is returned to the opening screen.
	public static void exitGame(){
		System.exit(currentRoom);
		System.exit(puzzlesCompleted);
		System.exit(currentScore);
		System.exit(0);
		
	}

	//S: The player selects the Load Game option from the main menu.

	//R: The correct game file is loaded with all of the player’s current
	//progress, inventory and last location.
	public static void loadGame(){

	}

	//S: The player selects the Open Help option from the main menu.

	//R: The player is shown a list of all legal text commands as well as basic
	//instructions on how to navigate the game.
	public static void openHelp(){

		String goal = "Goal: Reach the bridge and send a distress signal.";

		String score = "Score: Score starts at 1000. Each move/step made reduces the score by a "
				+ "certain amount. The fewer moves made, the higher the score."; 

		String stats = "Stats: Player starts with 100 HP, 5 defense from wearing the "
				+ "shirt armor, and 1 attack. Armor increases defense. Defense decreases "
				+ "damage taken from monsters (example: monster hits for+ 20 damage, but player "
				+ "is wearing shirt so it only does 15 damage). Weapons have an attack stat that "
				+ "directly equals how much HP monsters lose when hit by the player.";
		String commands = "openMap" + "";
	}




	//S: The player selects the View Inventory option from the main menu.
	//R: The player can see a list of their current inventory with numbers 
	//indicating how many of each

	public static void viewInventory(Player player){
		System.out.println("You open your bag and search through your belongings.");
		//System.out.println(player.invItems.get());
		// for loop here or get ArrayList differently later
	}
	//S: The player selects the View Map option from the main menu.
	//R: The player is shown a map of the entire area as well as a marker
	//for their current location and floor.
	public static void viewMap(){
        MapView.ViewMap();
	}

	//S: The player selects the View Score option from the main menu.

	//R: The player sees their current score for the game they are playing.
	public static void viewScore(Player player){
		System.out.println(player.getCurrentScore());
	}
	
	//S: The player selects the Save Game option from the main menu.

	//R: The player is notified that their current game has been saved, 
	//including progress, inventory, and their last location.
	public static void saveGame(){

	}
	
		
	}








