package Model;
import java.util.ArrayList;
public class Artifacts 
{
	private String artifactName;
	private String description;
	private int attack;
	private int maxAmmo;
	private int damageResist;
	
	
	protected Artifacts(String artifactName, String description, int attack, int maxAmmo, int damageResist)
	{
		this.artifactName = artifactName;
		this.description = description;
		this.attack = attack;
		this.maxAmmo = maxAmmo;
		this.damageResist = damageResist;
		
	}
	
	protected static ArrayList<Artifacts> artifacts = new ArrayList<Artifacts>();
	{
		Artifacts pipe = new Artifacts("Pipe", "A piece of piping. You're not sure what it belongs to, but it can't be too important.", 2, 1000, 0);
		Artifacts knife = new Artifacts("Knife", "A knife found in the Galley. Slightly dull from frequent use.", 6, 1000, 0);
		Artifacts wrentch = new Artifacts("Wrentch", "A standard wrench. Used for maintaining equipment on the ship." , 8, 1000, 0);
		Artifacts plasmaSaw = new Artifacts("Plasma Saw", "A small, handheld saw for maintenance on the ship. More of a tool than a weapon." ,13, 1000, 0);
		Artifacts gasTorch = new Artifacts("Gas Torch", "A gas torch used for ship maintenance. It has a limited amount of fuel." ,20, 100, 0);
		Artifacts plasmaPistol = new Artifacts("Plasma Pistol", "A small firearm used for self-defense. Can hold 12 plasma rounds.", 35, 12, 0);
		Artifacts shirt = new Artifacts("Civilian Shirt", "A standard civilian's shirt. Comfortable but not very protective." , 0, 1, 5);
		Artifacts spaceSuit = new Artifacts("Space Suit", "A space suit that allows the user to exist in the vacuum of space. Well insulated but not great against slashing or piercing damage." ,0, 1, 15);
		Artifacts armor = new Artifacts("ASM4 Series Gaurd Armor", "Armor that protects the user from extraterrestrial threats and medium gunfire" ,0, 1, 20);
		
		artifacts.add(pipe);
		artifacts.add(knife);
		artifacts.add(wrentch);
		artifacts.add(plasmaSaw);
		artifacts.add(gasTorch);
		artifacts.add(plasmaPistol);
		artifacts.add(shirt);
		artifacts.add(spaceSuit);
		artifacts.add(armor);
		
	}
	
}
