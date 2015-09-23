package pokerGame;

public class Card {
	private int rank;
	private int suite;
	
	
	public Card() {
		this.createCard();
	}
	
	public int getRank() {
		return rank;
	}
	private void setRank(int rank) {
		this.rank = rank;
	}
	public int getSuite() {
		return suite;
	}
	private void setSuite(int suite) {
		this.suite = suite;
	}
	//Creates random Rank and Suite values for instance of Card
	private void createCard() {
		this.setRank((int) (1 + Math.random() * 14));
		this.setSuite((int) (1 + Math.random() * 4));
	}
}
