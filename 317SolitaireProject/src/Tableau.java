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
ArrayList<ArrayList<Card>> Tableaus;
Card lastCard = new Card("Spades", "300", 300);

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
	   this.Tableaus = new ArrayList<ArrayList<Card>>();

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
	   Tableaus.add(Tableau1);
	   Tableaus.add(Tableau2);
	   Tableaus.add(Tableau3);
	   Tableaus.add(Tableau4);
	   Tableaus.add(Tableau5);
	   Tableaus.add(Tableau6);
	   Tableaus.add(Tableau7);
	   
   }
   
   public boolean priority()
   {
	   
	   Card card;
	   for (int i = 7; i >= 1 ; i--)
	   {
		   int size = Tableaus.get(i - 1).size();
		   if (size != 0)
		   {
			   Card hasBeen = Tableaus.get(i - 1).get(size - 1);
			   card = Tableaus.get(i - 1).get(size - 1);
			   card.hasBeen.add(hasBeen);
		   }
		   else
		   {
			   card = new Card("Spades", "300", 300);
		   }
		   for (ArrayList<Card> tab: Tableaus)
		   {
			   Card compare;
			   int sizeOfComparison = tab.size();
			   if (sizeOfComparison != 0)
			   {
				   compare = tab.get(sizeOfComparison - 1);
			   }
			   else
			   {
				   compare = new Card("Spades", "300", 300);
			   }
			   if (!card.getColor().equals(compare.getColor()) && card.getRank() == compare.getRank() - 1 
					   && card.equals(lastCard) == false && !card.hasBeen.contains(compare))
			   {
				   tab.add(card);
				   lastCard = card;
				   Tableaus.get(i - 1).remove(card);
				   return true;
			   }
			   
		   }
	   }
	   return false;
   }
   
   //SOMEONE CAN DOUBLE CHECK TO MAKE SURE THIS FUNCTION IS IMPLEMENTED CORRECTLY
   public boolean moveStack()
   {
	   Card card = new Card("Spades", "300", 300);
	  
	   for (int i = 7; i >= 1; i--)
	   {
		   ArrayList<Card> moveStack = new ArrayList<>();
		   int size = Tableaus.get(i - 1).size();
		   if (size != 0)
		   {
			   for (Card cardInTab: Tableaus.get(i - 1))
			   {
				   if(card.faceUp)
				   {
					   moveStack.add(cardInTab);
				   }
			   }
			   for(ArrayList<Card> tab: Tableaus)
			   {
				   int tabSize = tab.size();
				   if (tabSize > 1 && moveStack.size() > 1)
				   {
					   
					   if(!tab.get(tabSize - 1).getSuit().equals(moveStack.get(0).getSuit()) && tab.get(tabSize - 1).getRank() == moveStack.get(0).getRank() + 1
							  && !tab.get(tabSize - 1).getColor().equals(moveStack.get(0).getColor()))
					   {
						   tab.addAll(moveStack);
						   Tableaus.get(i - 1).removeAll(moveStack);
						   return true;
					   }
				   }
				   else
				   {
					   
				   }
			   }
			   
		   }
		   else
		   {
			   
		   }
		   
		   
	   }
	   return false;
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
	   for(int i = 0; i < Tableaus.size(); i++)
	   {
		   int tab = Tableaus.get(i).size();
		   Card card1 = new Card("Spades", "500", 500);
		   if(tab != 0)
		   {
			   card1 = Tableaus.get(i).get(tab - 1);
			   if (!card.getColor().equals(card1.getColor()) && card.getRank() == card1.getRank() - 1)
			   {
				   return i + 1;
			   }
		   }
		   else
		   {
			   
		   }
	   }
	   return 0;
   }
   
   
   
   
}