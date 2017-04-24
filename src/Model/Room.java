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
 * @author  Course : ITEC 3860, Spring, 2017 Written: April , 
 *         2017
 * 
 * 
 *         This class will 
 * 
 *         Purpose: The class will 
 *
 */

public class Room {
	//private String description;
	private Boolean isPuzzleRoom;
	private Boolean isBossRoom;
	//private Monster monster;
	//private final static Random random = new Random();
    //private final static Set<Integer> roomsSeen = new HashSet<Integer>();
   // private final static int NUM_ROOMS = 34;
    private int number;
    private String name;
    private String description;
    
    protected Items itemHolder = new Items();
    protected ArrayList<Items> list2 = itemHolder.getList();
    
    protected Monster monsterHolder = new Monster();
    protected ArrayList<Monster> list3 = monsterHolder.getList();
    
    protected Artifacts artifactHolder = new Artifacts();
    protected ArrayList<Artifacts> list4 = artifactHolder.getList();
    
    public ArrayList<Items> items = new ArrayList<>();
    
    public ArrayList<Monster> monster = new ArrayList<>();

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
	
	
	public static Room newRoomInstance() {
		return null;
	}
	
	public Boolean isBossRoom(){
		return isBossRoom;
	}
	
	public Boolean isPuzzleRoom(){
		return isPuzzleRoom;
	}
	
	
	

    public Room(int number, String name, String description,
            ArrayList<Items> item, ArrayList<Artifacts> artifact, ArrayList<Monster> monster) {
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

    public void setItems(Items item) {
    	this.itemHolder = item;
        this.items.add(item);
    }
//    public Monster getMonster(Monster)
//    {
//    	return this.monster.get(m1);
//    }
    
    public void setMonster(Monster monster) {
        this.monsterHolder = monster;
    	this.monster.add(monster);
    }
    
    public void setArtifact(Artifacts artifact) {
        this.artifactHolder = artifact;
    	this.artifact.add(artifact);
    }

    public void deleteItem(Items item) {
        this.items.remove(item);
    }
    public void deleteMonster(Monster monster) {
        this.items.remove(monster);
    }

    public String getItems() {
        return this.itemHolder.getName();
    }
    public String getMonster() {
        return this.monsterHolder.getName();
    }
    public String getArtifact() {
        return this.artifactHolder.getName();
    }
    
    
}
