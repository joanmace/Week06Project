package Week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
//1b. creating a list of cards
	List<Card> deck = new ArrayList<Card>();
	//1b. creating a shuffle to shuffle deck of cards
	public void shuffle() {
		Collections.shuffle(deck);
	}
	//1b. creating a method to draw a card
	public Card playCard() {
		Card playedCard = this.deck.get(0);
		this.deck.remove(0);
		return playedCard;
	}
	//1b new deck method
	public Deck() {
		for(int k = 2; k <= 14; k++) {
			for(int i = 0; i < 4; i++) { 
			deck.add(new Card(i, k));
		}
	}
	}

//getting cards and setting the order after shuffling
public List<Card> getCards(){
	return deck;
}
public void setCards(List<Card> deck) {
	this.deck = deck;
}
//new draw takes place
public Card draw() {
	if(deck.isEmpty()) {
		System.out.println("No more cards.");
		return null;
	}else {
		Card drawnTopCard = deck.get(0);
		deck.remove(0);
		return drawnTopCard;
	}
}
}
