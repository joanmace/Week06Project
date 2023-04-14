package Week06;

public class App {
//this is the main method 
	public static void main(String[] args) {
		//2a. instantiate a deck and two players, call shuffle on deck
		// creating new deck to start game
		//two players will be bob and ross
Player playerOne = new Player("Bob");
Player playerTwo = new Player("Ross");
Deck deck = new Deck();
deck.shuffle();

//using for loop iterate 52 times calling draw method on other player each iterTION 
// i then use for loop to iterate 26 times each player which is 52 times total 
for(int i = 1; i <= 26; i++) {
	playerOne.hand.add(deck.draw()); // they are drawing from deck every iteration 
	playerTwo.hand.add(deck.draw());
}
playerOne.describe();
playerTwo.describe();
// after they draw the card will be shown(described)
//2c. usin for loop iterate 26 times and call slip method for each player
for(int i = 1; i < 26; i++) {
	Card playerOneCard = playerOne.flip();
	Card playerTwoCard = playerTwo.flip();
 // compare value of each card returned by players flips and call increment score on player
// whose card has higher score
//2e. after loop compare final scores 
if(playerOneCard.getcardValue() > playerTwoCard.getcardValue()) {
	playerOne.incrementScore();
}else if (playerOneCard.getcardValue() < playerTwoCard.getcardValue()) {
	playerTwo.incrementScore();
} else {
	System.out.println();
}
}
//2f. print final score of each player and either player1 or player2 or draw

if(playerOne.score > playerTwo.score) {
	System.out.println("Bob" + " is the winner!");
	System.out.println("With a score of " + playerOne.score + " to " + playerTwo.score + ".");
}else if(playerTwo.score > playerOne.score) {
	System.out.println("Ross" + " is the winner!");
	System.out.println("With a score of " + playerTwo.score + " to " + playerOne.score + ".");
} else { 
	System.out.println("Draw");
}





	}

}
