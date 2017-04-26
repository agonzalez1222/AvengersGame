package Model;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

/**
 * Class: Game
 * 
 * @author Magdalena Ledezma Course : ITEC 3860, Spring, 2017 Written: April 3, 
 *         2017
 * 
 * 
 *         This class will display the name and the details of the story. It also displays the 
 *         menu. 
 * 
 *         Purpose: The class shows the information of the game and pulls up the menu.
 *
 */


public class Game implements Serializable {

	private static int puzzlesCompleted;
	private static int currentRoom;
	private static int currentScore;
	private Player player;
	private static Game game;
	private int score;
	
	
	
	Items item = new Items();
	ArrayList<Items> itemArray = item.getList();
	Artifacts artifact = new Artifacts();
	ArrayList<Artifacts> artifactArray = artifact.getList();
	//public string Story. put story in there start game
	public static void gameStartText(){
		
		
		
		
	String story = "Story: The exploratory ship Legacy becomes\n"
			+ " stranded in space when a part of the crew, belonging\n"
			+ " to a mysterious cult, summons a cosmic being and floods\n"
			+ " the ship with horrors beyond imagination.";

	String storyDescription = "Title: Astral Possession " ;
	String theme =  "Theme: Sci-Fi/Cosmic Horror " 
	+ " Player: Un-named engineer";
	
	
	System.out.println(theme);
	System.out.println(story);
	System.out.println(storyDescription);
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

		System.out.println("||||||||||||||||||||||||||||||||||||||||| Help Menu |||||||||||||||||||||||||||||||||||||||||");
		System.out.println("");
		String goal = "Goal: Reach the bridge and send a distress signal.";

		String score = "Score: Score starts at 1000. \nEach move/step made reduces the score by a "
				+ "\ncertain amount. The fewer moves made, the higher the score."; 

		String stats = "Stats: Player starts with 100 HP, 5 defense from wearing the "
				+ "\nshirt armor, and 1 attack. Armor increases defense. Defense decreases "
				+ "\ndamage taken from monsters (example: monster hits for+ 20 damage, but player "
				+ "\nis wearing shirt so it only does 15 damage). Weapons have an attack stat that "
				+ "\ndirectly equals how much HP monsters lose when hit by the player.";
		
		String commands = "Inputs are: " + "Map | " + "Inventory | " + "Score | " + "load | "+ "save";
		
		System.out.println(goal);
		System.out.println(score);
		System.out.println(stats);
		System.out.println("||||||||||||||||||||||||||||||||||||||||| Commands |||||||||||||||||||||||||||||||||||||||||");
		System.out.println("");
		System.out.println(commands);

		
		System.out.print("Goal: Reach the bridge and send a distress signal to escape the horrors within the ship.");
		System.out.println("Score: Score starts at 1000. Each move/step made reduces the score by a "
				+ "\ncertain amount. The fewer moves made, the higher the score.");
		System.out.println("||||||||||||||||||||||||||||||||||||||||| End |||||||||||||||||||||||||||||||||||||||||");

//		String stats = "Stats: Player starts with 100 HP, 5 defense from wearing the "
//				+ "shirt armor, and 1 attack. Armor increases defense. Defense decreases "
//				+ "damage taken from monsters (example: monster hits for+ 20 damage, but player "
//				+ "is wearing shirt so it only does 15 damage). Weapons have an attack stat that "
//				+ "directly equals how much HP monsters lose when hit by the player.";
//		String commands = "openMap" + "";

	}


	/**
	 * Method: viewInventory()
	 * 
	 * This method shows your inventory.
	 * @player 
	 */

//	public static void viewInventory(Player player){
	//	System.out.println("You open your bag and search through your belongings.");
		//System.out.println(player.invItems.get());
		// for loop here or get ArrayList differently later
	//}
	//
	/**
	 * Method: viewMap()
	 * 
	 * This method accesses the Map in the View Map class.
	 * 
	 */
	
	public static void viewMap(){
        MapView.ViewMap();
	}
	/**
	 * Method: viewScore()
	 * 
	 * This method gets the current score of the player and displays it.
	 * 
	 * @player
	 * 
	 */

	public static void viewScore(Player player){
		System.out.println(player.getCurrentScore());
	}
	
	/**
	 * Method: saveGame()
	 * 
	 * This method saves the player's file in the desktop.
	 * 
	 */
	
	public static void saveGame(){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a name for your save file: " );
		String save =  input.nextLine();
		
		File newFile = new File(save + ".txt" ); 
	try {
		PrintWriter print = new PrintWriter(newFile);
		System.out.println("You have successfully saved this file.");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("Saving error");
	}

	}
	
	/**
	 * Method: intro()
	 * 
	 * The method displays the introduction of the game.
	 * 
	 */
	public static void intro() {
		System.out.print("                      	                                 +-------------------------------+\n");
    	System.out.print("					  		 |       Astral Possession       |\n");
    	System.out.println("					  		 +-------------------------------+");
    	System.out.println("");
    	
    	System.out.println("");
    	System.out.println("Welcome to Astral Possession, a sci-fi/cosmic horror text based game.");
    	System.out.println("You play an Un-named Engineer aboard the exploratory ship Legacy, which later becomes stranded in space when a part of the crew,");
    	System.out.println("belonging to a mysterious cult, summons a cosmic being and floods the ship with horrors beyond imagination. Your goal is to make");
    	System.out.println("your way through the horrors of the ship to the bridge and send a distress signal for help.\n");
    	System.out.println("Type a command to begin:");
    	System.out.println();
	

	}
	
	/**
	 * Method: titleMenu()
	 * 
	 * The method prints out the menu.
	 * 
	 */
	
	public static void titleMenu() {
		
    	
    	System.out.println("Start Game\nHelp Menu\nLoad Game\nSave Game\nExit Game ");
    	
	}
}	
		
	








