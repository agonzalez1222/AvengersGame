package Model;
import java.util.ArrayList;

/**
 * Class: Artifacts
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

public class Artifacts 
{
	private String artifactName;
	private String description;
	private int attack;
	private int maxAmmo;
	private int damageResist;
	protected ArrayList<Artifacts> artifacts;
	
	public Artifacts(String artifactName, String description, int attack, int maxAmmo, int damageResist)
	{
		this.artifactName = artifactName;
		this.description = description;
		this.attack = attack;
		this.maxAmmo = maxAmmo;
		this.damageResist = damageResist;
		
	}
	
	
	
	/**
	 * @return the artifactName
	 */
	public String getName() {
		return artifactName;
	}
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * @return the attack
	 */
	public int getAttack() {
		return attack;
	}
	
	/**
	 * @return the maxAmmo
	 */
	public int getMaxAmmo() {
		return maxAmmo;
	}
	
	/**
	 * @return the damageResist
	 */
	public int getDamageResist() {
		return damageResist;
	}
	
	/**
	 * @return the artifacts
	 */
	public  ArrayList<Artifacts> getArtifacts() {
		return artifacts;
	}
	
	public Artifacts()
	{

	}
	
	
	
	protected ArrayList<Artifacts> getList()
	{
		return this.artifacts;
	}
	
	protected Artifacts getArtifacts(int i)
	{
		return artifacts.get(i);
	}
	
}
