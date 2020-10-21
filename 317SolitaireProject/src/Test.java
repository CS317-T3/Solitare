public class Test {
	
	public static boolean playWinningHand() {
		Deck winningShuffle = new Deck();
		winningShuffle.shuffleWin();
		PlayField playfield = new PlayField(winningShuffle);
		playfield.setUp();
		while (playfield.foundation.spades.size() < 13 && playfield.foundation.hearts.size() < 13 
				&& playfield.foundation.clubs.size() < 13 &&playfield.foundation.diamonds.size() < 13 && playfield.stop == false) {
			playfield.draw2();
			playfield.MoveToFoundation();
			playfield.playCard();
			playfield.tableau.moveStack();
			
			if (playfield.stop == true)
			{
				break;
			}
		}
		if (playfield.stop == false) {
			return true;
		}
		else {
			return false;
		}
		}
	
	public static boolean playLosingHand() {
		Deck losingShuffle = new Deck();
		losingShuffle.shuffleLoss();
		PlayField playfield = new PlayField(losingShuffle);
		playfield.setUp();
		while (playfield.foundation.spades.size() < 13 && playfield.foundation.hearts.size() < 13 
				&& playfield.foundation.clubs.size() < 13 &&playfield.foundation.diamonds.size() < 13 && playfield.stop == false) {
			playfield.draw2();
			playfield.MoveToFoundation();
			playfield.playCard();
			playfield.tableau.moveStack();
			
			if (playfield.stop == true)
			{
				break;
			}
		}
		if (playfield.stop == false) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static void main(String [] args) {
		boolean winHandWorks = playWinningHand();
		boolean loseHandWorks = playLosingHand();
		if (winHandWorks) {
			System.out.println("Winning hand played successfully as intended");
		}
		else {
			System.out.println("Winning hand has lost the game");
		}
		if (loseHandWorks) {
			System.out.println("Losing hand played unsuccessfully as intended");
		}
		else {
			System.out.println("Losing hand has won the game");
		}
	}
	}
