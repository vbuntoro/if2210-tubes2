package tubes2;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

public class Mainmenu extends JFrame
{
	  JPanel pane = new JPanel();
	  JButton pressme = new JButton("Play the Game!");
	  Mainmenu()        // the frame constructor
	  {
	    super("Rhythm-Pighting Game!"); setBounds(100,100,300,200);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container con = this.getContentPane(); // inherit main frame
	    con.add(pane);    // JPanel containers default to FlowLayout
	    pressme.setMnemonic('P'); // associate hotkey to button
	    pane.add(pressme); pressme.requestFocus();
	    setVisible(true); // make frame visible
	  }
	  public static void main(String args[]) {new Mainmenu();}
}