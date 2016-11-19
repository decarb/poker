package deck;

public class Card {
	private Suit suit;
	private Rank rank;
	
	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public void print() {
		System.out.println(rank.toString() + " of " + suit.toString());
	}
	
	public String toString() {
		return rank.toString() + " of " + suit.toString();
	}
}
