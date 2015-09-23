package pokerGame;

public class Card {
	private int rank;
	private int suit;
	
	
	public Card() {
		this.createCard();
	}
	
	protected int getRank() {
		return rank;
	}
	protected void setRank(int rank) {
		this.rank = rank;
	}
	protected int getSuit() {
		return suit;
	}
	protected void setSuit(int suit) {
		this.suit = suit;
	}
	
	protected void createCard() {
	}

}
