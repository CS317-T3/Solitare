public class SolitaireRunner
{
	static int wins = 0;
 public static void main(String[] args) 
 {

	for (int i = 0; i < 1000; i++)
	{
		int count = 0;
	Deck deck = new Deck();
	deck.shuffle();
	PlayField playfield = new PlayField(deck);
	//System.out.println(playfield.waste.wasteFaceDown.size());
	playfield.setUp();
	//System.out.println(playfield.waste.wasteFaceDown.size());

	while (playfield.waste.wasteFaceDown.isEmpty() == false)
	{
		//System.out.println("In the first for loop");
			while (playfield.stop == false)
			{
				//System.out.println("In the second for loop");
				count ++;
				playfield.draw2();
				playfield.playCard();
				playfield.MoveToFoundation();
				
				
			}
			if (playfield.stop == true)
			{
				break;
			}
		


	}
	if (playfield.stop == false)
	{
		wins++;
	}

	//System.out.println("Count: " + count);\
	}
	System.out.println("Wins: " + wins);
 }
}