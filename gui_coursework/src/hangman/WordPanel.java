package hangman;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.*;

public class WordPanel extends JPanel{
	Font myFont = new Font("Sans Serif", Font.BOLD, 50); //creating font
	LayoutManager layout3=new GridLayout(1,7); //layout
	private static  JLabel[] labs;  //array to be added for creating the labels to be guessed 
	FileIO read=new FileIO();
	public static String randomWord2; //the random word
	public static int lengthString; 
	private static String[] wordSplit; 
	public static int won=0;
	static Boolean completed=false;
	
	
	public WordPanel(){
		try {
			read.reading(); //calling the reading method
			randomWord2=read.randomWord;  //taking the randomword from fileio
			lengthString=randomWord2.length(); //length of the string 
			wordSplit=randomWord2.split(""); //array of the letters of the string 
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		((GridLayout) layout3).setHgap(5);
		this.setLayout(layout3);
		labs= new JLabel[lengthString];
		for (int i=0;i<lengthString;i++) { //creating labels to be guessed equal to the length of string
			labs[i] = new JLabel("_", JLabel.CENTER);
			labs[i].setBackground(Color.WHITE);
			labs[i].setFont(myFont);
			labs[i].setOpaque(true);
			labs[i].setVisible(true);
			
			this.add(labs[i]);                    //adding the labels into the wordpanel

		}
		
	}
	public static void guess(String guessLetter) { //method to guess the letter
		
		   
		
		    for (int i=0;i<wordSplit.length;i++) { //checking if the letter is present in the word
		    	if (guessLetter.equalsIgnoreCase(wordSplit[i])) {
		             labs[i].setText(guessLetter); // if present, it replaces the _ to the guessedletter
		             won++;                        //increasing won each time a letter is guessed
		             
			    }
		    }
		    if (won==wordSplit.length) { //if won variable is equal to the word's length
		    	WordPanel.completed=true; 
		    	System.out.println("YOU WON"); 
				HealthPanel.running.setSize(500,500);  //opens the results window after winning
				HealthPanel.running.setTitle("Results");
				HealthPanel.running.setVisible(true);
				HealthPanel.running.declaration();
		    }
		
	}
	
}
