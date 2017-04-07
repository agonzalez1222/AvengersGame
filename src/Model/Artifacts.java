package Model;
import java.util.ArrayList;
public class Artifacts 
{
	private String artifactName;
	private int attack;
	private int maxAmmo;
	private int damageResist;
	private int hpRestore;
	
	public Artifacts(String artifactName, int attack, int maxAmmo, int damageResist, int hpRestore)
	{
		this.artifactName = artifactName;
		this.attack = attack;
		this.maxAmmo = maxAmmo;
		this.damageResist = damageResist;
		this.hpRestore = hpRestore;
	}
	
	private static ArrayList<Artifacts> artifacts = new ArrayList<Artifacts>();
	{
		Artifacts pipe = new Artifacts("Pipe", 2, 1000, 0, 0);
		Artifacts knife = new Artifacts("Knife", 6, 1000, 0, 0);
		Artifacts wrentch = new Artifacts("Wrentch", 8, 1000, 0, 0);
		Artifacts plasmaSaw = new Artifacts("Plasma Saw", 13, 1000, 0, 0);
		Artifacts gasTorch = new Artifacts("Gas Torch", 20, 100, 0, 0);
		Artifacts plasmaPistol = new Artifacts("Plasma Pistol", 35, 12, 0, 0);
		Artifacts shirt = new Artifacts("Civilian Shirt", 0, 1, 5, 0);
		Artifacts spaceSuit = new Artifacts("Space Suit", 0, 1, 15, 0);
		Artifacts armor = new Artifacts("ASM4 Series Gaurd Armor", 0, 1, 20, 0);
		
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
