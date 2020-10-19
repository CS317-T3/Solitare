public class SolitaireRunner
{
	static int wins = 0;
 public static void main(String[] args) 
 {

	for (int i = 0; i < 1; i++)
	{
		int count = 0;
	Deck deck = new Deck();
	deck.shuffle();
	PlayField playfield = new PlayField(deck);
	//System.out.println(playfield.waste.wasteFaceDown.size());
	playfield.setUp();
	//System.out.println(playfield.waste.wasteFaceDown.size());
	//System.out.println("Starting the game");
	while (playfield.foundation.spades.size() < 13 && playfield.foundation.hearts.size() < 13 
			&& playfield.foundation.clubs.size() < 13 &&playfield.foundation.diamonds.size() < 13 && playfield.stop == false)
	{
		//System.out.println("In the first for loop");
			
				//System.out.println("In the second for loop");
//				System.out.println("\nThis is the waste face DOWN:");
//				for (Card card: playfield.waste.wasteFaceDown) {
//					System.out.print(card.ToString());
//				}
//				System.out.println("\nThis is the waste face UP:");
//				for (Card card: playfield.waste.wasteFaceUp) {
//					System.out.print(card.ToString());
//				}
//				System.out.println("\nThis is Tab 1");
//				for (Card card: playfield.tableau.Tableau1) {
//					System.out.print(card.ToString());
//				}
//				System.out.println("\nThis is Tab 2");
//				for (Card card: playfield.tableau.Tableau2) {
//					System.out.print(card.ToString());
//				}
//				System.out.println("\nThis is Tab 3");
//				for (Card card: playfield.tableau.Tableau3) {
//					System.out.print(card.ToString());
//				}
//				System.out.println("\nThis is Tab 4");
//				for (Card card: playfield.tableau.Tableau4) {
//					System.out.print(card.ToString());
//				}
//				System.out.println("\nThis is Tab 5");
//				for (Card card: playfield.tableau.Tableau5) {
//					System.out.print(card.ToString());
//				}
//				System.out.println("\nThis is Tab 6");
//				for (Card card: playfield.tableau.Tableau6) {
//					System.out.print(card.ToString());
//				}
//				System.out.println("\nThis is Tab 7");
//				for (Card card: playfield.tableau.Tableau7) {
//					System.out.print(card.ToString());
//				}
				
				count ++;
				
				playfield.draw2();
				playfield.MoveToFoundation();
				playfield.playCard();
				boolean play = playfield.tableau.moveStack();
				if (play == true)
				{
					playfield.hasPlayed = true;
				}
				
				
//				System.out.println("\nCLUBS FOUNDATION: ");
//				for (Card card: playfield.foundation.clubs) {
//					System.out.print(card.ToString());
//				}
//				System.out.println("\nDIAMONDS FOUNDATION: ");
//				for (Card card: playfield.foundation.diamonds) {
//					System.out.print(card.ToString());
//				}
//				System.out.println("\nHEARTS FOUNDATION: ");
//				for (Card card: playfield.foundation.hearts) {
//					System.out.print(card.ToString());
//				}
//				System.out.println("\nSPADES FOUNDATION: ");
//				for (Card card: playfield.foundation.spades) {
//					System.out.print(card.ToString());
//				}
				
			
			if (playfield.stop == true)
			{
				break;
			}
		


	}
	if (playfield.stop == false)
	{
		//System.out.println("Won a game");
		wins++;
	}

	//System.out.println("Count: " + count);\
	}
	System.out.println("Wins: " + wins);
 }
}