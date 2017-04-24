package Control;
import java.util.Scanner;

import Model.Game;

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

public class ControlClass 
{
	public static Scanner input = new Scanner(System.in);
	public static String getInput() throws IOException
	{
		try
		{
			String ui = input.nextLine();
			System.out.println();
			
			if(ui.equalsIgnoreCase("help"))
			{
				Game.openHelp();
			}
			
			return ui;
		}
		catch(Exception e)
		{
			System.out.println();
			throw new IOException();
		}
	}
}
