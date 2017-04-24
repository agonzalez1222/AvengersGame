package Control;
import java.util.ArrayList;
import java.util.Scanner;
import Model.*;

import java.io.*;
/**
 * Class: Control Class
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

//public class ControlClass 
//{
//	protected static Player p1 = new Player();
//	protected static RoomMaker maker = new RoomMaker();
//	static final int WIDTH = 40;
//    static final int HEIGHT = 40;
//    static Room[][] room = new Room[WIDTH][HEIGHT];
//    static Items test = new Items();
//    static ArrayList<Items> list = test.getList();
//	test = list.get(0);
//    
//	public static Scanner input = new Scanner(System.in);
//	public static String getInput() throws IOException
//	{
//		try
//		{
//			Game.titletMenu();
//			String ui = input.nextLine();
//			System.out.println();
//			
//			if(ui.equalsIgnoreCase("help") || ui.equalsIgnoreCase("help menu"))
//			{
//				Game.openHelp();
//				maker.build(room, WIDTH, HEIGHT, items);
//			}
//			if(ui.equalsIgnoreCase("start") || ui.equalsIgnoreCase("start game"))
//			{
//				Game.gameStartText();
//				
//				
//			}
//			if(ui.equalsIgnoreCase("Save") || ui.equalsIgnoreCase("save game"))
//			{
//				Game.saveGame();
//			}
//			
//			return ui;
//		}
//		catch(IOException e)
//		{
//			System.out.println();
//			throw new IOException();
//		}
//	}
//}
