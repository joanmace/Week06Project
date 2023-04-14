package Week06;

import java.util.ArrayList;
import java.util.List;

public class Player {
	// creating hand of cards
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	public Player(String name) {
		this.name= name;
		this.score = 0;
	}
//1c. describe player and hand drawn 
	public void describe() {
		System.out.println(name + " has the following cards: ");
		for(Card card : hand) {
	card.describe();
		}
		//spaces to separate each player
		System.out.println("       ");
	}
	 // 1c. flip (removes and returns top card)
	public Card flip() {
		Card drawnTopCard = hand.get(0);
		hand.remove(0);
		return drawnTopCard;
	}
	//1c. draw ( takes deck argument and calls the draw method to deck, adding the returned card to deck)
	public void draw (Deck deck) {
		Card card = deck.draw();
		hand.add(card);
	}
	//1c. increment score(adds 1 to players score and keeps track so we cna see at bottom)
	public void incrementScore() {
		this.score++;
	}
	public int getScore() {
		return score;
	}
	
	
}
