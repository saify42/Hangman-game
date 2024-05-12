package hangman;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.*;

import javax.swing.*;

public class ButtonPanel extends JPanel implements ActionListener{
	private String[] keyboard={"Q","W","E","R","T","Y","U","I","O","P","A","S","D","F","G","H","J","K","L","Z","X","C","V","B","N","M"};
	private JButton[] keyboard1=new JButton[26]; //array for jbuttons
	private String currentLetter;
	private String searchLetter;
	private JButton searchLetterk1;
	JButton test;
	LayoutManager layout3=new GridLayout(3,9);
    ButtonPanel(){
    	((GridLayout) layout3).setHgap(3);
		this.setLayout(layout3);
    	for (int i=0;i<keyboard.length;i++) { //making the keyboard buttons 
    		currentLetter=keyboard[i];
    	    JButton currentLetter=new JButton(this.currentLetter);
    		this.add(currentLetter);
    		keyboard1[i]=currentLetter;
    		currentLetter.addActionListener(this);
    	}test=new JButton("Exit");
    	this.add(test);
    	test.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i=0;i<keyboard.length;i++) { 
			this.searchLetter=keyboard[i];      
			this.searchLetterk1=keyboard1[i];
			if (e.getSource()==searchLetterk1) { //after clicking button
				if (WordPanel.randomWord2.contains(searchLetter)){ //checking if the randomword contains the clicked button
						WordPanel.guess(searchLetter); //runs guess method from wordpanel
						searchLetterk1.setEnabled(false); //button disappears after being clicked
				}
				else {
					HealthPanel.removeLife(); //if clicked wrong buttons runs removelife method
					searchLetterk1.setEnabled(false);
				}
				
		    }
			if (e.getSource()==test) {
				System.exit(0);
			}
		}
		if (WordPanel.completed==true) {
			for (int i=0;i<keyboard.length;i++){ //disabling the keyboard after the game is over
				keyboard1[i].setEnabled(false); 
			}
		}
		
		
		
	} 
}
