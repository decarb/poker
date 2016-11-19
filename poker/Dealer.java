package poker;

import deck.*;

public class Dealer {
	private Deck deck;
	
	public Dealer() {
		this.deck = new Deck();
		this.deck.shuffle();
	}
	
	public void showDeck() {
		this.deck.print();
	}
	
	public void deal(CardCollection c) {
		c.add(this.deck.pop());
	}
	
	public void deal(CardCollection c, int num) {
		c.addAll(this.deck.pop(num));
	}
	
	public void resetDeck() {
		this.deck.reset();
	}
	
	public static void main(String args[]) {
		Dealer fred = new Dealer();
		Player me = new Player("Devin");
		Community thisShit = new Community();
		
		fred.deal(me.getHand(), 2);
		fred.deal(thisShit, 3);
		
		me.showHand();
		thisShit.print();
	}
}
