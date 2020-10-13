import java.util.ArrayList;
public class Tableau 
{
Deck deck;
Waste waste;
ArrayList<Card> Tableau1;
ArrayList<Card> Tableau2;
ArrayList<Card> Tableau3;
ArrayList<Card> Tableau4;
ArrayList<Card> Tableau5;
ArrayList<Card> Tableau6;
ArrayList<Card> Tableau7;

   public Tableau(Deck deck, Waste waste)
   {
	   this.deck = deck;
	   this.waste = waste;
	   this.Tableau1 = new ArrayList<Card>();
	   this.Tableau2 = new ArrayList<Card>();
	   this.Tableau3 = new ArrayList<Card>();
	   this.Tableau4 = new ArrayList<Card>();
	   this.Tableau5 = new ArrayList<Card>();
	   this.Tableau6 = new ArrayList<Card>();
	   this.Tableau7 = new ArrayList<Card>();
   }
   
   /**
    * This method sets up all the tableaus with the correct amount of cards and puts each card at the end to face up.
    */
   public void setUp()
   {
	   Tableau1.add(deck.draw());
	   Tableau2.add(deck.draw());
	   Tableau3.add(deck.draw());
	   Tableau4.add(deck.draw());
	   Tableau5.add(deck.draw());
	   Tableau6.add(deck.draw());
	   Tableau7.add(deck.draw());
	   Tableau2.add(deck.draw());
	   Tableau3.add(deck.draw());
	   Tableau4.add(deck.draw());
	   Tableau5.add(deck.draw());
	   Tableau6.add(deck.draw());
	   Tableau7.add(deck.draw());
	   Tableau3.add(deck.draw());
	   Tableau4.add(deck.draw());
	   Tableau5.add(deck.draw());
	   Tableau6.add(deck.draw());
	   Tableau7.add(deck.draw());
	   Tableau4.add(deck.draw());
	   Tableau5.add(deck.draw());
	   Tableau6.add(deck.draw());
	   Tableau7.add(deck.draw());
	   Tableau5.add(deck.draw());
	   Tableau6.add(deck.draw());
	   Tableau7.add(deck.draw());
	   Tableau6.add(deck.draw());
	   Tableau7.add(deck.draw());
	   Tableau7.add(deck.draw()); 
	   Tableau1.get(0).setFaceUp(true);
	   Tableau2.get(1).setFaceUp(true);
	   Tableau3.get(2).setFaceUp(true);
	   Tableau4.get(3).setFaceUp(true);
	   Tableau5.get(4).setFaceUp(true);
	   Tableau6.get(5).setFaceUp(true);
	   Tableau7.get(6).setFaceUp(true);
	   
   }
   
   /**
    * this method takes a card and tableau as a parameter, the card will be placed in a specific tableau based on what integer was passed
    * @param card
    * @param tableau
    */
   public void playCard(Card card, int tableau)
   {
	   card.setFaceUp(true);
	   if (tableau == 1)
	   {
		   Tableau1.add(card);
	   }
	   else if (tableau == 2)
	   {
		   Tableau2.add(card);
	   }
	   else if (tableau == 3)
	   {
		   Tableau3.add(card);
	   }
	   else if (tableau == 4)
	   {
		   Tableau4.add(card);
	   }
	   else if (tableau == 5)
	   {
		   Tableau5.add(card);
	   }
	   else if (tableau == 6)
	   {
		   Tableau6.add(card);
	   }
	   else if (tableau == 7)
	   {
		   Tableau7.add(card);
	   }
   }
   
   /**
    * this method takes a card as a parameter, and checks all the other tableaus bottom card to see which tableau it can place the given card
    * @param card
    * @return
    */
   public int canPlay(Card card)
   {
	   int tab1 = Tableau1.size();
	   int tab2 = Tableau2.size();
	   int tab3 = Tableau3.size();
	   int tab4 = Tableau4.size();
	   int tab5 = Tableau5.size();
	   int tab6 = Tableau6.size();
	   int tab7 = Tableau7.size();
	   Card card1 = new Card ("Spades", "500", 500);
	   Card card2 = new Card ("Spades", "500", 500);
	   Card card3 = new Card ("Spades", "500", 500);
	   Card card4 = new Card ("Spades", "500", 500);
	   Card card5 = new Card ("Spades", "500", 500);
	   Card card6 = new Card ("Spades", "500", 500);
	   Card card7 = new Card ("Spades", "500", 500);
	   if (tab1 != 0)
	   {
		    card1 = Tableau1.get(tab1 - 1);
	   }
	   if (tab2 != 0)
	   {
		    card2 = Tableau2.get(tab2 - 1);		   
	   }
	   if (tab3 != 0)
	   {
		   card3 = Tableau3.get(tab3 - 1);		   
	   }
	   if (tab4 != 0)
	   {
		    card4 = Tableau4.get(tab4 - 1);		
	   }
	   if (tab5 != 0)
	   {
		    card5 = Tableau5.get(tab5 - 1);	
	   }
	   if (tab6 != 0)
	   {
		    card6 = Tableau6.get(tab6 - 1);		   
	   }

	   if (tab7 != 0)
	   {
		    card7 = Tableau7.get(tab7 - 1);		   
	   }

	
	   if (!card.getColor().equals(card1.getColor()) && card.getRank() == card1.getRank() - 1)
	   {
		   return 1;
	   }
	   else if (!card.getColor().equals(card2.getColor()) && card.getRank() == card2.getRank() - 1)
	   {
		   return 2;
	   }
	   else if (!card.getColor().equals(card3.getColor()) && card.getRank() == card3.getRank() - 1)
	   {
		   return 3;
	   }
	   else if (!card.getColor().equals(card4.getColor()) && card.getRank() == card4.getRank() - 1)
	   {
		   return 4;
	   }
	   else if (!card.getColor().equals(card5.getColor()) && card.getRank() == card5.getRank() - 1)
	   {
		   return 5;
	   }
	   else if (!card.getColor().equals(card6.getColor()) && card.getRank() == card6.getRank() - 1)
	   {
		   return 6;
	   }
	   else if (!card.getColor().equals(card7.getColor()) && card.getRank() == card7.getRank() - 1)
	   {
		   return 7;
	   }
	   else
	   {
		   return 0;
	   }
   }
   
   
   
   
}
