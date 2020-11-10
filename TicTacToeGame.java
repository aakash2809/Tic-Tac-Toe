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

	// MAIN METHOD
	public static void main(String[] args) {
		System.out.println("       Welcome to Tic Tac Toe      ");
		System.out.println("---------------------------------------");
		// CALLING METHOD FOR THE PURPOSE OF UC1
		char[] intializedBoard = initializeBoard();
		// CALLING METHOD FOR THE PURPOSE OF UC2
		int userChoice = haveYourChoice1();
		if (userChoice == 1) {
			System.out.println("Computer choice is " + 'X');
		} else {
			System.out.println("Computer choice is " + 'O');

		}
	}

}

