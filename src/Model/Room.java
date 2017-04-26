package Model;
//import java.io.IOException;
//import java.io.Serializable;
//import java.util.HashSet;
//import java.util.Random;
//import java.util.Set;
import java.util.ArrayList;


/**
 * Class: Room
 * 
 * @author Team Avengers Course : ITEC 3860, Spring, 2017 Written: April 22,2017 
 *         
 * 
 * 
 *         This class will 
 * 
 *         Purpose: The class will 
 *
 */

public class Room {
	private Boolean isPuzzleRoom;
	private Boolean isBossRoom;
	protected Monster monster;
    private int number;
    private String name;
    private String description;
    protected Items item;
    protected Artifacts artifacts;
    
    protected Items itemHolder = new Items();
   protected ArrayList<Items> list2 = itemHolder.getList();
    
   
    
    protected Artifacts artifactHolder = new Artifacts();
    protected ArrayList<Artifacts> list4 = artifactHolder.getList();
    
    public ArrayList<Items> itemsArray = new ArrayList<>();
    public Monster monsterHolder = new Monster();
    public ArrayList<Monster> monsterArray = monsterHolder.getList();
    public ArrayList<Monster> test = new ArrayList<>();

   public ArrayList<Artifacts> artifact = new ArrayList<>();
	
	
	public static void main(String[] args)
	{
		Items itemHolder = new Items();
	    ArrayList<Items> list2 = itemHolder.getList();
	 //   ArrayList<Items> items = new ArrayList<>();
	    for(int i = 0; i < 9; i++)
	    {
	      System.out.println(list2.get(i).getName());
	    }
		
	}
//	private Room(String description,  Boolean isPuzzleRoom, Boolean isBossRoom) { //Monster monster,
//		this.description = description;
//		this.isBossRoom = isBossRoom;
//		this.isPuzzleRoom = isPuzzleRoom;
//		//this.monster = monster;
//		
//	}
	 public Room(int number, String name, String description,
	            Items item, Artifacts artifact, Monster monster) {
//	    	this.number = number;
//	    	this.name = name;
//	    	this.description = description;
//	    	this.item = item;
//	    	this.artifacts = artifact;
	    }
	
	public void setMonster(Monster monster)
	{
        this.monsterHolder = monster;
        this.test.add(monster);
    }
	
	public Monster getMonster(Monster monster) {
        
		return monster;
    }
	
	public static Room newRoomInstance() {
		return null;
	}
	
	public Boolean isBossRoom(){
		return isBossRoom;
	}
	
	public Boolean isPuzzleRoom(){
		return isPuzzleRoom;
	}
	
	public String getMonsterName()
	{
		return this.monsterHolder.getName();
	}
	

   

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    
//    public Monster getMonster(Monster)
//    {
//    	return this.monster.get(m1);
//    }
    
    
    
    

    public void deleteItem(Items item) {
        this.itemsArray.remove(item);
    }
    public void deleteMonster(Monster monster) {
        this.itemsArray.remove(monster);
    }

    public String getItems() {
    	
        return itemHolder.getName();
    	    	
    }
    
    
    public Items getItemRef(Items items)
	{
    	return items;
	}
    
    public void setItems(Items lol) {
    	this.itemHolder = lol;
        this.itemsArray.add(itemHolder);
    }
    public String getArtifact() {
    	
    	
        return this.artifactHolder.getName();
    	
    	
    }
    public Artifacts getArt(Artifacts artifact)
	{
    	return artifact;
	}
    
    public void setArtifact(Artifacts art) {
        this.artifactHolder = art;
    	this.artifact.add(art);
    }
    
    
    
    
    
}
