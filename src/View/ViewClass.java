package View;
import Control.RoomMaker;

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
		RoomMaker rm = new RoomMaker();
		try {
			rm.getInput();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
