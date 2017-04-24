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
import Model.Monster;



import java.util.ArrayList;

class RoomMaker {
Monster allMonsters = new Monster();
protected ArrayList<Monster> monsters = allMonsters.getList1();
protected Monster m1 = monsters.get(0);
protected Monster m2 = monsters.get(1);
protected Monster m3 = monsters.get(2);
protected Monster m4 = monsters.get(3);
protected Monster m5 = monsters.get(4);
protected Monster m6 = monsters.get(5);
protected Monster m7 = monsters.get(6);
protected Monster m8 = monsters.get(7);

Items all = new Items();
protected ArrayList<Items> item = all.getList();
 protected Items i1 = item.get(0); 
protected Items i2 = item.get(1);
protected Items i3 = item.get(2);
protected Items i4 = item.get(3);
protected Items i5 = item.get(4);
protected Items i6 = item.get(5);
protected Items i7 = item.get(6);
protected Items i8 = item.get(7);
protected Items i9 = item.get(8);
protected Items i10 = item.get(9);

Artifacts art = new Artifacts();
protected ArrayList<Artifacts> artifact = art.getList();
protected Artifacts a1 = artifact.get(0);
protected Artifacts a2;
protected Artifacts a3; //wrench
protected Artifacts a4;
protected Artifacts a5;
protected Artifacts a6;
protected Artifacts a7;
protected Artifacts a8;
protected Artifacts a9;
protected Artifacts a10;

protected Room[][] room;

	public RoomMaker()
	{
		
	}
	
    public void build(Room[][] room, final int WIDTH, final int HEIGHT, Items items
    		) {

    	// Initialize rooms (a 2D array)
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
            	this.room = room;
                room[i][j] = new Room(i, "", ""/* item? */, null /* monster */, null /* item */, null /* artifact */);
            
            }
        }
            room[0][4].setNumber(1);
            room[0][4].setName("Engine Room");
            room[0][4].setDescription("You wake up with a throbbing headache."
            		+ " Disoriented and Floating, you look around in the void and you see a dim red light. "
            		+ "As your eyes adjust to the light you see a sign that says Emergency Power. "
            		+ "Should you go for the light and push the Button?");
            room[0][4].setItems(this.i2);
            room[0][4].setMonster(this.m1);
           System.out.println(a1.getName());
//            artifact = a3.getList();
//            a3 = artifact.get(4);
//            room [0][0].setArtifact(a3);
            this.i1 = items;
            room[1][4].setNumber(2);
            room[1][4].setName("Food Storage Room");
            room[1][4].setDescription("You Stumble through the door as your body becomes re acclimated to the artificial gravity."
            		+ " You look to your right and you see a computer terminal. To your right you see a bunch of dried food goods. "
            		+ "Across the room in front of you, you see a set of double doors that has Mess Hall written above it. You See M_1. You see W_1");
            room [1][4].setMonster(m1);
//            this.monsters = m1.getList();
//            int l = 0;
//            m1 = monsters.get(l);
//            room [1][0].setMonster(m1);
//            this.monsters = this.m1.getList();
//            this.m1 = monsters.get(0);
//            room [1][0].setMonster(this.m1);

            room[2][4].setNumber(3);
            room[2][4].setName("Mess Hall");
            room[2][4].setDescription("You step into the mess hall and see a trashed room."
            		+ " There are tables and chairs flipped and rotting food littering the ground. "
            		+ "To your right you See the kitchen. Across the room you see another set of double doors that is Labeled Barracks.");
        
            room[2][3].setNumber(4);
            room[2][3].setName("Kitchen");
            room[2][3].setDescription("Your step into the Kitchen. The Floors are covered with pots and pans."
            		+ " You see No other Exits in the room. You Do see M_2. You See W_2");
            
            room[3][4].setNumber(5);
            room[3][4].setName("Barracks Hall 1");
            room[3][4].setDescription("You Stare down the long Empty Barracks Hall. "
            		+ "You see a Stairwell to your north and a wall to the south, to the east you see more hallway");
           
            room[4][4].setNumber(6);
            room[4][4].setName("Barracks Hall 2");
            room[4][4].setDescription("You Stare down the long Empty Barracks Hall. "
            		+ "You see Barracks 1 to the north and Barracks 2 to the south, to the east you see more hallway");
            
            room[5][4].setNumber(7);
            room[5][4].setName("Barracks Hall 3");
            room[5][4].setDescription("You Stare down the long Empty Barracks Hall. "
            		+ "You see the Captain's room to the north and the Officer's room to the south,  Barracks 1, to the east you see more hallway");
            
            room[5][3].setNumber(8);
            room[5][3].setName("Captains Room");
            room[5][3].setDescription("You Walk into the captain’s room and you are confronted by M_2. ");
            
            room[5][5].setNumber(9);
            room[5][5].setName("Officers Room");
            room[5][5].setDescription("You walk into the officer's room. It is quiet and you don’t observe anything.");
            
            room[4][3].setNumber(10);
            room[4][3].setName("Barracks 1");
            room[4][3].setDescription("To walk into Barak 1. The room is filled with Bunk Beds. A M_1 attacks you. "
            		+ "There are no items in this room.");
            
            room[4][5].setNumber(11);
            room[4][5].setName("Barracks 2");
            room[4][5].setDescription("To walk into Barak 2. The room is filled with Bunk Beds. A M_1 attacks you. "
            		+ "There are no items in this room.");
            
            room[3][5].setNumber(12);
            room[3][5].setName("Stairs 1");
            room[3][5].setDescription("You Walk into the Stairs from Barracks Hall and at the top of the Stairs is a door labeled ForeBay.");
            
//            room[0][4].setNumber(13);
//            room[0][4].setName("Stairs 2");
//            room[0][4].setDescription("You Walk into the Stairs from Aftbay and at the top of the Stairs is a door labeled Botany.");
            
            room[0][8].setNumber(14);
            room[0][8].setName("Brig");
            room[0][8].setDescription("You walk into the brig and you are immediately attacked by M_1.");
//            monsters = m1.getList();
//            m1 = monsters.get(0);
//            room [0][4].setMonster(m1);
            
            room[1][8].setNumber(15);
            room[1][8].setName("Aft Bay");
            room[1][8].setDescription("The room is a huge empty Room. "
            		+ "There is a huge hole in the Side of the ship and you are exposed to the Cruel Vacuums of space. "
            		+ "M_6 guards the Door Labeled Stairs");
//            monsters = m6.getList();
//            m6 = monsters.get(5);
//            room [1][4].setMonster(m6);
            
            room[2][7].setNumber(16);
            room[2][7].setName("Storage Bay");
            room[2][7].setDescription("You walk into the storage bay and see Nothing of Worth. "
            		+ "It is just a room Filled with what looks like Mining supplies.");
            
            room[2][7].setNumber(17);
            room[2][7].setName("Floor Level Airlock");
            room[2][7].setDescription("You Walk into the Floor Level Airlock and Hear it seal behind you stabilizing the environment around you. "
            		+ "You look out the door labeled ForeBay has a green light on it."
            		+ " Then you look at the door labeled Aft Bay and it is clearly marked with a red light. "
            		+ "You should probably have a Space Suit before you enter. ");
            
            room[3][8].setNumber(18);
            room[3][8].setName("Fore Bay");
            room[3][8].setDescription("You Walk into a huge Bay with pallets littering the floor space you see the Stairs behind you, "
            		+ "The infirmary to you Left, and the floor level airlock and Storage to your right.");
            
//            room[1][1].setNumber(19);
//            room[1][1].setName("Elevator");
//            room[1][1].setDescription("You walk in and see 2 buttons floor level and Bridge. There is a card key that is requested to swipe first.");
            
            room[4][8].setNumber(20);
            room[4][8].setName("Med Hallway");
            room[4][8].setDescription("You Stare down the long Empty Med Halls. "
            		+ "You see the Infirmary to the north and the Lab to your right is an elevator, but it seems you need a key card to access it.");
            
            room[4][9].setNumber(21);
            room[4][9].setName("Infirmary");
            room[4][9].setDescription("You walk into the infirmary and see charts and paper work thrown everywhere. "
            		+ "At the rear of the Room you see a storage closet. To the right you see a door lobbed Lab. ");
            
            room[4][10].setNumber(22);
            room[4][10].setName("Infirmary Closet");
            room[4][10].setDescription("You walk into the small Room and see a W_5 laying on the table before you. Do you pick it up?");
            
            room[4][7].setNumber(23);
            room[4][7].setName("Lab");
            room[4][7].setDescription("You walk into the lab and you see a closet on the other side of the room. "
            		+ "As you are scanning the room a M_1 Attacks you out of nowhere.");
            
            room[4][6].setNumber(24);
            room[4][6].setName("Lab Closet");
            room[4][6].setDescription("In the Small Room you see lab supplies and a Spacesuit laid out before you.");
            
            room[0][13].setNumber(25);
            room[0][13].setName("Botany");
            room[0][13].setDescription("As you enter the botany room you feel at home with the smell of earth around you."
            		+ "The feeling is brought to a quick halt when an M_5 approaches you.");
            
            room[0][12].setNumber(26);
            room[0][12].setName("Botany Closet");
            room[0][12].setDescription("You enter the Small closet and you see an I_3.");
            
            room[1][13].setNumber(27);
            room[1][13].setName("Aft Bay Bridge");
            room[1][13].setDescription("You step onto a narrow catwalk with a door labeled botany on side and airlock on the opposite."
            		+ " You look down and recognize the aft bay that you have already been through.");
            
            room[2][13].setNumber(28);
            room[2][13].setName("Bridge Level Airlock");
            room[2][13].setDescription("You walk into the Bridge airlock and see an M_7. You can't use that door Until you Remove him. ");
//            monsters = m7.getList();
//            m7 = monsters.get(6);
//            room [2][9].setMonster(m7);
            
            room[2][12].setNumber(29);
            room[2][12].setName("Water Treatment");
            room[2][12].setDescription("You walk into the water treatment plant and see a tool bench. On the tool bench you see A W_4."
            		+ " You Might be able to use this to get rid of M_7");
            
            room[3][13].setNumber(30);
            room[3][13].setName("Fore Bay Bridge");
            room[3][13].setDescription("You step onto a narrow catwalk with a door labeled Weapons Room on side and airlock on the opposite."
            		+ " You look down and recognize the Fore bay that you have already been through.");
            
            room[4][13].setNumber(31);
            room[4][13].setName("Weapons Room");
            room[4][13].setDescription("You walk into the Weapons Room and you See some W_5 to your Right you see a room marked Server Room.");
            
            room[4][12].setNumber(32);
            room[4][12].setName("Server Room");
            room[4][12].setDescription("You enter the Server room. You are immediately attacked by M_6. ");
            
            room[4][11].setNumber(33);
            room[4][11].setName("Server Room Closet");
            room[4][11].setDescription("In the Small Room you see I_9. You could probably use this in the Elevator.");
            
            room[4][14].setNumber(34);
            room[4][14].setName("The Bridge");
            room[4][14].setDescription("You are Confronted by B_1");
        }

        
        
    

    public void print(Room[][] room, int x, int y) {
    	this.room = room;
        System.out.println(room[x][y].getDescription());
        System.out.println("You see: " + room[x][y].getItems() + "and you also see"  +  room[x][y].getMonster() );
        System.out.println();
    }

    // Remove item from room when added to inventory
    public static void removeItem(Room[][] room, int x, int y, Items item) {
    	
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