package Model;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

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
	private final static Random random = new Random();
    //private final static Set<Integer> roomsSeen = new HashSet<Integer>();
    private final static int NUM_ROOMS = 34;
    private int number;
    private String name;
    private String description;
    protected Items itemHolder = new Items();
    protected ArrayList<Items> list2 = itemHolder.getList();
    
    protected Monster monsterHolder = new Monster();
    protected ArrayList<Monster> list3 = monsterHolder.getList1();
    
    public ArrayList<Items> items = new ArrayList<>();
    
    public ArrayList<Monster> monster = new ArrayList<>();

    public ArrayList<Artifacts> artifact = new ArrayList<>();
	
	
	public static void main(String[] args)
	{
		Items itemHolder = new Items();
	    ArrayList<Items> list2 = itemHolder.getList();
	    ArrayList<Items> items = new ArrayList<>();
	    for(int i = 0; i < 9; i++)
	    {
	      System.out.println(list2.get(i).getName());
	    }
		
	}
	private Room(String description,  Boolean isPuzzleRoom, Boolean isBossRoom) { //Monster monster,
		this.description = description;
		this.isBossRoom = isBossRoom;
		this.isPuzzleRoom = isPuzzleRoom;
		//this.monster = monster;
		
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
        this.artifact.add(artifact);
    }

    public void deleteItem(Items item) {
        this.items.remove(item);
    }

    public String getItems() {
        return this.itemHolder.getName();
    }
    public String getMonster() {
        return this.monsterHolder.getName();
    }

//    public static Room newRegularInstance() {
//        if (roomsSeen.size() == NUM_ROOMS) {
//            roomsSeen.clear();
//        }
//        int i;
//        do {
//            i = random.nextInt(NUM_ROOMS);
//        } while (roomsSeen.contains(i));
//        roomsSeen.add(i);
//
//        String roomDescription = null;
//        
//        if (i == 0) {
//            roomDescription = "You wake up with a throbbing headache. Disoriented and Floating, you look around in the void and you see a dim red light."
//            		+ " As your eyes adjust to the light you see a sign that says Emergency Power. Should you go for the light and push the Button?";
//        } else if (i == 1) {
//            roomDescription = "You Stumble through the door as your body becomes re acclimated to the artificial gravity. You look to your right and you see a computer terminal."
//            		+ " To your right you see a bunch of dried food goods. Across the room in front of you, you see a set of double doors that has Mess Hall written above it. "
//            		+ "You See M_1. You see W_1";
//            
//        } else if (i == 2) {
//            roomDescription = "You step into the mess hall and see a trashed room. There are tables and chairs flipped and rotting food littering the ground. "
//            		+ "To your right you See the kitchen. Across the room you see another set of double doors that is Labeled Barracks.";
//            
//        } else if (i == 3) {
//            roomDescription = "Your step into the Kitchen. The Floors are covered with pots and pans. You see No other Exits in the room. You Do see M_2. You See W_2";
//            
//        } else if (i == 4) {
//            roomDescription = "You Stare down the long Empty Barracks Hall. You see 5 Clearly lobed rooms, Captains Room, Officer's Room, Barracks 1, Barracks 2, and Stairs";
//            
//        } else if (i == 5) {
//            roomDescription = "You Walk into the captain’s room and you are confronted by M_2";
//            
//        } else if (i == 6) {
//            roomDescription = "You walk into the officer's room. It is quiet and you don’t observe anything.";
//        } 
//         else if (i == 7) {
//            roomDescription = "To walk into Barak 1. The room is filled with Bunk Beds. A M_1 attacks you. There is nothing items in this room.";
//        } 
//         else if (i == 8) {
//             roomDescription = "To walk into Barak 2. The room is filled with Bunk Beds. A M_1 attacks you. There is nothing items in this room.";
//         } 
//         else if (i == 9) {
//             roomDescription = "You Walk into the Stairs from Barracks Hall and at the top of the Stairs is a door labeled ForeBay.";
//         } 
//         else if (i == 10) {
//             roomDescription = "You Walk into the Stairs from Aftbay and at the top of the Stairs is a door labeled Botany.";
//         } 
//         else if (i == 11) {
//             roomDescription = "You walk into the brig and you are immediately attacked by M_1.";
//         } 
//         else if (i == 12) {
//             roomDescription = "The room is a huge empty Room. There is a huge hole in the Side of the ship and you are exposed to the Cruel Vacuums of space."
//             		+ " M_6 guards the Door Labeled Stairs";             
//         } 
//         else if (i == 13) {
//             roomDescription = "You walk into the storage bay and see Nothing of Worth. It is just a room Filled with what looks like Mining supplies.";
//         } 
//         else if (i == 14) {
//             roomDescription = "You Walk into the Floor Level Airlock and Hear it seal behind you stabilizing the environment around you."
//             		+ " You look out the door labeled ForeBay has a green light on it. Then you look at the door labeled Aft Bay and it is clearly marked with a red light."
//             		+ " You should probably have a Space Suit before you enter.";             
//         } 
//         else if (i == 15) {
//             roomDescription = "You Walk into a huge Bay with pallets littering the floor space you see the Stairs behind you, The infirmary to you Left, "
//             		+ "and the floor level airlock and Storage to your right.";
//         } 
//         else if (i == 16) {
//             roomDescription = "You walk in and see 2 buttons floor level and Bridge. There is a card key that is requested to swipe first.";
//         } 
//         else if (i == 17) {
//             roomDescription = "You walk into the infirmary and see charts and paper work thrown everywhere. At the rear of the Room you see a storage closet."
//             		+ " To the right you see a door lobbed Lab. ";
//         } 
//         else if (i == 18) {
//             roomDescription = "You walk into the small Room and see a W_5 laying on the table before you. Do you pick it up?";
//         } 
//         else if (i == 19) {
//             roomDescription = "You walk into the lab and you see a closet on the other side of the room. As you are scanning the room a M_1 Attacks you out of nowhere.";
//         } 
//         else if (i == 20) {
//             roomDescription = "In the Small Room you see lab supplies and a Spacesuit laid out before you.";
//         } 
//         else if (i == 21) {
//             roomDescription = "As you enter the botany room you feel at home with the smell of earth around you. The feeling is brought to a quick halt when an M_5 approaches you.";
//         } 
//         else if (i == 22) {
//             roomDescription = "You enter the Small closet and you see an I_3.";
//         } 
//         else if (i == 23) {
//             roomDescription = "You step onto a narrow catwalk with a door labeled botany on side and airlock on the opposite. "
//             		+ "You look down and recognize the aft bay that you have already been through.";
//         } 
//         else if (i == 24) {
//             roomDescription = "You walk into the Bridge airlock and see an M_7. You can't use that door Until you Remove him. ";
//         } 
//         else if (i == 25) {
//             roomDescription = "You walk into the water treatment plant and see a tool bench. On the tool bench you see A W_4. You Might be able to use this to get rid of M_7";
//         } 
//         else if (i == 26) {
//             roomDescription = "You step onto a narrow catwalk with a door labeled Weapons Room on side and airlock on the opposite."
//             		+ " You look down and recognize the Fore bay that you have already been through.";
//         } 
//         else if (i == 27) {
//             roomDescription = "You walk into the Weapons Room and you See some W_5 to your Right you see a room marked Server Room.";
//         } 
//         else if (i == 28) {
//             roomDescription = "You enter the Server room. You are immediately attacked by M_6. ";
//         } 
//         else if (i == 29) {
//             roomDescription = "In the Small Room you see I_9. You could probably use this in the Elevator.";
//         } 
//         else if (i == 30) {
//             roomDescription = "You are Confronted by B_1";
//         } 
//        // else if (i == 31) {
//        //     roomDescription = "You have Overcome the boss now enter the passcode to send the distress signal.";
//       //  } 
//        
//         else {         
//        }
//      //  return new Room(roomDescription, Monster.newRandomInstance(), false);
//		return null;
//    }
//
//    
//    public boolean isComplete() {
//        return !monster.isAlive();
//    }
//
//    @Override
//    public String toString() {
//        return description;
//    }
//
//    public void enter(Player player) throws IOException {
//        System.out.println("You are in " + description);
//       
//    }

}
