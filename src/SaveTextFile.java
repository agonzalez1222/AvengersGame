import java.io.PrintWriter;

import Model.Player;

import java.io.File;

public class SaveTextFile ("C:/Users/Desktop/AvengersGame/SaveFile.txt")
	public void saveGame(Player player){
	
		File file = new File("");
	    PrintWriter printWriter = new PrintWriter("SaveFile.txt");
		printWriter.println(player.getHealth());
		printWriter.println(player.getCurrentScore());
		printWriter.println(player.getCurrentWeapon());
		printWriter.println(player.CurrentArmor());
		printWriter.println(player.getRoom());
		
		printWriter.close();
		
	}


