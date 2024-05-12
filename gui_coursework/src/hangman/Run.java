package hangman;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JLabel;

public class Run {
	static MainWindow running;   //object for window
	public static void main(String[] args) {
		
		
		running=new MainWindow(); //creating the object
		running.setSize(1700,1000); //setting size
		running.setTitle("Hangman"); //setting title
		running.setVisible(true); //setting it visible
		
		
	}
	public static void disposeMainWindow() {    //method for disposing the window after game is over
        if (running != null) {  
            running.dispose();
        }
	}

}
