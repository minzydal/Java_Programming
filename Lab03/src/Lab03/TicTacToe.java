package Lab03;
import java.util.Scanner;

public class TicTacToe {
	private final int BOARDSIZE = 3;
	private enum Status {WIN, DRAW, CONTINUE};
	private char[][] board;
	private boolean firstPlayer;
	private boolean gameOver;
	
	public TicTacToe() {	
		board = new char[ BOARDSIZE ][ BOARDSIZE ];
		firstPlayer = true;
		gameOver = false;
	}

	public void play() {
		Scanner input = new Scanner(System.in);
		int row; // row for next move
		int column; // column for next move
		
		System.out.println("Player X's turn.");
		
		while ( !gameOver )
		{
			char player = (firstPlayer ? 'X' : 'O');
			do {
				System.out.printf("Player %c : Enter row(0, 1 or 2) : ", player );
				row = input.nextInt();
				System.out.printf("Player %c : Enter COLUMN(0, 1 or 2) : ", player );
				column = input.nextInt();
			} while ( !validMove (row, column) );
			board [ row ][ column ] = player;
			firstPlayer = !firstPlayer;
			printBoard();
			printStatus( player );
			}	//end while
		input.close();
	}	//end method play
		//show game status in status bar
	
	
	private void printStatus( int player ) {
		Status status = gameStatus();
		
		//check game status
		switch ( status )
		{
		case WIN:
			System.out.printf(" Player %c wins ", player);
			gameOver = true;
			break;
		case DRAW:
			System.out.println(" Game is a draw.");
			gameOver = true;
			break;
		case CONTINUE:
			if( player == 'X')
				System.out.println("Player O's turn.");
			else
				System.out.println("Player X's turn.");
			break;
		}
	}
	
	private Status gameStatus() {
		
		int a;
		
		if( board[ 0 ][ 0 ] != 0 && board[ 0 ][ 0 ] == board[ 1 ][ 1 ] &&
			board[ 0 ][ 0 ] == board[ 2 ][ 2 ] )
			return Status.WIN;
		
		else if ( board[ 2 ][ 0 ] != 0 && board[ 2 ][ 0 ] == 
				board[ 1 ][ 1 ] && board[ 2 ][ 0 ] == board[ 0 ][ 2 ] )
			return Status.WIN;
		
		for ( a = 0; a < 3; a++ )
			if( board[ a ][ 0 ] != 0 && board[ a ][ 0 ] == board[ a ][ 1 ] &&
				board[ a ][ 0 ] == board[ a ][ 2 ] )
			return Status.WIN;
		
		for ( a = 0; a < 3; a++ )
			if( board[ 0 ][ a ] != 0 && board[ 0 ][ a ] == board[ 1 ][ a ] &&
				board[ 0 ][ a ] == board[ 2 ][ a ] )
			return Status.WIN;
		
		for (int r = 0; r < 3; r++ )
			for( int c = 0; c < 3; c++)
			if( board[ r ][ c ] == 0 )
			return Status.CONTINUE;
		
		return Status.DRAW;	
	}

	
	public void printBoard() {
		
		System.out.println("________________________");
		
		for ( int row = 0; row < BOARDSIZE; row++ ) {
			
			System.out.println("|       |       |       |");
			
			for(int column = 0; column < BOARDSIZE; column++)
				printSymbol (column, board[ row ][ column ]);
			
			System.out.println("|_______|_______|_______|");
		}	
	}
	
	
	public void printSymbol(int column, char value) {
		System.out.printf("|   %c   ", value);
		
		if(column == 2)
			System.out.println("|");
	}	// end method printSymbol
	
	
	//validate move
	private boolean validMove( int row, int column ) {
		return row >= 0 && row < 3 && column >=0 && column < 3 &&
				board[ row ][ column ] == 0;
	}	//end method validMove
}	//end class TicTacToe
	
	

