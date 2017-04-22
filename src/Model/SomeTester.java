package Model;
import java.util.ArrayList;
public class SomeTester {

	public static void main(String[] args) {
		Player p1 = new Player();
		Items item = new Items();
		ArrayList<Items> list = item.getList();
		item = list.get(3);
		item.setIncreaseAmmo(2);
		System.out.println(item.getIncreaseAmmo());
		p1.combineHerbs(item);
		

	}

}
