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
	private static final int BUTTON_LOCATION_X = 200;  // location x 
	private static final int BUTTON_LOCATION_Y = 50;   // location y 
	private static final int BUTTON_SIZE_X = 140;      // size height
	private static final int BUTTON_SIZE_Y = 50;       // size width
	/**
	 * Instantiates a new mainmenu.
	 */
	public Mainmenu() {
		JFrame frame;
		Container contentPane;
		FlowLayout layout;

		frame = new JFrame();
		frame.setTitle("Rhythm-Pighting Game!");

		ImageIcon icon = new ImageIcon("img/mainmenu.jpg");
		JLabel label = new JLabel(icon);

		/****************************/
		frame.setContentPane(label);
		contentPane = frame.getContentPane();
		/****************************/

		JButton startButton = new JButton("Click Me To Start!");
        startButton.setBounds(BUTTON_LOCATION_X
                            , BUTTON_LOCATION_Y,
                              BUTTON_SIZE_X, 
                              BUTTON_SIZE_Y );
        //JFrame layout
        this.setLayout(null);

        //JPanel layout
        startButton.setLayout(null);
        contentPane.add(startButton);
		
		layout = new FlowLayout();
		contentPane.setLayout(layout);

		/****************************/
		//contentPane.add(label);
		/****************************/

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
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