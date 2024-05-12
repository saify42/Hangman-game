package hangman;

public class PlayAgainClass extends Run {
	PlayAgainClass(){ //reseting required variables
		HealthPanel.livesLEFT=6;
		WordPanel.randomWord2="";
		WordPanel.lengthString=0;
		WordPanel.won=0;
		WordPanel.completed=false;
		
	}
	public void runAgain() {
		disposeMainWindow(); //closes the previous round window
		Run newRun=new Run(); 
		newRun.main(null);  //main method is called and process repeats
	}
}
