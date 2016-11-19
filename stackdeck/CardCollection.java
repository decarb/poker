package stackdeck;

import java.util.Collections;
import java.util.Stack;
import deck.Card;
import deck.Rank;
import deck.Suit;

public class CardCollection extends Stack<Card> {
	private static final long serialVersionUID = 1L;
	
	public void print() {
		for (Card c : this) {
			System.out.println(c.toString());
		}
		
		System.out.println();
	}
	
	public void shuffle() {
		Collections.shuffle(this);
	}
	
	public void addAll() {
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				Card c = new Card(s, r);
				
				this.push(c);
			}
		}
	}
	
	public CardCollection pop(int num) {
		CardCollection out = new CardCollection();
		
		for (int i = 0; i < num; i++) {
			if (!this.isEmpty()) out.push(this.pop());
			else break;
		}
		
		return out;
	}
	
	public static void main(String[] args) {
		CardCollection c = new CardCollection();
		c.addAll();
		
		CardCollection d = new CardCollection();
		d = c.pop(5);
		
		d.print();
		System.out.println();
	}
}
