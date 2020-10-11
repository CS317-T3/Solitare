import java.util.Stack;
public class Foundation 
{
	Deck deck;
	Stack<Card> spades;
	Stack<Card> hearts;
	Stack<Card> diamonds;
	Stack<Card> clubs;
	
    public Foundation(Deck deck)
    {
    	this.deck = deck;
    	this.spades = new Stack<Card> ();
    	this.hearts = new Stack<Card> ();
    	this.diamonds = new Stack<Card> ();
    	this.clubs = new Stack<Card> ();
    }
    
    
    
}
