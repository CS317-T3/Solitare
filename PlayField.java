
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
}
