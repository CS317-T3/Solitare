import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.Random;
import java.util.LinkedList;


public class Deck 
{
 ArrayList<Card> deck;
 ArrayList<String> suits;
 ArrayList<String> number;
 ArrayList<Integer> rank;
 LinkedList<Card> cardsInPlay;
 Queue cardsInDeck;
 Random r;

 public Deck() 
 {
	 this.deck = new ArrayList<Card>();
	 this.suits = new ArrayList<String>();
	 this.number = new ArrayList<String>();
	 this.rank = new ArrayList<Integer>();
	 this.cardsInPlay = new LinkedList<Card>();
	 this.r = new Random();
	 this.suits.add("Spades");
	 this.suits.add("Hearts");
	 this.suits.add("Diamonds");
	 this.suits.add("Clubs");
	 this.number.add("Ace of");
	 this.number.add("Two of");
	 this.number.add("Three of");
	 this.number.add("Four of");
	 this.number.add("Five of");
	 this.number.add("Six of");
	 this.number.add("Seven of");
	 this.number.add("Eight of");
	 this.number.add("Nine of");
	 this.number.add("Ten of");
	 this.number.add("Jack of");
	 this.number.add("Queen of");
	 this.number.add("King of");
	 this.rank.add(1);
	 this.rank.add(2);
	 this.rank.add(3);
	 this.rank.add(4);
	 this.rank.add(5);
	 this.rank.add(6);
	 this.rank.add(7);
	 this.rank.add(8);
	 this.rank.add(9);
	 this.rank.add(10);
	 this.rank.add(11);
	 this.rank.add(12);
	 this.rank.add(13);
	 for(int i = 0; i < number.size(); i++)
	 {
		 for(String j : this.suits)
		 {
			 Card card = new Card(j , number.get(i), rank.get(i));
			 this.deck.add(card);
		 }
	 }
 }

       public void shuffle()
   {
	   for(int i = this.deck.size()- 1; i > 0; i--)
	   {
		   int j = r.nextInt(i + 1);
		   Card temp = this.deck.get(i);
		   this.deck.set(i, this.deck.get(j));
		   this.deck.set(j, temp);

	   }
	   for(Card card: this.deck)
	   {
		   this.cardsInPlay.add(card);
	   }

   }
//       public void display()
//       {
//    	   for(int i = 0; i < deck.size(); i++)
//    	   {
//    		   Card card = this.deck.get(i);
//    		   System.out.println(card.ToString());
//    	   }
//       }

       public Card draw()
       {
    	   Card card = this.cardsInPlay.peek();
    	   //System.out.println(card.ToString());
    	  return this.cardsInPlay.pop();


       }

}