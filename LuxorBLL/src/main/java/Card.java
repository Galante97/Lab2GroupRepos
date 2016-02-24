
public class Card{
	private Suit suit;
	private Value value;
	
	public Card (Value val, Suit suitVal){
		suit=suitVal;
		value=val;
	}

	private Value getValue() {
		return value;
	}

	private Suit getSuit() {
		return suit;
	}
}
