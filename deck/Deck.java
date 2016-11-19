package deck;

public class Deck extends CardCollection {
	private static final long serialVersionUID = -2648756980316390380L;

	public Deck() {
		this.reset();
	}
	
	public void reset() {
		this.clear();
		this.addAllStandard();
		this.shuffle();
	}
}
