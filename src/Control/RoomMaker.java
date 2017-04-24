package Control;
import Model.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Scanner;

//import java.util.HashMap;
//import java.util.Map;
//import java.util.Random;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.Serializable;
import Model.Room;
import Model.Artifacts;
import Model.Items;
import Model.Monster;
import Model.Player;
import Model.GameTester;


public class RoomMaker {
		
		public Player player;
		protected final int WIDTH = 40;
		protected final int HEIGHT = 40;
	
		// Monsters
		Monster m1 = new Monster(10, (int)(Math.random() * 5 + 1), 0, "Insane Crew Person", "Crew member driven insane by the otherworldly happenings on the ship. It's as if they have seen the other side and come back changed. Their eyes...their eyes are so crazed. So....hollow...", false);
		Monster m2 = new Monster(15, (int)(Math.random() * 4 + 5), 0, "Cultist", "Member of a mysterious cult bent on bringing a Great Old One into this plane of existence. They seem to be constantly mumbling something. The words can almost be heard, but before one can understand, they disappear from the brain as if they were never there.", false);
		Monster m3 = new Monster(15, (int)(Math.random() * 7 + 4), 0, "Gug", "They possess arms that split into multiple forearms that end in razor-sharp talons and a terrifying mouth that opens vertically. They chitter about looking for food. They wouldn't be out of place in a sewer and the horrendous stench confirms that. So strong the stench, one almost forgets where...or even who...they are.", false);
		Monster m4 = new Monster(25, (int)(Math.random() * 5 + 9), 0, "Ghast", "A creature without a nose or forehead. It hops around looking for Gugs to eat on its hooved kangaroo-like legs, but will settle for anything meaty when necessary. The sounds it belches forth...the sounds burn into one's soul and will likely never leave, haunting one in this life and the next.", false);
		Monster m5 = new Monster(35, (int)(Math.random() * 3 + 11), 0, "Mi-go", "It seems to be made of an unknown substance resembling a fungus and has huge lobster claws and bat wings. What one assumes to be its mouth drips with a beautiful, pinkish substance. So lovely this substance.....it draws one to it. One just wants to touch it. Feel it. Swim in its beauty....", false);
		Monster m6 = new Monster(40, (int)(Math.random() * 6 + 10), 0, "Elder Thing", "A large starfish, with eyes and a mouth, sits atop a cylindrical mass of tentacles. Crab-like claws protrude hideous gaping maws that dot the writhing mass. One can hear it in their mind, speaking, praying, to some greater entity. Or maybe one is just going crazy. Yes...that must be it.", false);
		Monster m7 = new Monster(60, 20, 0, "Shoggoth", "Always shifting and changing. One’s eyes cannot seem to focus on anything but the multitudes of inky, black eyes covering it. They seem so deep and transfixing. Like they contain all the secrets of all the worlds. One could lose themselves in those eyes if not careful.", false);
		Monster boss = new Monster(100, 30, 0, "Great Old One", "A horrifying, giant, three-eyed slug with metallic spines protruding from its slimy back and pyramid-shaped feet that scrape and screech against the metallic floor.", true);
		
		// Artifacts
		Artifacts w1 = new Artifacts("None", "You need to hurry and find a weapon", 1, 0, 0);
		Artifacts w2 = new Artifacts("Pipe", "A piece of piping. You're not sure what it belongs to, but it can't be too important.", 2, 1000, 0);
		Artifacts w3 = new Artifacts("Knife", "A knife found in the Galley. Slightly dull from frequent use.", 6, 1000, 0);
		Artifacts w4 = new Artifacts("Wrentch", "A standard wrench. Used for maintaining equipment on the ship." , 8, 1000, 0);
		Artifacts w5 = new Artifacts("Plasma Saw", "A small, handheld saw for maintenance on the ship. More of a tool than a weapon." ,13, 1000, 0);
		Artifacts w6 = new Artifacts("Gas Torch", "A gas torch used for ship maintenance. It has a limited amount of fuel." ,20, 100, 0);
		Artifacts w7 = new Artifacts("Plasma Pistol", "A small firearm used for self-defense. Can hold 12 plasma rounds.", 35, 12, 0);
		Artifacts w8 = new Artifacts("Civilian Shirt", "A standard civilian's shirt. Comfortable but not very protective." , 0, 1, 5);
		Artifacts w9 = new Artifacts("Space Suit", "A space suit that allows the user to exist in the vacuum of space. Well insulated but not great against slashing or piercing damage." ,0, 1, 15);
		Artifacts w10 = new Artifacts("ASM4 Series Gaurd Armor", "Armor that protects the user from extraterrestrial threats and medium gunfire" ,0, 1, 20);
		
		//Items
		Items i1 = new Items("I1", "MedKit", "A standard first aid kit for treating minor wounds", "Replenish Health by 20", 20, 0, false);
		Items i2 = new Items("I2", "Gas Canister", "A refill canister for a gas torch. Highly flammable", "Increases gas torch ammo by 50%", 0, 50, false);
		Items i3 = new Items("I3", "Plasma Rounds", "Ammunition for a plasma pistol", "Increase plasma pistol ammo by 6", 0, 6, false);
		Items i4 = new Items("I4", "Green Herb", "An edible herb found in the greenhouse. Eat it to restore health.",  "Replenishes Health by 15", 15, 0, false);
		Items i5 = new Items("I5", "Red Herb", "A vibrant red herb. It's inedible. Perhaps it has some other use?",  "Can be combine with green herb", 0, 0, false);
		Items i6 = new Items("I6", "Mixed Herbs", "A combination of a green and red herb. Restores a good amount of health.",  "Replenishes Health by 30", 30, 0, false);			Items captainKey = new Items("I7", "Captain's Key Card", "A Card Key the captain used to enter special areas of the ship.",  "", 0, 0, true);
		Items i7 = new Items("I8", "Flashlight", "", "", 0, 0, true);
		Items i8 = new Items("I9", "Lab Paper", "A piece of paper found in the pocket of a lab coat. There's something written on it...",  "", 0, 0, true);
		Items i9 = new Items("I10", "Cryo-Canister", "A container that instantly freezes an area once thrown. Can be used to slow down enemies.",  "Causes a monster to skip it's turn once per use.", 0, 0, false);
			
		
//protected ArrayList<Artifacts> artifact = new ArrayList<Artifacts>();
//protected Artifacts w1 = artifact.get(0);
//protected Artifacts w2 = artifact.get(1);
//protected Artifacts w3 = artifact.get(2);
//protected Artifacts w4 = artifact.get(3);
//protected Artifacts w5 = artifact.get(4);
//protected Artifacts w6 = artifact.get(5);
//protected Artifacts w7 = artifact.get(6);
//protected Artifacts w8 = artifact.get(7);
//protected Artifacts w9 = artifact.get(8);
//protected Artifacts w10 = artifact.get(9);

protected Room[][] room;
protected Player p1 = new Player();
protected static int x = 0;
protected static int y = 4;
protected int z = 0;
	public RoomMaker()
	{
		 
	}
		Scanner input = new Scanner(System.in);
		public String getInput() throws IOException
		{
			Game.titleMenu();
			//build(room, WIDTH, HEIGHT);
			String ui = input.nextLine();
			System.out.println();
			
			if(ui.equalsIgnoreCase("help") || ui.equalsIgnoreCase("help menu"))
			{
				Game.openHelp();
			}
			if(ui.equalsIgnoreCase("start") || ui.equalsIgnoreCase("start game"))
			{
				Game.gameStartText();
				print(room,x,y);
			}
			if(ui.equalsIgnoreCase("Save") || ui.equalsIgnoreCase("save game"))
			{
				Game.saveGame();
			}
			
			return ui;
		}
		
		public static void startGame(){
		 	
		 	Scanner input = new Scanner(System.in);
		 	String ui = input.nextLine();

			if(ui.equalsIgnoreCase("start") || ui.equalsIgnoreCase("help menu")){
		    //when map is typed it displays it 
		    	Items test = new Items();
			//	Items test1 = new Items();
		    	
		    	Player p1 = new Player();
		    	try
		    	{
		    		
		        	RoomMaker bs = new RoomMaker();
		        	final int WIDTH = 40;
		            final int HEIGHT = 40;
		            Room[][] room = new Room[WIDTH][HEIGHT];
		            bs.build(room, WIDTH, HEIGHT);
		            System.out.println();
		            bs.print(room, bs.getX(), bs.getY());
		            
		            bs.movePlayer(p1);
		            bs.print(room, bs.getX(), bs.getY());
		    		
		    		
		    		
		    	}
		    	catch(IOException e)
		    	{
		    		System.out.println("cant move");
		    	}
		    	
			}
			if(ui.equalsIgnoreCase("help") || ui.equalsIgnoreCase("help menu"))
			{
				Game.openHelp();
			}
			Game.titleMenu();
			startGame();
		}
	
    public void build(Room[][] room, final int WIDTH, final int HEIGHT) {

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
            room[0][4].setArtifact(w3);
            
          

            room[1][4].setNumber(2);
            room[1][4].setName("Food Storage Room");
            room[1][4].setDescription("You Stumble through the door as your body becomes re acclimated to the artificial gravity."
            		+ " You look to your right and you see a computer terminal. To your right you see a bunch of dried food goods. "
            		+ "Across the room in front of you, you see a set of double doors that has Mess Hall written above it. You See M_1. You see W_1");
            room[1][4].setMonster(m1);
            room[1][4].setArtifact(w1);


            room[2][4].setNumber(3);
            room[2][4].setName("Mess Hall");
            room[2][4].setDescription("You step into the mess hall and see a trashed room."
            		+ " There are tables and chairs flipped and rotting food littering the ground. "
            		+ "To your right you See the kitchen. Across the room you see another set of double doors that is Labeled Barracks.");
        
            room[2][3].setNumber(4);
            room[2][3].setName("Kitchen");
            room[2][3].setDescription("Your step into the Kitchen. The Floors are covered with pots and pans."
            		+ " You see No other Exits in the room. You Do see M_2. You See W_2");
            room[1][4].setMonster(m2);
            room[1][4].setArtifact(w2);
            
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
            room[5][3].setMonster(m2);
            room[5][3].setItems(i7);
            
            room[5][5].setNumber(9);
            room[5][5].setName("Officers Room");
            room[5][5].setDescription("You walk into the officer's room. It is quiet and you don’t observe anything.");
            room[5][5].setItems(i7);
            
            room[4][3].setNumber(10);
            room[4][3].setName("Barracks 1");
            room[4][3].setDescription("To walk into Barak 1. The room is filled with Bunk Beds. A M_1 attacks you. "
            		+ "There are no items in this room.");
            room[4][3].setMonster(m1);
            
            room[4][5].setNumber(11);
            room[4][5].setName("Barracks 2");
            room[4][5].setDescription("To walk into Barak 2. The room is filled with Bunk Beds. A M_1 attacks you. "
            		+ "There are no items in this room.");
            room[4][5].setMonster(m1);
            
            room[3][5].setNumber(12);
            room[3][5].setName("Stairs 1");
            room[3][5].setDescription("You Walk into the Stairs from Barracks Hall and at the top of the Stairs is a door labeled ForeBay.");
            
//            room[0][4].setNumber(13);
//            room[0][4].setName("Stairs 2");
//            room[0][4].setDescription("You Walk into the Stairs from Aftbay and at the top of the Stairs is a door labeled Botany.");
            
            room[0][8].setNumber(14);
            room[0][8].setName("Brig");
            room[0][8].setDescription("You walk into the brig and you are immediately attacked by M_1.");
            room[0][8].setMonster(m1);
            
            room[1][8].setNumber(15);
            room[1][8].setName("Aft Bay");
            room[1][8].setDescription("The room is a huge empty Room. "
            		+ "There is a huge hole in the Side of the ship and you are exposed to the Cruel Vacuums of space. "
            		+ "M_6 guards the Door Labeled Stairs");
            room[1][8].setMonster(m6);
            
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
            room[3][8].setMonster(m5);
            
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
            room[4][10].setArtifact(w5);
            
            room[4][7].setNumber(23);
            room[4][7].setName("Lab");
            room[4][7].setDescription("You walk into the lab and you see a closet on the other side of the room. "
            		+ "As you are scanning the room a M_1 Attacks you out of nowhere.");
            room[4][7].setMonster(m1);
            
            room[4][6].setNumber(24);
            room[4][6].setName("Lab Closet");
            room[4][6].setDescription("In the Small Room you see lab supplies and a Spacesuit laid out before you.");
            room[4][6].setArtifact(w7);
            
            room[0][13].setNumber(25);
            room[0][13].setName("Botany");
            room[0][13].setDescription("As you enter the botany room you feel at home with the smell of earth around you."
            		+ "The feeling is brought to a quick halt when an M_5 approaches you.");
            room[0][13].setMonster(m5);
            
            room[0][12].setNumber(26);
            room[0][12].setName("Botany Closet");
            room[0][12].setDescription("You enter the Small closet and you see an I_3.");
            room[0][12].setItems(i3);
            
            room[1][13].setNumber(27);
            room[1][13].setName("Aft Bay Bridge");
            room[1][13].setDescription("You step onto a narrow catwalk with a door labeled botany on side and airlock on the opposite."
            		+ " You look down and recognize the aft bay that you have already been through.");
            
            room[2][13].setNumber(28);
            room[2][13].setName("Bridge Level Airlock");
            room[2][13].setDescription("You walk into the Bridge airlock and see an M_7. You can't use that door Until you Remove him. ");
            room[2][13].setMonster(m7);
            
            room[2][12].setNumber(29);
            room[2][12].setName("Water Treatment");
            room[2][12].setDescription("You walk into the water treatment plant and see a tool bench. On the tool bench you see A W_4."
            		+ " You Might be able to use this to get rid of M_7");
            room[2][12].setArtifact(w4);
            
            room[3][13].setNumber(30);
            room[3][13].setName("Fore Bay Bridge");
            room[3][13].setDescription("You step onto a narrow catwalk with a door labeled Weapons Room on side and airlock on the opposite."
            		+ " You look down and recognize the Fore bay that you have already been through.");
            room[3][13].setMonster(m6);
            
            room[4][13].setNumber(31);
            room[4][13].setName("Weapons Room");
            room[4][13].setDescription("You walk into the Weapons Room and you See some W_5 to your Right you see a room marked Server Room.");
            room[4][13].setArtifact(w5);
            
            room[4][12].setNumber(32);
            room[4][12].setName("Server Room");
            room[4][12].setDescription("You enter the Server room. You are immediately attacked by M_6. ");
            room[4][12].setMonster(m6);
            
            room[4][11].setNumber(33);
            room[4][11].setName("Server Room Closet");
            room[4][11].setDescription("In the Small Room you see I_9. You could probably use this in the Elevator.");
            room[4][11].setItems(i9);
            
            room[4][14].setNumber(34);
            room[4][14].setName("The Bridge");
            room[4][14].setDescription("You are Confronted by B_1");
            room[4][14].setMonster(boss);
        }

        
    protected void combineHerbs(Items a1)
	{
		Scanner input = new Scanner(System.in);
		if(a1.getName().equalsIgnoreCase("Green Herb") || a1.getName().equalsIgnoreCase("Red Herb"))
		{
			System.out.println("Would you like to combine the green and red herbs? \nEnter Yes or No.");
			String answer = input.nextLine();
			if(answer.equalsIgnoreCase("Yes"))
			{
				System.out.println("You have combined the red and green herb. \nWould you like to use the new combined herb? Enter Yes or No.");
				String answer2 = input.nextLine();
				if(answer2.equalsIgnoreCase("Yes"))
				{
					this.player.health = this.player.health + 30;
					System.out.print("Your new health is : " + player.health);
				}
				if(answer2.equalsIgnoreCase("no"))
				{
					System.out.println("Item is now stored in your inventory.");
					System.exit(0);
				}
			}
			else
			{
				System.out.println("Would you like to use only the Green Herb? \nEnter Yes or No.");
				String answer3 = input.nextLine();
				if(answer3.equalsIgnoreCase("Yes"))
				{
					this.player.health = this.player.health + 15;
					System.out.println("Your new health is : " + player.health);
				}
				else
				{
					System.out.println("Okay, your item is back in inventory.");
					System.exit(0);
				}
			}
	
		}
		else
		{
			System.out.println("Please enter a valid item name.");
			System.exit(0);
		}
		input.close();
	}		
    
    public void useItem(Items item) {
		System.out.println("What item would you like to use?");
		System.out.println(player.getInvItems());
		player.invItems.add(Items.getItems(0));

		player.currentWeapon = w1;
		player.currentArmor = w8;
		player.invItems = new ArrayList<>();

	}
        
    

    public void print(Room[][] room, int x, int y) {
    	this.room = room;
    	
        System.out.println(room[x][y].getDescription());
        System.out.println(room[x][y].getName());
        System.out.println("You see: " + room[x][y].getItems() + " | You also see "  +  room[x][y].getMonster() + " | You also see "  +  room[x][y].getArtifact() );
        System.out.println("("+ x + "," + y + ")");
        this.x = x;
        this.y = y;
    }
    
    public int getX()
    {
    	return x;
    }
    
    public int getY()
    {
    	return y;
    }
    protected void setX(int x)
    {
    	this.x = x;
    }
    
    protected void setY(int y)
    {
    	this.y = y;
    }
    
    // Remove item from room when added to inventory
    public void removeItem(Room[][] room, int x, int y, Items item) {
    	
    	room[x][y].deleteItem(item);
    }
   
    private boolean roomExists(int x, int y) {
		if(x >= 0 && y >= 0)
		{
			return true;
		}
		else
		{
			return false;
		}
    	
		
	 // return true;
    
}
    
    public  void movePlayer(Player player) throws IOException {
        while(!player.isFighting())
        {
      boolean northPossible = roomExists(x, y + 1);
      boolean southPossible = roomExists(x, y - 1);
      boolean eastPossible = roomExists(x + 1, y);
      boolean westPossible = roomExists(x - 1, y);
        System.out.print("Where would you like to go :");
        if (northPossible) {
            System.out.print(" North (n)");
        }
       if (eastPossible) {
            System.out.print(" East (e)");
       }
        if (southPossible) {
            System.out.print(" South (s)");
        }
        if (westPossible) {
            System.out.print(" West (w)");
       }
        System.out.print(" ? ");
        Scanner input = new Scanner(System.in);
        String direction = input.nextLine();
        if (direction.equalsIgnoreCase("n") && northPossible) {
            y++;
        } else if (direction.equalsIgnoreCase("s") && southPossible) {
           y--;
        } else if (direction.equalsIgnoreCase("e") && eastPossible) {
            x++;
        } else if (direction.equalsIgnoreCase("w") && westPossible) {
             x--;
        }
        else
        {
        	System.out.println("Not recognized");
        }
       // currentRoom = getRoom(x, y);
      // currentRoom.enter(player);
        System.out.println(x);
        System.out.println(y);
        getInfo();
        //input.close();
        }
      
    }
    
    protected void getInfo()
    {
    	
    		
    		
//    		ArrayList<Items> list = test.getList();
//    		test = list.get(0);
        	RoomMaker bs = new RoomMaker();
            bs.print(room, bs.getX(), bs.getY());
            
           
    		
    		
    		
    	
    	
    }
}
