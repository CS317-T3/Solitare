
public class SolitaireRunner
{
 public static void main(String[] args) 
 {
	Deck deck = new Deck();
	PlayField playfield = new PlayField(deck);
	deck.display();
	deck.shuffle();
	deck.display();
	deck.draw();
	deck.draw();
	
	
 }
}
