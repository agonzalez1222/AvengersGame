package Model;
import java.io.Serializable;
import java.util.ArrayList;


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
	
	
}