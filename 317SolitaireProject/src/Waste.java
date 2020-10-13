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
  
  /**
   * this method makes the waste pile
   */
  public void setUp()
  {
	  for (Card card: deck.cardsInPlay)
	  {
		  wasteFaceDown.add(card);
	  }
  }
  
  /**
   * this method takes a card from the top of the deck and puts it in the face up waste
   */
  public void draw()
  {
	  wasteFaceUp.push(this.deck.draw());
  }
  

  /**
   * this method returns a card at the top of the waste face up stack to see if it can be played
   * @return
   */
  public Card playCard()
  {
	  	
	   return wasteFaceUp.peek();
  }
  
  /**
   * this method returns a card at the top of the waste face up stack to see if it can be moved to the foundation
   * @return
   */
  public Card moveToFoundation()
  {
	  return wasteFaceUp.peek();
  }
}
