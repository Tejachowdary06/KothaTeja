package com.consolebasedapp;

import java.util.Scanner;

public class Tic_Tok_Tic {
	static char player = 'X';

	static Scanner sc = new Scanner(System.in);

	static char[][] arr = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

	public static void main(String[] args) {
		board(arr);

		while (true) {

			play();

			if (checkWinner()) {
				board(arr);
				System.out.println("Player " + player + " Wins!");
				break;
			}

			if (isBoardFull()) {
				board(arr);
				System.out.println("Match Draw!");
				break;
			}

			changePlayer();
		}

	}

	static boolean checkWinner() {

		for (int i = 0; i < 3; i++) {

			if (arr[i][0] == player && arr[i][1] == player && arr[i][2] == player) {

				return true;
			}
		}

		for (int i = 0; i < 3; i++) {

			if (arr[0][i] == player && arr[1][i] == player && arr[2][i] == player) {

				return true;
			}
		}

		if (arr[0][0] == player && arr[1][1] == player && arr[2][2] == player) {

			return true;
		}

		if (arr[0][2] == player && arr[1][1] == player && arr[2][0] == player) {

			return true;
		}

		return false;
	}

	static void changePlayer() {
		if (player == 'X') {
			player = 'O';
		} else {
			player = 'X';
		}

	}

	static boolean isBoardFull() {

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (arr[i][j] == ' ') {

					return false;
				}
			}
		}

		return true;
	}

	static void board(char[][] arr) {
		System.out.println("-----------");
		for (int i = 0; i < 3; i++) {
			System.out.print("|");
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " |");
			}
			System.out.println();
			System.out.println("-----------");
		}
	}

	static void play() {
		System.out.println("Player choice");
		System.out.println("Current player : "+player);
		System.out.println("Enter row : ");
		int row = sc.nextInt();
		System.out.println("Enter colunm : ");
		int col = sc.nextInt();

		if (row >= 0 && row < 3 && col >= 0 && col < 3) {
			if (arr[row][col] == ' ') {
				arr[row][col] = player;
			} else {
				System.out.println("Already Occupaid");
			}
		} else {
			System.out.println("Invalid Position");

		}

		board(arr);
	}

}
