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

	// have your choice
	public static int haveYourChoice1() {

		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice either O OR X  : ");
		System.out.println("for termination press : T");
		char option = sc.next().charAt(0);

		while (true) {

			switch (option) {
			case 'O':
				result = 1;
				return result;
			case 'X':
				result = 0;
				return result;
			case 'T':
				System.exit(1);

			default:
				System.out.println("wrong choice");

			}

		}

	}

	// UC3 : SHOW THE CURRENT BOARD
	public static void showBoard(char[] board) {
		System.out.println("|---|---|---|");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("|---|---|---|");
	}

	// UC4 : CHECK PLACE IS AVAILABLE TO INSERT OR NOT
	public static void checkAvalabilityAndInsert(char[] board) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter positon where you want to insert");
		int position = sc.nextInt();
		if (board[position] == 32 && position > 0 && position < board.length) {
			System.out.println("available");
		} else {
			System.out.println("occupied");
		}

	}

	// MAIN METHOD
	public static void main(String[] args) {
		System.out.println("       Welcome to Tic Tac Toe      ");
		System.out.println("---------------------------------------");
		// CALLING METHOD FOR THE PURPOSE OF UC1
		char[] intializedBoard = initializeBoard();
		// CALLING METHOD FOR THE PURPOSE OF UC2
		int userChoice = haveYourChoice1();
		if (userChoice == 0) {
			System.out.println("Computer choice is " + 'X');
		} else {
			System.out.println("Computer choice is " + 'O');

		}
		// CALLING METHOD FOR THE PURPOSE OF UC3
		showBoard(intializedBoard);
		// CALLING METHOD FOR THE PURPOSE OF UC4
		checkAvalabilityAndInsert(intializedBoard);
	}

}
