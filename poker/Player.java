package poker;

public class Player {
	private String name;
	private Hand hand;
	
	public Player(String name) {
		this.name = name;
		this.hand = new Hand();
	}
	
	public Hand getHand() {
		return this.hand;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void printName() {
		System.out.println(this.name);
	}
	
	public void showHand() {
		System.out.printf("Showing %s's hand:\n", this.name);
		this.hand.print();
	}
}
