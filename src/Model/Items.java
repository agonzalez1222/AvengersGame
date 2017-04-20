package Model;

import java.util.ArrayList;

/**
 * Class: Items
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

public class Items 
{
	// Item Variables
	protected String itemID;
	protected String itemName;
	protected String itemDescription;
	protected String itemEffect;
	protected int healthRegen;
	protected int increaseAmmo;
	protected Boolean puzzleItem;
	protected Player player;
	protected ArrayList<Items> items;
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
	
	
		
		// Adding the items to the array list here.
		protected void addItemsToList()
		{
		Items medkit = new Items("I1", "MdKit", "A standard first aid kit for treating minor wounds", "Replenish Health by 20", 20, 0, false);
		Items gasCanister = new Items("I2", "Gas Canister", "A refill canister for a gas torch. Highly flammable", "Increases gas torch ammo by 50%", 0, 50, false);
		Items plasmaRounds = new Items("I3", "Plasma Rounds", "Ammunition for a plasma pistol", "Increase plasma pistol ammo by 6", 0, 6, false);
		Items greenHerb = new Items("I4", "Green Herb", "An edible herb found in the greenhouse. Eat it to restore health.",  "Replenishes Health by 15", 15, 0, false);
		Items redHerb = new Items("I5", "Red Herb", "A vibrant red herb. It's inedible. Perhaps it has some other use?",  "Can be combine with green herb", 0, 0, false);
		Items mixedHerb = new Items("I6", "Mixed Herbs", "A combination of a green and red herb. Restores a good amount of health.",  "Replenishes Health by 30", 30, 0, false);			Items captainKey = new Items("I7", "Captain's Key Card", "A Card Key the captain used to enter special areas of the ship.",  "", 0, 0, true);
		Items flashlight = new Items("I8", "Flashlight", "", "", 0, 0, true);
		Items labPaper = new Items("I9", "Lab Paper", "A piece of paper found in the pocket of a lab coat. There's something written on it...",  "", 0, 0, true);
		Items cryoCanister = new Items("I10", "Cryo-Canister", "A container that instantly freezes an area once thrown. Can be used to slow down enemies.",  "Causes a monster to skip it's turn once per use.", 0, 0, false);
			
		items.add(medkit); 
		items.add(gasCanister); 
		items.add(plasmaRounds);
		items.add(greenHerb);
		items.add(redHerb); 
		items.add(mixedHerb); 
		items.add(captainKey); 
		items.add(flashlight);
		items.add(labPaper); 
		items.add(cryoCanister);
		}
	
		public Items getItems(int i)
		{
			return items.get(i);
		}
	
	
	public void useHealthRegenItem(Items a1)
	{
			
		if(items.get(3).equals(a1))
		{
			int playerHealth = player.getHealth() + 30;
			player.setHealth(playerHealth);
			System.out.println("Your new health is:" + player.getHealth());
		}
		else
		{
			System.out.println("error");
		}
	} 
	
	
}
