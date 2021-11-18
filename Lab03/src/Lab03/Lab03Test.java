package Lab03;

public class Lab03Test {
	
	public static void main(String[] args) {
		
		Deck dk = new Deck();	
		dk.printDeck();
		dk.shuffle();
		dk.printDeck();
		
		Race rc = new Race();
		rc.run();
		
		
		TicTacToe ttt = new TicTacToe();
		ttt.play();
		
	}	
}
