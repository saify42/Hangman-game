package hangman;
import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
	Container cpane=this.getContentPane();
	Font myFont = new Font("Sans Serif", Font.BOLD, 50); //setting style 
	LayoutManager layout1=new GridLayout(3,1); // creating a layout
	static int round;
	
	public MainWindow() {
		round++;
		HealthPanel hp=new HealthPanel(); //creating healthpanel object
		WordPanel wp=new WordPanel(); //creating wordpanel object
		ButtonPanel bp=new ButtonPanel(); //creating button panel object
		cpane.setLayout(layout1); //setting the windows 
		cpane.add(hp); //adding the class objects to the mainwindow
		cpane.add(wp);
		cpane.add(bp);    
		
		
		
	}
	
}

