/*
 * 
 */
package tubes2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// TODO: Javadoc for Mainmenu
/**
 * The Class Mainmenu.
 */
class Mainmenu extends JFrame
{
	/**
	 * Instantiates a new mainmenu.
	 */
	public Mainmenu() {
		setTitle("Rhythm-Pighting Game!");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("img/mainmenu.jpg")));
		setLayout(new FlowLayout());
		// Just for refresh :) Not optional!
		setSize(800,600);
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {
		new Mainmenu();
	}
}