import java.util.Stack;
import java.util.LinkedList;
public class Waste 
{
Deck deck;	
LinkedList<Card> wasteFaceDown;
Stack<Card> wasteFaceUp;

  public Waste(Deck deck)
  {
	  this.deck = deck;
	  this.wasteFaceDown = new LinkedList<Card>();
	  this.wasteFaceUp = new Stack<Card>();
	  for(int i = 0; i < deck.cardsInDeck.size(); i++)
	  {
		  wasteFaceDown.add(((LinkedList<Card>) deck.cardsInDeck).get(i));
	  }
  }
}
