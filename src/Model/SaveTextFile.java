package Model;
import java.io.PrintWriter;
import java.io.File;

public class SaveTextFile (){
	public void saveGame(Player player){
	
		File file = new File("C:/Users/Desktop/AvengersGame/SaveFile.txt");
	    PrintWriter printWriter = new PrintWriter("SaveFile.txt");
		printWriter.println(player.getHealth());
		printWriter.println(player.getCurrentScore());
		printWriter.println(player.getCurrentWeapon());
		printWriter.println(player.CurrentArmor());
		printWriter.println(player.getRoom());
		
		printWriter.close();
		
	}



