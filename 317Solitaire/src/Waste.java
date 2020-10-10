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
  }
  
  public void setUp()
  {
	  wasteFaceDown = deck.cardsInPlay;
  }
  
  public void draw()
  {
	  wasteFaceUp.push(this.deck.draw());
  }

  public Card playCard()
  {
	   return wasteFaceUp.peek();
  }
  
  public Card moveToFoundation()
  {
	  return wasteFaceUp.peek();
  }
}
