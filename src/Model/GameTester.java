package Model;
import java.util.ArrayList;
import java.io.*;
public class GameTester {

	public static void main(String[] args) throws IOException
	{


		Items test = new Items();
		Items test1 = new Items();
		ArrayList<Items> list = test.getList();
		test = list.get(5);
		test1 = list.get(3);
		System.out.println(test1.getName());
		Player p1 = new Player();
		System.out.println(p1.getHealth());
		p1.useHealthRegenItem(test);
		p1.getHealth();
		
	}

}
