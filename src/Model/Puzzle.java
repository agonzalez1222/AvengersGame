package Model;

import java.util.ArrayList;

/**
 * Class: Puzzle
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
public class Puzzle {

//ID-int , description-string, item- item.itemID, 
	static int puzzleID;
	static String description;
	
	protected Puzzle(int puzzleID, String description){
		this.puzzleID = puzzleID;
		this.description = description;
		
	}
	
	protected static ArrayList<Puzzle> puzzle = new ArrayList<Puzzle>();
	{
		//for IDs put in string
		int PZ_01 = 0;
		Puzzle puzzle1 = new Puzzle(PZ_01, "You need to Turn Back on the Lights and Turn back on the Environmental Controls By Flipping Switches so you can navigate the ship.");
		int PZ_02 = 0;
		Puzzle puzzle2 = new Puzzle(PZ_02, "The User Needs To find I_7 In RM_07 to enter in RM_19 to Enter RM_20. This allows the user to be on step closer to Finishing the game.");
		int PZ_03 = 0;
		Puzzle puzzle3 = new Puzzle(PZ_03, "You Need to Find the Space suit in RM_21 So you can Survive Walking through RM_13 That is exposed to the harsh environments of space.");
		int PZ_04 = 0;
		Puzzle puzzle4 = new Puzzle(PZ_04, "You Need To Kill M_7 in RM_25 With W_4 Found in Rm_26. M7 Will not die until You Can use W_4 on it. Once complete you are able to Proceed");
		int PZ_05 = 0;
		Puzzle puzzle5 = new Puzzle(PZ_05, "You Need to find I_9 in RM_30 So that You Can Activate the Elevator To enter the Bridge.");
		int PZ_06 = 0;
		Puzzle puzzle6 = new Puzzle(PZ_06, "You Need to enter the Captains Password found in RM_06 To send the Distress Signal To Get Found and Saved.");
	}
	}
	

