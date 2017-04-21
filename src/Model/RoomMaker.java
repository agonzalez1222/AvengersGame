package Model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import com.sun.javafx.collections.MappingChange.Map;

public class RoomMaker {
	
		private final Map<Integer, Map<Integer, Room>> map = (Map<Integer, Map<Integer, Room>>) new HashMap<Integer, Map<Integer, Room>>();
	    private Room currentRoom;
	    private int currentX = 0;
	    private int currentY = 0;
	    
	    private RoomMaker(){
	    }
	/*    private void putRoom(int x, int y, Room room) {
	        if (!map.containsKey(x)) {
	            map.put(x, new HashMap<Integer, Room>());
	        }
	        map.get(x).put(y, room);
	    }

	    private Room getRoom(int x, int y) {
	        return map.get(x).get(y);
	    }

	    private boolean roomExists(int x, int y) {
	        if (!map.containsKey(x)) {
	            return false;
	        }
	        return map.get(x).containsKey(y);
	    }

	    private boolean isComplete() {
	        return currentRoom.isBossRoom() && currentRoom.isComplete();
	    }

*/
}