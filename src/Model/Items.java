package Model;

import java.util.ArrayList;

public class Items 
{
	// Item Variables
	static String itemID;
	static String itemName;
	static String itemDescription;
	static String itemEffect;
	static int healthRegen;
	static int increaseAmmo;
	static Boolean puzzleItem;
	
	// 
	protected Items(String itemID, String itemName, String itemDescription,
			String itemEffect, int healthRegen, int increaseAmmo, Boolean puzzleItem) {
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemEffect = itemEffect;
		this.healthRegen = healthRegen;
		this.increaseAmmo = increaseAmmo;
		this.puzzleItem = puzzleItem;
	}
	
	// Creates items and places them in an Arraylist
	protected static ArrayList<Items> items = new ArrayList<Items>();
	{
		Items medkit = new Items("I1", "MdKit", "A standard first aid kit for treating minor wounds",
				"Replenish Health by 20", 20, 0, false);
		Items gasCanister = new Items("I2", "Gas Canister", "A refill canister for a gas torch. Highly flammable",
				"Increases gas torch ammo by 50%", 0, 50, false);
		Items plasmaRounds = new Items("I3", "Plasma Rounds", "Ammunition for a plasma pistol",
				"Increase plasma pistol ammo by 6", 0, 6, false);
		Items greenHerb = new Items("I4", "Green Herb", "An edible herb found in the greenhouse. Eat it to restore health.", 
				"Replenishes Health by 15", 15, 0, false);
		Items redHerb = new Items("I5", "Red Herb", "A vibrant red herb. It's inedible. Perhaps it has some other use?", 
				"Can be combine with green herb", 0, 0, false);
		Items mixedHerb = new Items("I6", "Mixed Herbs", "A combination of a green and red herb. Restores a good amount of health.", 
				"Replenishes Health by 30", 30, 0, false);
		Items captainKey = new Items("I7", "Captain's Key Card", "A Card Key the captain used to enter special areas of the ship.", 
				"", 0, 0, true);
		Items flashlight = new Items("I8", "Flashlight", "", "", 0, 0, true);
		Items labPaper = new Items("I9", "Lab Paper", "A piece of paper found in the pocket of a lab coat. There's something written on it...", 
				"", 0, 0, true);
		Items cryoCanister = new Items("I10", "Cryo-Canister", "A container that instantly freezes an area once thrown. Can be used to slow down enemies.", 
				"Causes a monster to skip it's turn once per use.", 0, 0, false);
		
		// Adding the items to the array list here.
		items.add(medkit); items.add(gasCanister); items.add(plasmaRounds); items.add(greenHerb);
		items.add(redHerb); items.add(mixedHerb); items.add(captainKey); items.add(flashlight);
		items.add(labPaper); items.add(cryoCanister);
		
	}
	
	
	
	public void useHealthRegenItem() {
			
		if(items.equals("greenHerb"))
		{
			
		}
		else
		{
			
		}
	}
	
	
	
}
