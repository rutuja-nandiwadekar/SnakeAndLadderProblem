package com.bridgelabz;

public class SnakeAndLadder {

	public static void main(String[] args) {
		
		System.out.print("Welcome to Snake and Ladder Problem");

		int ladder = 1;
		int snake = 2;
		int movesAhead;
		int movesBehind;

		// single player at start position 0
		int position = 0;
		System.out.println("player position is = " + position);

		// Player rolls the dice to get a number between 1 to 6
		int value;
		double rand = Math.random();
		value = (int) (1 + rand * 6);
		System.out.println("Dice number is = " + value);

		// The Player then checks for a Option
		int option;
		option = (int) (rand * 3);
		System.out.println("Option is = " + option);

		if (option == ladder) {
			movesAhead = (value + position);
			System.out.println("Player moves ahead by the " + movesAhead);
		} else if (option == snake) {
			movesBehind = (value - position);
			System.out.println("Player moves behind by the " + movesBehind);
		} else
			System.out.println("No Play. The player stays in the same position");
	}
}
