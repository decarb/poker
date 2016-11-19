package deck;

import java.util.*;

public class CardCollection extends ArrayList<Card> {
	private static final long serialVersionUID = -233632531271122467L;
	
	public void print() {
		for (Card c : this) {
			c.print();
		}
		
		System.out.println();
	}
	
	public void shuffle() {
		Collections.shuffle(this);
	}
	
	public void addAllStandard() {
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				Card card = new Card(s, r);
				this.add(card);
			}
		}
	}
	
	public Card pop() {
		return this.remove(0);
	}
	
	public CardCollection pop(int num) {
		CardCollection dealt = new CardCollection();
		
		for (int i = 0; i < num; i++) {
			dealt.add(this.pop());
		}
		
		return dealt;
	}
}
