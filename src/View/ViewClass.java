package View;
import Control.RoomMaker;
import Model.Game;
import Model.GameTester;
import Model.Items;
import Model.Player;
import Model.Room;

import java.io.*;
/**
 * Class: View Class
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

public class ViewClass {
	
	public static void main(String[] args) 
	{
//		RoomMaker rm = new RoomMaker();
//		try {
//			rm.getInput();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	 	Game.intro();
	      /*  JFrame f = new JFrame("Game Map");
	             
	        f.addWindowListener(new WindowAdapter(){
	                public void windowClosing(WindowEvent e) {
	                    System.exit(0);
	                }
	            });
	 
	        f.add(new GameTester());
	        f.pack();
	        f.setVisible(true);
	    }
	    */
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
}
