package hangman;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class FileIO {
	String randomWord;
	public boolean reading() throws FileNotFoundException, IOException{
		ArrayList<String>words=new ArrayList<String>(); //adding all the words from the textfile and storing into an arraylist
        try (BufferedReader in = new BufferedReader(new FileReader("ABILITY.txt"))) { 
        	String s=in.readLine(); //reading file
        	while(s!=null) {
        		words.add(s); //adding words into arraylist
        		s=in.readLine();
        	}
        	
        }catch(FileNotFoundException e) {
        	System.err.print("Does not exist");
        	return false;
        }
        Random rand=new Random(); 
        int randomNum=rand.nextInt(words.size()); //random number
        randomWord=words.get(randomNum); //taking a random word from the arraylist
        System.out.println("The random word for this round is  : "+randomWord); //printing the randomword into the console
        return true;
	}
}
