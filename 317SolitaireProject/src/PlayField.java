import java.util.ArrayList;

public class PlayField 
{
Waste waste;
Tableau tableau;
Foundation foundation;
boolean hasPlayed = false;
boolean stop = false;
  public PlayField(Deck deck)
  {
	  this.waste = new Waste(deck);
	  this.tableau = new Tableau(deck, waste);
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
  
  public void draw2()
  {
	 Card card = waste.wasteFaceDown.peek();
	 waste.wasteFaceUp.push(card);
	 waste.wasteFaceDown.remove(card);
  }

  public void playCard()
  {
	  int count = 0;
	  try {


	  Card card = waste.playCard();

	  int canPlay = tableau.canPlay(card);
	  if (canPlay == 0)
	  {
		  waste.wasteFaceDown.pop();
		  waste.wasteFaceUp.push(card);

	  }
	  tableau.playCard(card, canPlay);
  }
	  catch (Exception NullPointerException)
	  {
		  System.out.println("Count: " + count);
		  if (hasPlayed == false)
		  {
			  if (count == 3)
			  {
				  stop = true;
			  }
			  else
			  {
				  count++;
			  }
		  }
		  if (hasPlayed == true)
		  {
			  count = 0;
		  }
		  for(int i = 0; i < waste.wasteFaceUp.size(); i ++)
		  {
			  
			  waste.wasteFaceDown.push(waste.wasteFaceUp.peek());
			  waste.wasteFaceUp.pop();
			  System.out.println("Moving face up to face down");
		  }
	  }
  }

  public void MoveToFoundation()
  {
	  Card card;
	  try {
		  card = waste.moveToFoundation();
	  }
	  catch (Exception EmptyStackException)
	  {
		  card = new Card("Spades", "30", 30);
	  }
	 
	  if (card.getSuit().equals("Spades"))
	  {
		  int spadesSize = foundation.spades.size();
		  if (card.getRank() == spadesSize + 1)
		  {
			  foundation.spades.add(card);
			  waste.wasteFaceUp.pop();
			  hasPlayed = true;
		  }
	  }
	  else if (card.getSuit().equals("Clubs"))
	  {
		  int spadesSize = foundation.clubs.size();
		  if (card.getRank() == spadesSize + 1)
		  {
			  foundation.clubs.add(card);
			  waste.wasteFaceUp.pop();
			  hasPlayed = true;
		  }
	  }
	  else if (card.getSuit().equals("Hearts"))
	  {
		  int spadesSize = foundation.hearts.size();
		  if (card.getRank() == spadesSize + 1)
		  {
			  foundation.hearts.add(card);
			  waste.wasteFaceUp.pop();
			  hasPlayed = true;
		  }
	  }
	  else if (card.getSuit().equals("Diamonds"))
	  {
		  int spadesSize = foundation.diamonds.size();
		  if (card.getRank() == spadesSize + 1)
		  {
			  foundation.diamonds.add(card);
			  waste.wasteFaceUp.pop();
			  hasPlayed = true;
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
	  if (tableau.Tableau1.size() >= 1)
	  {
		  Card card2 = tableau.Tableau1.get(tabSize1 -1);
		  tabCards.add(card2);
	  }
	  if (tableau.Tableau2.size() >= 1)
	  {
		  Card card3 = tableau.Tableau2.get(tabSize2 -1);
		  tabCards.add(card3);
	  }
	  if (tableau.Tableau3.size() >= 1)
	  {
		  Card card4 = tableau.Tableau3.get(tabSize3 -1);
		  tabCards.add(card4);
	  }
	  if (tableau.Tableau4.size() >= 1)
	  {
		  Card card5 = tableau.Tableau4.get(tabSize4 -1);
		  tabCards.add(card5);
	  }
	  if (tableau.Tableau5.size() >= 1)
	  {
		  Card card6 = tableau.Tableau5.get(tabSize5 -1);
		  tabCards.add(card6);
	  }
	  if (tableau.Tableau6.size() >= 1)
	  {
		  Card card7 = tableau.Tableau6.get(tabSize6 -1);
		  tabCards.add(card7);
	  }
	  if (tableau.Tableau7.size() >= 1)
	  {
		  Card card8 = tableau.Tableau7.get(tabSize7 -1);
		  tabCards.add(card8);
	  }

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
				  hasPlayed = true;
			  }
		  }
		  if (cardInList.getSuit().equals("Clubs"))
		  {
			  int clubsSize = foundation.clubs.size();
			  if (cardInList.getRank() == clubsSize + 1)
			  {
				  foundation.clubs.add(card);
				  hasPlayed = true;
			  }
		  }
		  if (cardInList.getSuit().equals("Hearts"))
		  {
			  int heartsSize = foundation.hearts.size();
			  if (cardInList.getRank() == heartsSize + 1)
			  {
				  foundation.hearts.add(card);
				  hasPlayed = true;
			  }
		  }
		  if (cardInList.getSuit().equals("Diamonds"))
		  {
			  int diamondsSize = foundation.spades.size();
			  if (cardInList.getRank() == diamondsSize + 1)
			  {
				  foundation.diamonds.add(card);
				  hasPlayed = true;
			  }
		  }
	  }

	  if (count == 1)
	  {
		  int size = tableau.Tableau1.size();
		  tableau.Tableau1.remove(size - 1);
		  try {
			  Card newCard = tableau.Tableau1.get(size-1);
			  newCard.setFaceUp(true);
		  }
		  catch(Exception NullPointerException)
		  {	  
		  }

	  }
	  else if (count == 2)
	  {
		  int size = tableau.Tableau2.size();
		  tableau.Tableau2.remove(size - 1);
		  try {
			  Card newCard = tableau.Tableau2.get(size-1);
			  newCard.setFaceUp(true);
		  }
		  catch(Exception NullPointerException)
		  {	  
		  }
	  }
	  else if (count == 3)
	  {
		  int size = tableau.Tableau3.size();
		  tableau.Tableau3.remove(size - 1);
		  try {
			  Card newCard = tableau.Tableau3.get(size-1);
			  newCard.setFaceUp(true);
		  }
		  catch(Exception NullPointerException)
		  {	  
		  }
	  }
	  else if (count == 4)
	  {
		  int size = tableau.Tableau4.size();
		  tableau.Tableau4.remove(size - 1);
		  try {
			  Card newCard = tableau.Tableau4.get(size-1);
			  newCard.setFaceUp(true);
		  }
		  catch(Exception NullPointerException)
		  {	  
		  }
	  }
	  else if (count == 5)
	  {
		  int size = tableau.Tableau5.size();
		  tableau.Tableau5.remove(size - 1);
		  try {
			  Card newCard = tableau.Tableau5.get(size-1);
			  newCard.setFaceUp(true);
		  }
		  catch(Exception NullPointerException)
		  {	  
		  }
	  }
	  else if (count == 6)
	  {
		  int size = tableau.Tableau6.size();
		  tableau.Tableau6.remove(size - 1);
		  try {
			  Card newCard = tableau.Tableau6.get(size-1);
			  newCard.setFaceUp(true);
		  }
		  catch(Exception NullPointerException)
		  {	  
		  }
	  }
	  else if (count == 7)
	  {
		  int size = tableau.Tableau7.size();
		  tableau.Tableau7.remove(size - 1);
		  try {
			  Card newCard = tableau.Tableau7.get(size-1);
			  newCard.setFaceUp(true);
		  }
		  catch(Exception NullPointerException)
		  {	  
		  }
	  }


  }
}