package Week06;

public class Card {
//1.a new class card 
	
	//Assign values to each card.
	public static final int Two = 2;
	public static final int Three = 3;
	public static final int Four = 4;
	public static final int Five = 5;
	public static final int Six = 6;
	public static final int Seven = 7;
	public static final int Eight = 8;
	public static final int Nine = 9;
	public static final int Ten = 10;
	public static final int Jack = 11;
	public static final int Queen = 12;
	public static final int King = 13;
	public static final int Ace = 14;
	//integers for each suit
	public static final int Clubs = 0;
	public static final int Dimonds = 1;
	public static final int Hearts = 2;
	public static final int Spades = 3; 
	
	
	private int cardName;
	private int cardValue; 
	
	public Card(int cardName, int cardValue) {
		this.setCardName(cardName);
		this.setCardValue(cardValue);
	}
	private void setCardName(int newCardName) {
		if(newCardName >= 0 && newCardName <= 3) {
			this.cardName = newCardName;
		}
	}
	private void setCardValue(int newCardValue) {
		if(newCardValue < 2 || newCardValue > 14) {
			
		} this.cardValue = newCardValue;
	}
	public int getcardName() {
		return cardName;
	}
	public int getcardValue() {
		return cardValue;
	}
	public String toString() {
		String card = "";
		
		// if/ifelse statement 
		if(cardValue == 2) {
			card += "2";
			} else if(cardValue ==3) {
				card += "3"; 
			} else if (cardValue == 4) {
				card += "4";
			}else if(cardValue == 5) {
				card += "5";
			} else if(cardValue == 6) { 
				card += "6"; 
			}else if(cardValue == 7) { 
				card += "7"; 
			}else if(cardValue == 8) {
				card += "8";
			}else if(cardValue == 9) {
				card += "9";
			}else if(cardValue == 10) {
				card += "10";
			}else if(cardValue == Jack) {
				card += "Jack";
			}else if(cardValue == Queen) {
				card += "Queen";
			}else if(cardValue == King) {
				card += "King";
			} else if(cardValue == Ace) {
				card += "Ace";
			} else { 
				card += cardValue;
			}
		
		card += " of ";
		if(cardName == Clubs) {
			card += "Clubs";
		} else if(cardName == Dimonds) {
			card += "Dimonds";
		}else if(cardName == Spades) {
			card += "Spades";
		}
		return card; 
		}
	//methods: prints out info about a card
	public void describe() {
		System.out.println(this.toString());
	}
	
}
