package pokerGame;

import java.util.ArrayList;
import java.util.Collections;

public class Deck extends Card {
	private ArrayList<Card> deck = new ArrayList<Card>();
	
	public Deck() {
		this.setDeck(makeDeck());
		this.shuffleDeck(this.getDeck());
	}
	
	public ArrayList<Card> makeDeck() {
		ArrayList<Card> cardList = new ArrayList<Card>();
		for (int j = 0; j < 13; j++) {
			for (int k = 0; k < 4; k++) {
				Card card = new Card();
				card.setSuite(k);
				card.setRank(j);
				cardList.add(card);	
			}
		}
		return cardList;
	}
	
	public void shuffleDeck(ArrayList<Card> deck) {
		Collections.shuffle(deck);
	}
	
	public ArrayList<Card> getDeck() {
		return deck;
	}
	public void setDeck(ArrayList<Card> decks) {
		deck = decks;
	}
}

