import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.Random;

public class Deck 
{
 ArrayList<Card> deck;
 ArrayList<String> suits;
 ArrayList<String> rank;
 Stack<Card> cardsInPlay;
 Queue cardsInDeck;
 
 public Deck() 
 {
	 this.deck = new ArrayList<Card>();
	 this.suits = new ArrayList<String>();
	 this.rank = new ArrayList<String>();
	 this.cardsInPlay = new Stack<Card>();
	 this.suits.add("Spades");
	 this.suits.add("Hearts");
	 this.suits.add("Diamonds");
	 this.suits.add("Clubs");
	 this.rank.add("One of");
	 this.rank.add("Two of");
	 this.rank.add("Three of");
	 this.rank.add("Four of");
	 this.rank.add("Five of");
	 this.rank.add("Six of");
	 this.rank.add("Seven of");
	 this.rank.add("Eight of");
	 this.rank.add("Nine of");
	 this.rank.add("Ten of");
	 this.rank.add("Jack of");
	 this.rank.add("Queen of");
	 this.rank.add("King of");
	 this.rank.add("Ace of");
	 for(String i : this.rank)
	 {
		 for(String j : this.suits)
		 {
			 Card card = new Card(j , i);
			 this.deck.add(card);
		 }
	 }
 }
 
       public void shuffle()
   {
	   Random r = new Random();
	   for(int i = 51; i > 0; i--)
	   {
		   int j = r.nextInt(i + 1);
		   Card temp = this.deck.get(i);
		   this.deck.set(i, this.deck.get(j));
		   this.deck.set(j, temp);
		   
	   }
	   for(Card card: this.deck)
	   {
		   this.cardsInPlay.push(card);
	   }
	   
   }
       public void display()
       {
    	   for(int i = 0; i < deck.size(); i++)
    	   {
    		   Card card = this.deck.get(i);
    		   System.out.println(card.ToString());
    	   }
       }
       
       public void draw()
       {
    	   Card card = this.cardsInPlay.peek();
    	   System.out.println(card.ToString());
    	   this.cardsInPlay.pop();
    	   
       }
 
}
