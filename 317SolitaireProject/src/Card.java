import java.util.ArrayList;

/**
 * @author rvang001
 *
 */
public class Card 
{
 String suit;
 String number;
 int rank;
 boolean faceUp;
 String color;
 ArrayList<Card> hasBeen = new ArrayList<>();
 
 public Card(String suit, String number, int rank)
 {
	 this.rank = rank;
	 this.suit = suit;
	 this.number = number;
	 this.faceUp = false;
	 if (suit.equals("Clubs")|| suit.equals("Spades"))
	 {
		 this.color = "Black";
	 }
	 else
	 {
		 this.color = "Red";
	 }
 }
 
 
 
/**
 * this method returns the rank of the card
 * @return
 */
public int getRank() {
	return rank;
}

public void hasBeen(Card card)
{
	hasBeen.add(card);
}

/**
 * this method takes an integer as a parameter and sets the card rank to the parameter received
 * @param rank
 */
public void setRank(int rank) {
	this.rank = rank;
}

public boolean equals(Card compare)
{
	if (this.rank == compare.getRank() && this.suit.equals(compare.getSuit()))
	{
		return true;
	}
	else
	{
		return false;
	}
		
}

/**
 * this method returns the color of the card in a string
 * @return
 */
public String getColor() {
	return color;
}


/**
 * this method sets the color of the card based on the parameter
 * @param color
 */
public void setColor(String color) {
	this.color = color;
}


/**
 * this method return the suit of the card
 * @return
 */
public String getSuit() {
	return suit;
}

/**
 * this method sets the suit of the card based on the paramter that it was passed
 * @param suit
 */
public void setSuit(String suit) {
	this.suit = suit;
}

/**
 * this method returns the rank of the card through a string
 * @return
 */
public String getNumber() {
	return number;
}

/**
 * this method sets the rank of a card in a string
 * @param number
 */
public void setNumber(String number) {
	this.number = number;
}

/**
 * this method return a boolean if the card is faced up
 * @return
 */
public boolean isFaceUp() {
	return faceUp;
}

/**
 * this method takes a boolean as a parameter, and sets the card face up based on the boolean
 * @param faceUp
 */
public void setFaceUp(boolean faceUp) {
	this.faceUp = faceUp;
}

/**
 * this method returns a string of what the card is
 * @return
 */

public String ToString()
{
	return number + " " + suit + " rank: " + rank +  " faceUp: " + faceUp + "\n";
}
 
}