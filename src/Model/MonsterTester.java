package Model;
import Model.Monster;
import Model.Items;
import Model.Player;
import java.util.Scanner;
public class MonsterTester 
{

	public static void main(String[] args) 
	{
		System.out.println("Please Enter The Item Name.");
		Scanner input = new Scanner(System.in);
		String item = input.nextLine();
		if(item.equalsIgnoreCase("Green Herb"))
		{
			System.out.println("Would you like to combine the green and red herbs?");
			String answer = input.nextLine();
			if(answer.equalsIgnoreCase("Yes"))
			{
				System.out.println("You have combined the red and green herb. Would you like to use it?");
			}
			else
			{
				System.out.println("Would you like to use only the Green Herb?");
			}
		}
		
		
		//Monster m1 = new Monster("Insane Crew Person", (int)(Math.random() * 5 + 1), 10);
		
		
	}

}
