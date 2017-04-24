package Model;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;
//import javax.swing.JFrame;

import Control.RoomMaker;

import java.awt.*;
//import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import Control.RoomMaker;
 
/**
 * This class demonstrates how to load an Image from an external file
 */
public class GameTester extends Component {
           
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	BufferedImage img;
    static Scanner input = new Scanner(System.in);
    static String map = input.nextLine();

    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
 
    public GameTester() {
       try {
           img = ImageIO.read(new File("Map.png"));
       } catch (IOException e) {
       }
 
    }
 
    public Dimension getPreferredSize() {
        if (img == null) {
             return new Dimension(500,500);
        } else {
           return new Dimension(img.getWidth(null), img.getHeight(null));
       }
    }
 
   public static void main(String[] args) {
//    	Game.intro();
//      /*  JFrame f = new JFrame("Game Map");
//             
//        f.addWindowListener(new WindowAdapter(){
//                public void windowClosing(WindowEvent e) {
//                    System.exit(0);
//                }
//            });
// 
//        f.add(new GameTester());
//        f.pack();
//        f.setVisible(true);
//    }
//    */
//    //when map is typed it displays it 
//    	Items test = new Items();
//	//	Items test1 = new Items();
//    	
//    	Player p1 = new Player();
//    	try
//    	{
//    		
//        	RoomMaker bs = new RoomMaker();
//        	final int WIDTH = 40;
//            final int HEIGHT = 40;
//            Room[][] room = new Room[WIDTH][HEIGHT];
//            bs.build(room, WIDTH, HEIGHT);
//            System.out.println();
//            bs.print(room, bs.getX(), bs.getY());
//            
//            bs.movePlayer(p1);
//            bs.print(room, bs.getX(), bs.getY());
//    		
//    		
//    		
//    	}
//    	catch(IOException e)
//    	{
//    		System.out.println("cant move");
//    	}
//		
        
        
        
    	
    	
    	
    	
    	
   if(map.equalsIgnoreCase("Map")){
	   
	   MapView.ViewMap();
	   
   } 
  }
}
		
/*
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
	
	

}*/
