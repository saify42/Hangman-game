package hangman;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.*;

public class ResultsWindow extends JFrame { //a new window announcing the results 
	Container cpane=this.getContentPane();
	LayoutManager layout4=new GridLayout(2,0);
	
	JLabel result=new JLabel("",JLabel.CENTER);
	
	ResultsWindow(){
		this.setLayout(layout4);
		this.add(result);  
		this.add(new ButtonsResult()); //adding the buttons
	}
	public void declaration() { 
        if (WordPanel.completed==true) {  //if the player wins, the text is set as you won
			result.setText("You won round "+MainWindow.round+  ". The word was '"+WordPanel.randomWord2+"'");
		}
        else {                            //if the player lost, the text is set as you lost
        	result.setText("You lost round "+MainWindow.round+  ". The word was '"+WordPanel.randomWord2+"'");
        }
		
		
		
	}
	public static void disposing() {
		HealthPanel.running.dispose();  //method to dispose the results window
	}
	
}
