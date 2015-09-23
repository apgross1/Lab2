package pokerGame;

import java.util.ArrayList;
import java.util.Collections;

public class Hand extends Deck{
	private ArrayList<Card> hand = new ArrayList<Card>();
	
	public void setHand(Deck deck) {
		for (int i = 0; i < 5; i++) {
			Card a = deck.getDeck().get(i);
			this.hand.add(a);
			deck.getDeck().remove(0);
		}
		this.sortHand();
	}
	
	public ArrayList<Card> getHand() {
		return this.hand;
	}
	
	
	public void sortHand() {
		for (int i = 0; i < this.getHand().size(); i++)  {
			for (int j = i+1; j < this.getHand().size(); j++) {
				if (this.getHand().get(j).getRank() < this.getHand().get(i).getRank()) {
					Collections.swap(this.getHand(), i, j);
				}
				else
					continue;
			}
		}
	}
	
	private boolean isFlush() {
		int suit = this.getHand().get(0).getSuit();
		int count  = 0;
		for (int i = 1; i < 5; i++) {
			if (this.getHand().get(i).getSuit() == suit) {
				count += 1;
			}
			else
				continue;
		}
		if (count == 4) {
			return true;
		}
		else
			return false;
	}
	
	public boolean isRoyalFlush() {
		if (this.isFlush() == true) {
			if (this.getHand().get(0).getRank() == 10 & 
					this.getHand().get(1).getRank() == 11 &
					this.getHand().get(2).getRank() == 12 &
					this.getHand().get(3).getRank() == 13 &
					this.getHand().get(4).getRank() == 1) {
				return true;
			}
			else
				return false;
		}
		else
			return false;
	}
	
	public boolean isStraightFlush() {
		if (this.isFlush() == true & this.isRoyalFlush() == false) {
			if ((this.getHand().get(0).getRank() == this.getHand().get(1).getRank()-1) & 
					(this.getHand().get(1).getRank() == this.getHand().get(2).getRank()-1) &
					(this.getHand().get(2).getRank() == this.getHand().get(3).getRank()-1) &
					(this.getHand().get(3).getRank() == this.getHand().get(4).getRank()-1)) {
				return true;
			}
			else
				return false;
		}
		else
			return false;
	}
	
	

	//public static double scoreHand(Hand hand) {
		//ArrayList<Card> localHand = hand.getHand();
		
	//}
}
