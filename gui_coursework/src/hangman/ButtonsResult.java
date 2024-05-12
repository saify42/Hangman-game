package hangman;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonsResult extends JPanel implements ActionListener{
	JButton playAgain=new JButton("PlayAgain"); //playagain button
	JButton exit=new JButton("Exit");          // exit button
	LayoutManager layout5=new GridLayout(1,2);
	
	ButtonsResult(){
		this.setLayout(layout5);
		this.add(playAgain);
		this.add(exit);
		playAgain.addActionListener(this);
		exit.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==exit) { //exit button clicked then exits the whole game
			System.exit(0);
		}
		else if(e.getSource()==playAgain) { //if play again button clicked 
			ResultsWindow.disposing();      //closes the results window
			PlayAgainClass l=new PlayAgainClass();
			l.runAgain();                  //runagain method from playagainclass is runned
			
		}
	}
}
