package Model;
import java.io.Serializable;
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
	private String description;
	private Boolean isPuzzleRoom;
	private Boolean isBossRoom;
	private Monster monster;
	
	
	private Room(String description, Monster monster, Boolean isPuzzleRoom, Boolean isBossRoom) {
		this.description = description;
		this.isBossRoom = isBossRoom;
		this.isPuzzleRoom = isPuzzleRoom;
		this.monster = monster;
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
	
//ArrayList<Integer> doorNumber = new ArrayList<Integer>();
//	int[] doors = new int[40];{
//	
//	doors[0] = 1;
//	doors[1] = 1;
//	doors[2] = 1;
//	doors[3] = 1;
//	
//	for (int i=0; i<doors.length; i++)
//	{
//	  System.out.println(doors[i]);
//	}
//
	
	//Magda:attempt at switch statement
	
	/* 
	 *int user =  ;
	 *
	 *switch (user){
	 *case 1;
	 *System.out.println(" ");
	 *break; 
	 * case 2;
	 * System.out.println(" ");
	 * break;
	 * case 3;
	 * System.out.println(" ");
	 * break;
	 * case 4;
	 * System.out.println(" ");
	 * break;
	 * case 5;
	 * System.out.println(" ");
	 * break;
	 * case 6;
	 * System.out.println(" ");
	 * break;
	 * case 7;
	 * System.out.println(" ");
	 * break;
	 * case 8;
	 * System.out.println(" ");
	 * break;
	 * case 9;
	 * System.out.println(" ");
	 * break;
	 * case 10;
	 * System.out.println(" ");
	 * break;
	 * case 11;
	 * System.out.println(" ");
	 * break;
	 * case 12;
	 * System.out.println(" ");
	 * break;
	 * case 13;
	 * System.out.println(" ");
	 * break;
	 * case 14;
	 * System.out.println(" ");
	 * break;
	 * case 15;
	 * System.out.println(" ");
	 * break;
	 * case 16;
	 * System.out.println(" ");
	 * break;
	 * case 17;
	 * System.out.println(" ");
	 * break;
	 * case 18;
	 * System.out.println(" ");
	 * break;
	 * case 19;
	 * System.out.println(" ");
	 * break;
	 * case 20;
	 * System.out.println(" ");
	 * break;
	 * case 21;
	 * System.out.println(" ");
	 * break;
	 * case 22;
	 * System.out.println(" ");
	 * break;
	 * case 23;
	 * System.out.println(" ");
	 * break;
	 * case 24;
	 * System.out.println(" ");
	 * break;
	 * case 25;
	 * System.out.println(" ");
	 * break;
	 * case 26;
	 * System.out.println(" ");
	 * break;
	 * case 27;
	 * System.out.println(" ");
	 * break;
	 * case 28;
	 * System.out.println(" ");
	 * break;
	 * case 29;
	 * System.out.println(" ");
	 * break;
	 * case 30;
	 * System.out.println(" ");
	 * break;
	 * case 31;
	 * System.out.println(" ");
	 * break;
	 * case 32;
	 * System.out.println(" ");
	 * break;
	 * case 33;
	 * System.out.println(" ");
	 * break;
	 * case 34;
	 * System.out.println(" ");
	 * break;
	 * case 35;
	 * System.out.println(" ");
	 * break;
	 * case 36;
	 * System.out.println(" ");
	 * break;
	 * case 37;
	 * System.out.println(" ");
	 * break;
	 * case 38;
	 * System.out.println(" ");
	 * break;
	 * case 39;
	 * System.out.println(" ");
	 * break;
	 * case 40;
	 * System.out.println(" ");
	 * break;
	 * case 41;
	 * System.out.println(" ");
	 * break;
	 * case 42;
	 * System.out.println(" ");
	 * break;
	 * case 43;
	 * System.out.println(" ");
	 * break;
	 * case 44;
	 * System.out.println(" ");
	 * break;
	 * case 45;
	 * System.out.println(" ");
	 * break;
	 * case 46;
	 * System.out.println(" ");
	 * break;
	 * case 47;
	 * System.out.println(" ");
	 * break;
	 * case 48;
	 * System.out.println(" ");
	 * break;
	 * case 49;
	 * System.out.println(" ");
	 * break;
	 * case 50;
	 * System.out.println(" ");
	 * break;
	 * case 51;
	 * System.out.println(" ");
	 * break;
	 * case 52;
	 * System.out.println(" ");
	 * break;
	 * case 53;
	 * System.out.println(" ");
	 * break;
	 * case 54;
	 * System.out.println(" ");
	 * break;
	 * case 55;
	 * System.out.println(" ");
	 * break;
	 * case 56;
	 * System.out.println(" ");
	 * break;
	 * case 57;
	 * System.out.println(" ");
	 * break;
	 * case 58;
	 * System.out.println(" ");
	 * break;
	 * case 59;
	 * System.out.println(" ");
	 * break;
	 * case 60;
	 * System.out.println(" ");
	 * break;
	 */
	 
}