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
	protected static ArrayList<Items> items;
	protected Items a1;
	
	/**
     * Method: Items()
     * 
     * A constructor method that accepts values for all the attributes and sets
     * them.
     * 
     * @param itemID
     * @param itemName
     * @param itemDescription
     * @param itemEffect
     * @param healthRegen
     * @param increaseAmmo
     * @param puzzleItem
     * 
     */
	public Items(String itemID, String itemName, String itemDescription,
			String itemEffect, int healthRegen, int increaseAmmo, Boolean puzzleItem) {
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemEffect = itemEffect;
		this.healthRegen = healthRegen;
		this.increaseAmmo = increaseAmmo;
		this.puzzleItem = puzzleItem;
	}
	
	/**
     * Getter method for name
     * @return the itemName
     */
	public String getName()
	{
		return itemName;
	}
	/**
     * Getter method for ID
     * @return the itemID
     */
	
	protected String getID()
	{
		return itemID;
	}
	/**
     * Getter method for description
     * @return the itemDescription
     */
	protected String getDescription()
	{
		return itemDescription;
	}
	/**
     * Getter method for itemEffect
     * @return the itemEffect
     */
	protected String getItemEffect()
	{
		return itemEffect;
	}
	
	protected int getHealthRegen()
	{
		return healthRegen;
	}
	protected int getIncreaseAmmo()
	{
		return increaseAmmo;
	}
	
	protected boolean getIsPuzzelItem()
	{
		return puzzleItem;
	}
	

	
	public Items()
	{
	
	}
	
	
		public ArrayList<Items> getList()
		{
			return items;
		}
		
		public static Items getItems(int i)
		{
			return items.get(i);
		}
		
		protected void setIncreaseAmmo(int i)
		{
			this.increaseAmmo = i;
		}

	
}
