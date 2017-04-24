package Model;

/**
 * Class: Character
 * 
 * @author  Course : ITEC 3860, Spring, 2017 Written: April 18, 2017
 *         
 * 
 * 
 *         This class describes the Character class and uses the variables health, atk, def, and 
 *         current room, which are initialized, and their getters are generated.
 *         
 * 
 *         Purpose: The class creates variables in which the character will carry.
 *
 */

public abstract class Character {
	
	//instant variables
	
	public int health;
	public int atk;
	public int def;
	public Room currentRoom;
	
	/**
     * Method: Character()
     * 
     * A protected constructor method that accepts values for all the attributes and sets
     * them.
     * 
     * @param health
     * @param atk
     * @param def
     */
	protected Character(int health, int atk, int def) {
		this.health = health;
		this.atk = atk;
		this.def = def;
	}
	/**
     * Getter method for atk
     * @return the atk
     */
	public int getAtk() {
		return this.atk;
	}
	/**
     * Getter method for def
     * @return the def
     */
	public int getDef() {
		return this.def;
	}
	/**
     * Getter method for health
     * @return the health
     */
	public int getHealth() {
		return this.health;
	}
	
}
