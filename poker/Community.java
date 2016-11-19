package poker;

import deck.*;

public class Community extends CardCollection {
	private static final long serialVersionUID = 7956742926935969484L;
	
	public void print() {
		System.out.println("The community contains:");
		super.print();
	}
}
