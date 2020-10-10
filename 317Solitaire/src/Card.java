
public class Card 
{
 String suit;
 String number;
 int rank;
 boolean faceUp;
 String color;
 
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
 
 
 

public int getRank() {
	return rank;
}




public void setRank(int rank) {
	this.rank = rank;
}




public String getColor() {
	return color;
}



public void setColor(String color) {
	this.color = color;
}



public String getSuit() {
	return suit;
}

public void setSuit(String suit) {
	this.suit = suit;
}

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}


public boolean isFaceUp() {
	return faceUp;
}

public void setFaceUp(boolean faceUp) {
	this.faceUp = faceUp;
}

public String ToString()
{
	return number + " " + suit + "\n";
}
 
}
