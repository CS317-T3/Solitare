import java.util.ArrayList;

public class PlayField 
{
Waste waste;
Tableau tableau;
Foundation foundation;
boolean hasPlayed = false;
boolean stop = false;
int count = 0;
  public PlayField(Deck deck)
  {
	  this.waste = new Waste(deck);
	  this.tableau = new Tableau(deck, waste);
	  this.foundation = new Foundation(deck);
  }

  /**
   * this method sets up the playing field. It puts cards in the tableaus and puts the rest in the waste
   */
  public void setUp()
  {
	  tableau.setUp();
	  waste.setUp();
  }

  /**
   * this method draws a card from the waste before the game is in play
   */
  public void draw()
  {
	  waste.draw();
	 
  }
  
  /**
   * used to draw the card, when the games starts
   */
  public void draw2()
  {
	 Card card = waste.wasteFaceDown.removeLast();
	 waste.wasteFaceUp.push(card);
	
  }

  /**
   * this method sees if a card from the waste or from a tableau can be played.
   * if it goes through the waste three times without playing a card then the game is lost
   */
  public void playCard()
  {
	  //System.out.println("Count: " + count);
	  
	  if (!waste.wasteFaceUp.isEmpty() && !waste.wasteFaceDown.isEmpty())
	  {
		  

	  Card card = waste.playCard();
	  int canPlay = tableau.canPlay(card);
	  tableau.playCard(card, canPlay);
	  if (canPlay != 0)
	  {
		  waste.wasteFaceUp.pop();
	  }
	  }
	  else
	  {
		  
		  if (hasPlayed == false)
		  {
			  if (count == 3)
			  {
				  stop = true;
			  }
			  else if(count == 1 || count == 2)
			  {
				  boolean check = tableau.priority();
				  if (check == true)
				  {
					  hasPlayed = true;
				  }
			  }
			  else
			  {
				  count++;
				 
				 //System.out.println("Size of waste: " + waste.wasteFaceUp.size());
			  }
		  }
		  if (hasPlayed == true)
		  {
			  count = 0;
			  hasPlayed = false;
		  }
		  waste.wasteFaceDown.addAll(waste.wasteFaceUp);
		  waste.wasteFaceUp.removeAllElements();
//		  for(int i = 0; i < waste.wasteFaceUp.size(); i ++)
//		  {			  
//			  waste.wasteFaceDown.push(waste.wasteFaceUp.pop());
//
//			  
//			  //System.out.println("Moving face up to face down");
//		  }
	  }
  }

  /**
   * This method sees if the card in the waste can be moved to the foundation.
   * After, it goes through the tableaus and sees if any of the cards at the bottom of the stack can be moved to the foundation
   */
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
		  System.out.println("THIS IS THE SPADES SIZE: " + spadesSize);
		 
		  if (spadesSize == 0)
		  {
			  if (card.getRank() == 1)
			  {
				  foundation.spades.add(card);
				  waste.wasteFaceUp.pop();
				  hasPlayed = true;
			  }
		  } 
		  else if  (spadesSize > 0 && card.getRank() == spadesSize + 1)
		  {
		 
			  foundation.spades.add(card);
			  try
			  {
			  waste.wasteFaceUp.pop();
			  }
			  catch(Exception StackEmptyException)
			  {
				  
			  }
			  hasPlayed = true;
		  
		  }
		  }
	  
	  else if (card.getSuit().equals("Clubs"))
	  {
		  int clubsSize = foundation.clubs.size();
		  System.out.println("THIS IS THE CLUBS SIZE: " + clubsSize);
		  
		  if (clubsSize == 0)
		  {
			  if (card.getRank() == 1)
			  {
				  foundation.clubs.add(card);
				  waste.wasteFaceUp.pop();
				  hasPlayed = true;
			  }
		  }
		  else if (clubsSize > 0 && card.getRank() == clubsSize +1)
		  {
			  
		  
		
			  foundation.clubs.add(card);
			  waste.wasteFaceUp.pop();
			  hasPlayed = true;
		  
		  }
		  
	  }
	  else if (card.getSuit().equals("Hearts"))
	  {
		  
		  int heartsSize = foundation.hearts.size();
		  System.out.println("THIS IS THE HEARTS SIZE: " + heartsSize);
		 
		  if (heartsSize == 0)
		  {
			  if (card.getRank() == 1)
			  {
				  foundation.hearts.add(card);
				  waste.wasteFaceUp.pop();
				  hasPlayed = true;
			  }
		  }
		  else if (heartsSize > 0 && card.getRank() == heartsSize + 1)
		  {
		  
		  
			  foundation.hearts.add(card);
			  waste.wasteFaceUp.pop();
			  hasPlayed = true;
		  
		  }
		  
	  }
	  else if (card.getSuit().equals("Diamonds"))
	  {
		  int diamondsSize = foundation.diamonds.size();
		  System.out.println("THIS IS THE DIAMONDS SIZE: " + diamondsSize);
		 
		  if (diamondsSize == 0)
		  {
			  if (card.getRank() == 1)
			  {
				  foundation.diamonds.add(card);
				  waste.wasteFaceUp.pop();
				  hasPlayed = true;
			  }
		  }
		  else if (diamondsSize > 0 && card.getRank() == diamondsSize +1)
		  {
		 
			  foundation.diamonds.add(card);
			  waste.wasteFaceUp.pop();
			  hasPlayed = true;
		  
		  }
		  
	  }

	  Card card2;
	  for(int i = 0; i < tableau.Tableaus.size(); i++)
	  {
		  int tabSize = tableau.Tableaus.get(i).size();
		  if(tableau.Tableaus.get(i).size() >= 1)
		  {
			  card2 = tableau.Tableaus.get(i).get(tabSize - 1);
		  }
		  else
		  {
			  card2 = new Card("Spades", "300", 300);
		  }
		  if (card2.getSuit().equals("Spades"))
		  {
			  int spadesSize = foundation.spades.size();
			  if (card2.getRank() == spadesSize + 1)
			  {
				  foundation.spades.add(card2);
				  hasPlayed = true;
				  tableau.Tableaus.get(i).remove(card2);
			  }
		  }
		  if (card2.getSuit().equals("Clubs"))
		  {
			  int clubsSize = foundation.clubs.size();
			  if (card2.getRank() == clubsSize + 1)
			  {
				  foundation.clubs.add(card2);
				  hasPlayed = true;
				  tableau.Tableaus.get(i).remove(card2);
			  }
		  }
		  if (card2.getSuit().equals("Hearts"))
		  {
			  int heartsSize = foundation.hearts.size();
			  if (card2.getRank() == heartsSize + 1)
			  {
				  foundation.hearts.add(card2);
				  hasPlayed = true;
				  tableau.Tableaus.get(i).remove(card2);
			  }
		  }
		  if (card2.getSuit().equals("Diamonds"))
		  {
			  int diamondsSize = foundation.diamonds.size();
			  if (card2.getRank() == diamondsSize + 1)
			  {
				  foundation.diamonds.add(card2);
				  hasPlayed = true;
				  tableau.Tableaus.get(i).remove(card2);
			  }
		  }
	  }


  }
}