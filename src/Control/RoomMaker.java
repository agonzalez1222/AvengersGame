package Control;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Random;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.Serializable;
import Model.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Scanner;


public class RoomMaker {
		
		protected final int WIDTH = 40;
		protected final int HEIGHT = 40;
		public Monster monster = new Monster();
		public Artifacts artifact;
		public boolean isAlive;
		public static int aliveCounter = 0;
		protected Room[][] room = new Room[40][40];
		protected Player p1 = new Player();
		protected static int x = 0;
		protected static int y = 4;
		protected int z = 0;
		protected Items itemMaker;
		protected static int checkCounter = 0;
	
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
		Artifacts emptyArt = new Artifacts("", "", 0, 0, 0);
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
		Items i6 = new Items("I6", "Mixed Herbs", "A combination of a green and red herb. Restores a good amount of health.",  "Replenishes Health by 30", 30, 0, false);			
		Items i10 = new Items("I10", "Captain's Key Card", "A Card Key the captain used to enter special areas of the ship.",  "", 0, 0, true);
		Items i7 = new Items("I7", "Flashlight", "", "", 0, 0, true);
		Items i8 = new Items("I8", "Lab Paper", "A piece of paper found in the pocket of a lab coat. There's something written on it...",  "", 0, 0, true);
		Items i9 = new Items("I9", "Cryo-Canister", "A container that instantly freezes an area once thrown. Can be used to slow down enemies.",  "Causes a monster to skip it's turn once per use.", 0, 0, false);
		Items emptyitem = new Items("", "empty", "", "", 0, 0, false);	
		ArrayList<Items> makerItemsArray = new ArrayList<>();
		ArrayList<Artifacts> makerArtArray = new ArrayList<>();
		
		
		
		

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
				print(room,x,y,monster);
			}
			if(ui.equalsIgnoreCase("Save") || ui.equalsIgnoreCase("save game"))
			{
				Game.saveGame();
			}
			
			return ui;
		}
		
		public void createArrayList()
		{
			makerItemsArray.add(i1);
			makerItemsArray.add(i2);
			makerItemsArray.add(i3);
			makerItemsArray.add(i4);
			makerItemsArray.add(i5);
			makerItemsArray.add(i6);
			makerItemsArray.add(i7);
			makerItemsArray.add(i8);
			makerItemsArray.add(i9);
		}
		
	
    public void build() {
    	
    	
    	// Initialize rooms (a 2D array)
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 40 ; j++) {
            	//System.out.println(i + " " + j);
               
            	room[i][j] = new Room(i, "", ""/* item? */, null /* monster */, null /* item */, null /* artifact */);
               //System.out.println("fudge");
               
            
            }
        }
        
        room[0][4].setNumber(1);
   		room[0][4].setName("Engine Room");
   		room[0][4].setDescription("You wake up with a throbbing headache."
   				+ " \nDisoriented and Floating, you look around in the void and you see a dim red light. "
       			+ "\nAs your eyes adjust to the light you see a sign that says Emergency Power. "
       			+ "\nYou could probably find a power switch if you had a light source.");
   		room[0][4].setArtifact(w3);
  		room[0][4].setItems(i7);
   		
  		 room[0][5].setNumber(35);
    	 room[0][5].setName("wall");
    	 room[0][5].setDescription("");
    		
   		room[1][4].setNumber(2);
   		room[1][4].setName("Food Storage Room");
   		room[1][4].setDescription("You Stumble through the door as your body becomes re acclimated to the artificial gravity."
   				+ " \nYou look to your right and you see a computer terminal. To your right you see a bunch of dried food goods. "
   				+ "\nAcross the room in front of you, you see a set of double doors that has Mess Hall written above it.");
   		room[1][4].setMonster(m1);
   		room[1][4].setArtifact(w2);
   		
   	
   		room[2][4].setNumber(3);
   		room[2][4].setName("Mess Hall");
   		room[2][4].setDescription("You step into the mess hall and see a trashed room."
       		+ "\nThere are tables and chairs flipped and rotting food littering the ground. "
       		+ "\nTo your right you See the kitchen. Across the room you see another set of double doors that is Labeled Barracks.");
   	
   	
   		room[2][3].setNumber(4);
   		room[2][3].setName("Kitchen");
   		room[2][3].setDescription("Your step into the Kitchen. The Floors are covered with pots and pans.");
   	
   	
   		room[2][3].setMonster(m2);
   		room[2][3].setArtifact(w2);
   	
   	
   		room[3][4].setNumber(5);
   		room[3][4].setName("Barracks Hall 1");
   		room[3][4].setDescription("You Stare down the long Empty Barracks Hall. "
       		+ "\nYou see a Stairwell to your north and a wall to the south, to the east you see more hallway");
   	
   	
   		room[4][4].setNumber(6);
   		room[4][4].setName("Barracks Hall 2");
   		room[4][4].setDescription("You Stare down the long Empty Barracks Hall. "
       		+ "\nYou see Barracks 1 to the north and Barracks 2 to the south, to the east you see more hallway");
   	
   	
   		room[5][4].setNumber(7);
   		room[5][4].setName("Barracks Hall 3");
   		room[5][4].setDescription("You Stare down the long Empty Barracks Hall. "
       		+ "\nYou see the Captain's room to the south and the Officer's room to the north,  Barracks 1, to the east you see more hallway");
   	
   	
   		room[5][3].setNumber(8);
   		room[5][3].setName("Captains Room");
   		room[5][3].setDescription("You Walk into the captain’s room. ");
   		//room[5][3].setMonster(m2);
   		room[5][3].setItems(i10);
   	
   	
   		room[5][5].setNumber(9);
   		room[5][5].setName("Officers Room");
   		room[5][5].setDescription("You walk into the officer's room. It is quiet and you don’t observe anything.");
   		
   	
   	
   		room[3][3].setNumber(10);
       	room[3][3].setName("Barracks 1");
       	room[3][3].setDescription("To walk into Barak 1. The room is filled with Bunk Beds."
       		+ "\nThere are no items in this room.");
       	room[3][3].setMonster(m1);
   	
   	
   		room[4][5].setNumber(11);
       	room[4][5].setName("Barracks 2");
       	room[4][5].setDescription("To walk into Barak 2. The room is filled with Bunk Beds."
       		+ "\nThere are no items in this room.");
       	room[4][5].setMonster(m1);
   	
   	
   		room[3][5].setNumber(12);
       	room[3][5].setName("Stairwell entrance");
       	room[3][5].setDescription("You Walk up to a door that leads up to the stairwell.");
   	
       room[3][6].setNumber(13);
       room[3][6].setName("Stairwell");
       room[3][6].setDescription("You Walk up the stairs and you hear a noise in the distance.");
       
       room[3][7].setNumber(36);
       room[3][7].setName("Stairwell 2");
       room[3][7].setDescription("You Walk up the stairs and you hear a noise in the distance.");
       
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
      
//       room[1][1].setNumber(19);
//       room[1][1].setName("Elevator");
//       room[1][1].setDescription("You walk in and see 2 buttons floor level and Bridge. There is a card key that is requested to swipe first.");
       
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

    public void startGame(){
	 	
	 	Scanner input = new Scanner(System.in);
	 	String ui = input.nextLine();
	 	
		if(ui.equalsIgnoreCase("start") || ui.equalsIgnoreCase("start game")){
	   
	    	
	    	
	    	try
	    	{
	    		
	    		
	        	build();
	        	
	            
	            
	            //build();
	            System.out.println();
	            print(room, getX(), getY(), monster);
	            
	            movePlayer();
	            
	            print(room ,getX(), getY(), monster);
	    		
	    		
	    		
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
    
    public void progress()
    {
    	//build();
    	try
    	{
        System.out.println();
        print(room, getX(), getY(), monster);
        
        movePlayer();
        
        print(room ,getX(), getY(), monster);
		
    	}
    	catch(IOException e)
    	{
    		e.getMessage();
    	}
    }
	
	public boolean hasMonster()
    {
    	boolean maybe;
    	if(room[x][y].getMonster(monster) != null)
    	{
    		maybe = true;
    		return maybe; 
    	}
    	else
    	{
    		maybe = false;
    		return maybe;
    	}
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
					p1.health = p1.health + 30;
					System.out.print("Your new health is : " + p1.health);
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
					p1.health = p1.health + 15;
					System.out.println("Your new health is : " + p1.health);
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
		System.out.println(p1.getInvItems());
		p1.invItems.add(Items.getItems(0));

		p1.currentWeapon = w1;
		p1.currentArmor = w8;
		p1.invItems = new ArrayList<>();

	}
        
//    public boolean ifMonsterExists()
//    {
//    	String hi = room[0][4].getMonster();
//    	if(hi.isEmpty() && hi == null)
//    	{
//    		return false;
//    	}
//    	else return true;
//    	
//    }

    
    	
    	
    

   
    public void print(Room[][] room, int x, int y, Monster monster) {
    	this.room = room;
    	this.monster = monster;
        System.out.println(room[x][y].getDescription());
        System.out.println(room[x][y].getName());
        itemMaker = room[x][y].getItemRef(itemMaker);
        String a = room[x][y].getItems();
        String a1 = "You see : ";
        String a2 = " | ";
        String a3 = " Pickup item (p)";
        monster = room[x][y].getMonster(monster);
        String b = room[x][y].getMonsterName();
        String b1 = " Has Appeared | ";
        artifact = room[x][y].getArt(artifact);
        String c = room[x][y].getArtifact();
        String c1 = "You See: ";
        String c2 = " Pickup Weapon (q)";
        String m = "";
        
        
        if (a == null || a == "empty"){
        	a = "";
        	a1 = "";
        	a2 = "";
        	a3 = "";
        }
        
        if (b == null){
        	b = "";
        	b1 = "";
        }
        if (c == null || c == ""){
        	c = "";
        	c1 = "";
        	c2 = "";
        }
        
        if (a == "" && a1 == "" && b == "" && b1 == "" && c == "" && c1 == "" ){
        	m = "There's nothing too see here";
        }
        
        System.out.println(a1 + a + a3 + a2 + b + b1 +  c1  +  c + c2 + m);
        
        System.out.println("Your Coordinates are: ("+ x + "," + y + ")");
     //   System.out.println(monsterExists(m1));
        
        if(b.equals(room[x][y].getMonsterName())){
        	System.out.println(b);
    		fightSequence();
    	}
    	
        
        // This counter is to check for monster in room -1 mean no monster 1 means monster exists.
       // System.out.println(aliveCounter);
     //   this.x = x;
      //  this.y = y;
    }
    
    public void incrementMonster()
    {
    	if(hasMonster() == true){
    		aliveCounter ++;
    	}
    }
    
    public void decrementMonster()
    {
    	if (hasMonster() == false)
    	{
    		aliveCounter --;
    	}
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
    
    //Removes monster if dead
    public void removeMonster(Room[][] room, int x, int y, Monster monster){
    	if (monster.isAlive() == false)
    	room[x][y].deleteMonster(monster);
    }
   
    private boolean roomExists( int x, int y) {
		if(x >= 0 && y >= 0 )
		{
			return true;
		}
		else {
			return false;
		}
	 // return true;
    
}
    private boolean roomDoesntExist (int x, int y){
    	if(x == 5 && y == 7|| x == 2 && y == 6 ||x == 4 && y == 3||x == 1 && y == 3|| x == 2 && y == 2 || x ==0 && y ==5 || x ==0 && y == 3 || x ==1 && y == 3 || x == 1 && y == 5 || x == 2 && y == 5 || x == 3 && y == 2 || x == 4 && y == 2 || x == 4 && y == 6 || x == 5 && y == 6 || x == 6 && y == 5 || x == 6 && y == 4 || x == 6 && y == 3 || x == 5 && y == 2)
    	{
    		return false;
    	}
    	else{
    		return true;
    	}
    }
    private boolean checkcount (){
    	if (checkCounter == 0 ){
    		return false;
    	}
    	else {
    		return true;
    	}
    }
    
    public  void movePlayer() throws IOException {
    	
        while(!p1.isFighting())
        {
      boolean northPossible = roomExists(x, y + 1) && roomDoesntExist(x , y +1);
      boolean southPossible = roomExists(x, y - 1) && roomDoesntExist(x , y -1);
      boolean eastPossible = roomExists(x + 1, y)  && roomDoesntExist(x+1 , y ) && checkcount();
      boolean westPossible = roomExists( x - 1, y) && roomDoesntExist(x - 1 , y);
      
      
      
      	System.out.println("Type help or menu for assistance. | Type (i) to view inventory. | Type (map) to view map. | Type (score) to view current score. "); 
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
     //   System.out.print(" Pickup item (p)");
        
        System.out.print(" ? ");
        Scanner input = new Scanner(System.in);
        String direction = input.nextLine();
        if (direction.equalsIgnoreCase("n") && northPossible) {
            y++;
            Player.currentScore -= 10;
        } else if (direction.equalsIgnoreCase("s") && southPossible) {
           y--;
           Player.currentScore -= 10;
        } else if (direction.equalsIgnoreCase("e") && eastPossible) {
            x++;
            Player.currentScore -= 10;
        } else if (direction.equalsIgnoreCase("w") && westPossible) {
             x--;
             Player.currentScore -= 10;
        } else if (direction.equalsIgnoreCase("menu") || direction.equalsIgnoreCase("help") ) {
            Game.openHelp();
            
        } else if (direction.equalsIgnoreCase("map")) {
       	 MapView.ViewMap();
        } else if (direction.equalsIgnoreCase("score")) {
        	viewScore();
        } else if (direction.equalsIgnoreCase("p")){
        	pickUpItem();
        	room[0][4].setItems(emptyitem);
        	room[5][3].setItems(emptyitem);
        	checkCounter ++;
        	room[0][4].setDescription("You Turn on the flashlight and now you can see the button, You press the button."
        			+ "\nYou shield your eyes as you hear a slight hum from the backup Generator."
        			+ "\n You see Massive reactor engines.");
        	//System.out.println(makerItemsArray.get(0).getName());
        }
        	else if(direction.equalsIgnoreCase("q"))
        	{
        		pickUpArt();
        		room[0][4].setArtifact(emptyArt);
        	
        	} 
        
        	else if (direction.equalsIgnoreCase("i")){
//        	System.out.println(makerItemsArray.get(0).getName());
//        	System.out.println(makerItemsArray.get(1).getName());
        	for(int i = 0; i < makerItemsArray.size(); i++)
        	{
        		System.out.println("Your Inventory Contains: \n" + makerItemsArray.get(i).getName() + "\n" + makerArtArray.get(i).getName() );
        	}
        	
        }
        
        else
        {
        	System.out.println("You Hit A Wall!");
        }
       // currentRoom = getRoom(x, y);
      // currentRoom.enter(player);
//        System.out.println(x);
//        System.out.println(y);
        progress();
        //build();
        //input.close();
        }
      
    }
  
    
    public void viewScore(){
    	System.out.println();
    	System.out.println("Your current score is: " + Player.currentScore);
    }
    
    public void fightSequence() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What would you like to do? \nAttack, Run, or Use Item?");
		String userInput = input.nextLine();
		while (p1.isAlive() && monster.isAlive()) {
		if(userInput.equalsIgnoreCase("Attack"))
		{
			System.out.println(monster.getHealth());
			System.out.println("You have chosen to attack: " + "for " + (damageMonster()) + " damage");
				if (monster.isAlive() == true) {
					System.out.println("The monster strikes you back and deals " + damagePlayer(monster) + " damage");
					
					fightSequence();
				}
				
				if (p1.isAlive() == false) {
					System.out.println("You Died.");
					
					Game.intro();
					Game.titleMenu();
					startGame();
				}
				} if (!monster.isAlive()) {
					System.out.println(room[x][y].getMonsterName() + " has been slain.");
					
					try
					{
					movePlayer();
					}
					catch(IOException e)
					{
						e.getMessage();
					}
				}
				break;
		}
		
		if(userInput.equalsIgnoreCase("Run"))
		{
			//p1.escapeRoll();
//			if (p1.escapeRoll() > 5) {
				System.out.println("You managed to escape.");
				// Add code to exit the fight here.
				try
				{
				movePlayer();
				}
				catch(IOException e)
				{
					e.getMessage();
				}
			//}
		}
		
		if(userInput.equalsIgnoreCase("Use Item"))
		{
			createArrayList();
			
			
		}
		else {	
			System.out.println("That action was not recognized, please try to enter another option");
			if(!monster.isAlive())
			{
				try
				{
				movePlayer();
				}
				catch(IOException e)
				{
					e.getMessage();
				}
				
			}
			else
			{
				fightSequence();
			}
		}
		
		if (p1.getHealth() < 0) {
			System.out.println("You died.");
			// System.exit(0);
		} else if (monster.getHealth() < 0) {
			System.out.println("You have slain: " + monster.getName());
			
		}
		
		System.out.println("Hi");
		}
    
    public void pickUpItem()
    {
    	System.out.println("You picked up: " + room[0][4].getItems());
    	
    	
    	if (room[0][4].getName().equalsIgnoreCase("Engine Room")){
    		makerItemsArray.add(room[0][4].getItemRef(i7));
    	}
    }
    	public void pickUpArt()
        {
        	System.out.println("You picked up: " + room[0][4].getArtifact());
        	
        	
        	if (room[0][4].getName().equalsIgnoreCase("Engine Room")){
        		makerArtArray.add(room[0][4].getArt(w3));
        	}
//    	if (room[5][3].getName().equalsIgnoreCase("Captains Room")){
//    		makerItemsArray.add(room[5][3].getItemRef(i10));
//    	}
    	//System.out.println(makerItemsArray.get(0).getName());
    	
    }
		 
    
    protected int damagePlayer(Monster monster) {
		int monsterAtk = (int)(Math.random() * 5 + 1);
		int health = p1.getHealth();
		health = health - monsterAtk;
		int damage = p1.getDef() - monsterAtk;
		if (damage < 0) {
			damage = 0;
			p1.setHealth(health);	
		}
		p1.setHealth(health);
		return damage;
	}
    
    protected int damageMonster() {
    	int playerAtk = p1.getAtk();
		int mHealth = monster.getHealth();
		mHealth = mHealth - playerAtk;
		monster.setHealth(mHealth);
		int damage = playerAtk;
		return damage;
	}

    public void battle()
    {
    	while(p1.isAlive() && monster.isAlive())
    	{
    		if(aliveCounter >= 0)
    		{
    			fightSequence();
    		}
    		else
    		{
    			System.out.println("error");
    		}
    	}
    }
    
}

