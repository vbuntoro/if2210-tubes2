package tubes2;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Button extends JButton {


	//JPanel
	JPanel pnlButton = new JPanel();
	//Buttons
	JButton btnAddFlight = new JButton("Add Flight");

    public Button(String text) {
    	/* Tombol */
		btnAddFlight.setBounds(300, 300, 220, 30);

	    //JPanel bounds
	    pnlButton.setBounds(20, 20, 200, 100);
		pnlButton.setLayout(null);

	    //Adding to JFrame
	    pnlButton.add(btnAddFlight);
	    add(pnlButton);
		this.setOpaque(true);

    }

}