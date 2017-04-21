package Model;

import javax.imageio.ImageIO;
import javax.swing.JFrame;


import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
 
/**
 * This class demonstrates how to load an Image from an external file
 */
public class MapView extends Component {
           
    BufferedImage img;
 
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
 
    public MapView() {
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
 
        JFrame f = new JFrame("Game Map");
             
        f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
 
        f.add(new MapView());
        f.pack();
        f.setVisible(true);
    }
}