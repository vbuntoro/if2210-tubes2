package tubes2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Mainmenu extends JFrame
{
	JButton b1;
	JLabel l1;
	public Mainmenu()
	{
		setTitle("Rhythm-Pighting Game!");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("img/mainmenu.jpg")));
		setLayout(new FlowLayout());
		l1=new JLabel("Here is a button");
		b1=new JButton("I am a button");
		add(l1);
		add(b1);
		// Just for refresh :) Not optional!
		setSize(596,380);
		}
		public static void main(String args[])
		{
		new Mainmenu();
	}
}