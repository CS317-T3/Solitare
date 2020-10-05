
public class Card 
{
 String suit;
 String number;
 
 public Card(String suit, String number)
 {
	 this.suit = suit;
	 this.number = number;
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

public String ToString()
{
	return number + " " + suit + "\n";
}
 
}
