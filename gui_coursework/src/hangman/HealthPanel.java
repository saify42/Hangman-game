package hangman;
import javax.swing.*;
import java.awt.*;

public class HealthPanel extends JPanel{
	
	LayoutManager layout2=new GridLayout(1,7);
	static JLabel[] labs = new JLabel[8];  //array for adding the livesleft panels
	Font myFont = new Font("Sans Serif", Font.BOLD, 50); 
	public static int livesLEFT=6; //livesleft= 6
	static ResultsWindow running=new ResultsWindow(); //this window is opened when livesleft is 0.ie; after losing
	
	public HealthPanel() {
		
		((GridLayout) layout2).setHgap(10);
		this.setLayout(layout2);
		for (int i=0;i<7;i++) {      //creating 7 labels to display the lives
			labs[i] = new JLabel("♥", JLabel.CENTER); //adding the labels into the array
			labs[i].setBackground(Color.GREEN);
			labs[i].setFont(myFont);
			labs[i].setOpaque(true);
			//labs[i].setVisible(true);
			
			this.add(labs[i]);  //adding and updating the window 

		}
	}
	public static boolean  removeLife(){  //method for removing life
		
		if (livesLEFT>0) {
		
		    labs[livesLEFT].setBackground(Color.RED); //turns the labels into red color
		    HealthPanel.livesLEFT--;
		}
		else if (livesLEFT<=0 ){ 
			labs[0].setBackground(Color.RED);  
			System.out.println("YOU LOST"); //prints 'you lost' after losing the game in the console
	    	running.setSize(500,500);  //after losing the results window is opened 
	    	running.setTitle("Results");
	    	running.setVisible(true);
	    	running.declaration();
	    	
		}
		
		return true;
	}
}
