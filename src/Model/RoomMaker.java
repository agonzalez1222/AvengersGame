package Model;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import Model.Room;



import java.util.ArrayList;

class RoomMaker {
protected Monster m1;
protected ArrayList<Monster> monsters;


    public  void build(Room[][] room, final int WIDTH, final int HEIGHT) {

    	// Initialize rooms (a 2D array)
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                room[i][j] = new Room(i, "", "", null, null);
            }
        }

        room[0][0].setNumber(1);
        room[0][0].setName("Engine Room");
        room[0][0].setDescription("You wake up with a throbbing headache."
        		+ " Disoriented and Floating, you look around in the void and you see a dim red light. "
        		+ "As your eyes adjust to the light you see a sign that says Emergency Power. "
        		+ "Should you go for the light and push the Button?");
        room[0][0].setItems("");
        monsters = m1.getList();
        m1 = monsters.get(0);
        room [0][0].setMonster(m1);

        room[0][1].setNumber(2);
        room[0][1].setName("Food Storage Room");
        room[0][1].setDescription("You Stumble through the door as your body becomes re acclimated to the artificial gravity."
        		+ " You look to your right and you see a computer terminal. To your right you see a bunch of dried food goods. "
        		+ "Across the room in front of you, you see a set of double doors that has Mess Hall written above it. You See M_1. You see W_1");
        room[0][1].setItems("");

        room[1][0].setNumber(3);
        room[1][0].setName("Mess Hall");
        room[1][0].setDescription("You step into the mess hall and see a trashed room."
        		+ " There are tables and chairs flipped and rotting food littering the ground. "
        		+ "To your right you See the kitchen. Across the room you see another set of double doors that is Labeled Barracks.");
        room[1][0].setItems("");
    
        room[1][1].setNumber(4);
        room[1][1].setName("Kitchen");
        room[1][1].setDescription("Your step into the Kitchen. The Floors are covered with pots and pans."
        		+ " You see No other Exits in the room. You Do see M_2. You See W_2");
        room[1][1].setItems("");
        
        room[1][1].setNumber(5);
        room[1][1].setName("Barracks Hall");
        room[1][1].setDescription("You Stare down the long Empty Barracks Hall. "
        		+ "You see 5 Clearly lobed rooms, Captains Room, Officer's Room, Barracks 1, Barracks 2, and Stairs");
        room[1][1].setItems("");
        
        room[1][1].setNumber(6);
        room[1][1].setName("Captains Room");
        room[1][1].setDescription("You Walk into the captain’s room and you are confronted by M_2. ");
        room[1][1].setItems("");
        
        room[1][1].setNumber(7);
        room[1][1].setName("Officers Room");
        room[1][1].setDescription("You walk into the officer's room. It is quiet and you don’t observe anything.");
        room[1][1].setItems("");
        
        room[1][1].setNumber(8);
        room[1][1].setName("Barracks 1");
        room[1][1].setDescription("To walk into Barak 1. The room is filled with Bunk Beds. A M_1 attacks you. There is nothing items in this room.");
        room[1][1].setItems("");
        
        room[1][1].setNumber(9);
        room[1][1].setName("Barracks 2");
        room[1][1].setDescription("To walk into Barak 2. The room is filled with Bunk Beds. A M_1 attacks you. There is nothing items in this room.");
        room[1][1].setItems("");
        
        room[1][1].setNumber(10);
        room[1][1].setName("Stairs 1");
        room[1][1].setDescription("You Walk into the Stairs from Barracks Hall and at the top of the Stairs is a door labeled ForeBay.");
        room[1][1].setItems("");
        
        room[1][1].setNumber(11);
        room[1][1].setName("Stairs 2");
        room[1][1].setDescription("You Walk into the Stairs from Aftbay and at the top of the Stairs is a door labeled Botany.");
        room[1][1].setItems("");
        
        room[1][1].setNumber(12);
        room[1][1].setName("Brig");
        room[1][1].setDescription("You walk into the brig and you are immediately attacked by M_1.");
        room[1][1].setItems("");
        
        room[1][1].setNumber(13);
        room[1][1].setName("Aft Bay");
        room[1][1].setDescription("The room is a huge empty Room. "
        		+ "There is a huge hole in the Side of the ship and you are exposed to the Cruel Vacuums of space. "
        		+ "M_6 guards the Door Labeled Stairs");
        room[1][1].setItems("");
        
        room[1][1].setNumber(14);
        room[1][1].setName("Storage Bay");
        room[1][1].setDescription("You walk into the storage bay and see Nothing of Worth. It is just a room Filled with what looks like Mining supplies.");
        room[1][1].setItems("");
        
        room[1][1].setNumber(15);
        room[1][1].setName("Floor Level Airlock");
        room[1][1].setDescription("You Walk into the Floor Level Airlock and Hear it seal behind you stabilizing the environment around you. "
        		+ "You look out the door labeled ForeBay has a green light on it."
        		+ " Then you look at the door labeled Aft Bay and it is clearly marked with a red light. "
        		+ "You should probably have a Space Suit before you enter. ");
        room[1][1].setItems("");
        
        room[1][1].setNumber(16);
        room[1][1].setName("Fore Bay");
        room[1][1].setDescription("You Walk into a huge Bay with pallets littering the floor space you see the Stairs behind you, "
        		+ "The infirmary to you Left, and the floor level airlock and Storage to your right.");
        room[1][1].setItems("");
        
        room[1][1].setNumber(17);
        room[1][1].setName("Elevator");
        room[1][1].setDescription("You walk in and see 2 buttons floor level and Bridge. There is a card key that is requested to swipe first.");
        room[1][1].setItems("");
        
        room[1][1].setNumber(18);
        room[1][1].setName("Infirmary");
        room[1][1].setDescription("You walk into the infirmary and see charts and paper work thrown everywhere. "
        		+ "At the rear of the Room you see a storage closet. To the right you see a door lobbed Lab. ");
        room[1][1].setItems("");
        
        room[1][1].setNumber(19);
        room[1][1].setName("Infirmary Closet");
        room[1][1].setDescription("You walk into the small Room and see a W_5 laying on the table before you. Do you pick it up?");
        room[1][1].setItems("");
        
        room[1][1].setNumber(20);
        room[1][1].setName("Lab");
        room[1][1].setDescription("You walk into the lab and you see a closet on the other side of the room. "
        		+ "As you are scanning the room a M_1 Attacks you out of nowhere.");
        room[1][1].setItems("");
        
        room[1][1].setNumber(21);
        room[1][1].setName("Lab Closet");
        room[1][1].setDescription("In the Small Room you see lab supplies and a Spacesuit laid out before you.");
        room[1][1].setItems("");
        
        room[1][1].setNumber(22);
        room[1][1].setName("Botany");
        room[1][1].setDescription("As you enter the botany room you feel at home with the smell of earth around you."
        		+ "The feeling is brought to a quick halt when an M_5 approaches you.");
        room[1][1].setItems("");
        
        room[1][1].setNumber(23);
        room[1][1].setName("Botany Closet");
        room[1][1].setDescription("You enter the Small closet and you see an I_3.");
        room[1][1].setItems("");
        
        room[1][1].setNumber(24);
        room[1][1].setName("Aft Bay Bridge");
        room[1][1].setDescription("You step onto a narrow catwalk with a door labeled botany on side and airlock on the opposite."
        		+ " You look down and recognize the aft bay that you have already been through.");
        room[1][1].setItems("");
        
        room[1][1].setNumber(25);
        room[1][1].setName("Bridge Level Airlock");
        room[1][1].setDescription("You walk into the Bridge airlock and see an M_7. You can't use that door Until you Remove him. ");
        room[1][1].setItems("");
        
        room[1][1].setNumber(26);
        room[1][1].setName("Water Treatment");
        room[1][1].setDescription("You walk into the water treatment plant and see a tool bench. On the tool bench you see A W_4."
        		+ " You Might be able to use this to get rid of M_7");
        room[1][1].setItems("");
        
        room[1][1].setNumber(27);
        room[1][1].setName("Fore Bay Bridge");
        room[1][1].setDescription("You step onto a narrow catwalk with a door labeled Weapons Room on side and airlock on the opposite."
        		+ " You look down and recognize the Fore bay that you have already been through.");
        room[1][1].setItems("");
        
        room[1][1].setNumber(28);
        room[1][1].setName("Weapons Room");
        room[1][1].setDescription("You walk into the Weapons Room and you See some W_5 to your Right you see a room marked Server Room.");
        room[1][1].setItems("");
        
        room[1][1].setNumber(29);
        room[1][1].setName("Server Room");
        room[1][1].setDescription("You enter the Server room. You are immediately attacked by M_6. ");
        room[1][1].setItems("");
        
        room[1][1].setNumber(30);
        room[1][1].setName("Server Room Closet");
        room[1][1].setDescription("In the Small Room you see I_9. You could probably use this in the Elevator.");
        room[1][1].setItems("");
        
        room[1][1].setNumber(31);
        room[1][1].setName("The Bridge");
        room[1][1].setDescription("You are Confronted by B_1");
        room[1][1].setItems("");
        
    }

    public static void print(Room[][] room, int x, int y) {

        System.out.println(room[x][y].getDescription());
        System.out.println("You see: " + room[x][y].getItems());
        System.out.println();
    }

    // Remove item from room when added to inventory
    public static void removeItem(Room[][] room, int x, int y, String item) {
    	
    	room[x][y].deleteItem(item);
    }
}





//import com.sun.javafx.collections.MappingChange.Map;

//public class RoomMaker {
//	
//	    private final Map<Integer, Map<Integer, Room>> map = new HashMap<Integer, Map<Integer, Room>>();
//	    //HashMap<Int,Gmap> map =new HashMap<Int,Gmap>();
//	    private Room currentRoom;
//	    private int currentX = 0;
//	    private int currentY = 0;
//	    Items a1 = new Items();
//		ArrayList<Items> list1 = new ArrayList<>();
//	    
//	    private RoomMaker(){
//	    }
//	    private void putRoom(int x, int y, Room room) {
//	        if (!map.containsKey(x)) {
//	            map.put(x, new HashMap<Integer, Room>());
//	        }
//	        map.get(x).put(y, room);
//	    }
//
//	    private Room getRoom(int x, int y) {
//	        return map.get(x).get(y);
//	    }
//
//	    private boolean roomExists(int x, int y) {
//	        if (!map.containsKey(x)) {
//	            return false;
//	        }
//	        return map.get(x).containsKey(y);
//	    }
//
////	    private boolean isComplete() {
////	        return currentRoom.isBossRoom() && currentRoom.isComplete();
////	    }
//
//
//	    public void movePlayer(Player player) throws IOException {
//	        boolean northPossible = roomExists(currentX, currentY + 1);
//	        boolean southPossible = roomExists(currentX, currentY - 1);
//	        boolean eastPossible = roomExists(currentX + 1, currentY);
//	        boolean westPossible = roomExists(currentX - 1, currentY);
//	        System.out.print("Where would you like to go :");
//	        if (northPossible) {
//	            System.out.print(" North (n)");
//	        }
//	        if (eastPossible) {
//	            System.out.print(" East (e)");
//	        }
//	        if (southPossible) {
//	            System.out.print(" South (s)");
//	        }
//	        if (westPossible) {
//	            System.out.print(" West (w)");
//	        }
//	        System.out.print(" ? ");
//	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//	        String direction = in.readLine();
//	        if (direction.equals("n") && northPossible) {
//	            currentY++;
//	        } else if (direction.equals("s") && southPossible) {
//	            currentY--;
//	        } else if (direction.equals("e") && eastPossible) {
//	            currentX++;
//	        } else if (direction.equals("w") && westPossible) {
//	            currentX--;
//	        }
//	        currentRoom = getRoom(currentX, currentY);
//	        currentRoom.enter(player);
//	    }
//
////	    public void startQuest(Player player) throws IOException {
////	        while (player.isAlive() && !isComplete()) {
////	            movePlayer(player);
////	        }
////	        if (player.isAlive()) {
////	            System.out.println(Art.CROWN);
////	        } else {
////	            System.out.println(Art.REAPER);
////	        }
////	    }
//
//	    public static RoomMaker newInstance() {
//	    	RoomMaker roomG = new RoomMaker();
//	    	roomG.putRoom(0, 0, Room.newRegularInstance());
//	    	roomG.putRoom(-1, 1, Room.newRegularInstance());
//	    	roomG.putRoom(0, 1, Room.newRegularInstance());
//	    	roomG.putRoom(1, 1, Room.newRegularInstance());
//	    	roomG.putRoom(-1, 2, Room.newRegularInstance());
//	    	roomG.putRoom(1, 2, Room.newRegularInstance());
//	    	roomG.putRoom(-1, 3, Room.newRegularInstance());
//	    	roomG.putRoom(0, 3, Room.newRegularInstance());
//	    	roomG.putRoom(1, 3, Room.newRegularInstance());
//	       // dungeon.putRoom(0, 4, Room.newBossInstance());
//	    	roomG.currentRoom = roomG.getRoom(0, 0);
//	        return roomG;
//	    }
//
//	}