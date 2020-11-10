import java.util.Scanner;

public class TicTacToeGame {
	// INITIALIZATION GAME BOARD
	public static char[] initializeBoard() {
		char[] gameBoard = new char[10];
		for (int index = 1; index < gameBoard.length; index++) {
			gameBoard[index] = ' ';
		}
		return gameBoard;

	}

	// MAIN METHOD
	public static void main(String[] args) {
		System.out.println("       Welcome to Tic Tac Toe      ");
		System.out.println("---------------------------------------");
		// CALLING METHOD FOR THE PURPOSE OF UC1
		char[] intializedBoard = initializeBoard();

	}

}
