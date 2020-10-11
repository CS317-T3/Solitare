import java.util.ArrayList;

public class PlayField 
{
Waste waste;
Tableau tableau;
Foundation foundation;
  public PlayField(Deck deck)
  {
	  this.waste = new Waste(deck);
	  this.tableau = new Tableau(deck);
	  this.foundation = new Foundation(deck);
  }
  
  public void setUp()
  {
	  tableau.setUp();
	  waste.setUp();
  }
  
  public void draw()
  {
	  waste.draw();
  }
  
  public void playCard()
  {
	  Card card = waste.playCard();
	  int canPlay = tableau.canPlay(card);
	  tableau.playCard(card, canPlay);
  }
  
  public void MoveToFoundation()
  {
	  Card card = waste.moveToFoundation();
	  if (card.getSuit().equals("Spades"))
	  {
		  int spadesSize = foundation.spades.size();
		  if (card.getRank() == spadesSize + 1)
		  {
			  foundation.spades.add(card);
			  waste.wasteFaceUp.pop();
		  }
	  }
	  else if (card.getSuit().equals("Clubs"))
	  {
		  int spadesSize = foundation.clubs.size();
		  if (card.getRank() == spadesSize + 1)
		  {
			  foundation.clubs.add(card);
			  waste.wasteFaceUp.pop();
		  }
	  }
	  else if (card.getSuit().equals("Hearts"))
	  {
		  int spadesSize = foundation.hearts.size();
		  if (card.getRank() == spadesSize + 1)
		  {
			  foundation.hearts.add(card);
			  waste.wasteFaceUp.pop();
		  }
	  }
	  else if (card.getSuit().equals("Diamonds"))
	  {
		  int spadesSize = foundation.diamonds.size();
		  if (card.getRank() == spadesSize + 1)
		  {
			  foundation.diamonds.add(card);
			  waste.wasteFaceUp.pop();
		  }
	  }
	  
	  int tabSize1 = tableau.Tableau1.size();
	  int tabSize2 = tableau.Tableau2.size();
	  int tabSize3 = tableau.Tableau3.size();
	  int tabSize4 = tableau.Tableau4.size();
	  int tabSize5 = tableau.Tableau5.size();
	  int tabSize6 = tableau.Tableau6.size();
	  int tabSize7 = tableau.Tableau7.size();
	  ArrayList<Card> tabCards = new ArrayList<Card>();
	  Card card2 = tableau.Tableau1.get(tabSize1);
	  Card card3 = tableau.Tableau2.get(tabSize2);
	  Card card4 = tableau.Tableau3.get(tabSize3);
	  Card card5 = tableau.Tableau4.get(tabSize4);
	  Card card6 = tableau.Tableau5.get(tabSize5);
	  Card card7 = tableau.Tableau6.get(tabSize6);
	  Card card8 = tableau.Tableau7.get(tabSize7);
	  tabCards.add(card2);
	  tabCards.add(card3);
	  tabCards.add(card4);
	  tabCards.add(card5);
	  tabCards.add(card6);
	  tabCards.add(card7);
	  tabCards.add(card8);
	  
	  int count = 0;
	  for (Card cardInList: tabCards)
	  {
		  count++;
		  if (cardInList.getSuit().equals("Spades"))
		  {
			  int spadesSize = foundation.spades.size();
			  if (cardInList.getRank() == spadesSize + 1)
			  {
				  foundation.spades.add(card);
				  int tabSize = tableau.Tableau1.size();
				  tableau.Tableau1.remove(tabSize);
			  }
		  }
		  if (cardInList.getSuit().equals("Clubs"))
		  {
			  int clubsSize = foundation.clubs.size();
			  if (cardInList.getRank() == clubsSize + 1)
			  {
				  foundation.clubs.add(card);
				  int tabSize = tableau.Tableau1.size();
				  tableau.Tableau1.remove(tabSize);
			  }
		  }
		  if (cardInList.getSuit().equals("Hearts"))
		  {
			  int heartsSize = foundation.hearts.size();
			  if (cardInList.getRank() == heartsSize + 1)
			  {
				  foundation.hearts.add(card);
				  int tabSize = tableau.Tableau1.size();
				  tableau.Tableau1.remove(tabSize);
			  }
		  }
		  if (cardInList.getSuit().equals("Diamonds"))
		  {
			  int diamondsSize = foundation.spades.size();
			  if (cardInList.getRank() == diamondsSize + 1)
			  {
				  foundation.diamonds.add(card);
				  int tabSize = tableau.Tableau1.size();
				  tableau.Tableau1.remove(tabSize);
			  }
		  }
	  }
			  

  }
}
