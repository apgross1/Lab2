package pokerGame;

public class Card {
	private int rank;
	private int suite;
	
	
	public Card() {
		this.createCard();
	}
	
	protected int getRank() {
		return rank;
	}
	protected void setRank(int rank) {
		this.rank = rank;
	}
	protected int getSuite() {
		return suite;
	}
	protected void setSuite(int suite) {
		this.suite = suite;
	}
	
	protected void createCard() {
	}

}
