package Model;
import java.util.ArrayList;
import java.io.*;
public class GameTester {

	public static void main(String[] args) throws IOException
	{
		Items test = new Items();
		ArrayList<Items> list = test.getList();
		//Items touch = list.get(3);
		test.setItems(list.get(3));
		Player p1 = new Player();
		System.out.println(p1.getHealth());
		test.useHealthRegenItem(test);
		p1.getHealth();
		System.out.println(test.getName());
		for(int i = 0; i < 6; i++)
		{
			System.out.println(test.getItems(i).getName());
		}
		
	}

}
