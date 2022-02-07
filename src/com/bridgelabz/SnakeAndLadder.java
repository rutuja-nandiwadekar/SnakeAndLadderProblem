package com.bridgelabz;

public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.print("Welcome to Snake and Ladder Problem");
		
		int position = 0;
		System.out.println("player position is = " + position);
		
		int value;
        double rand = Math.random();
        value = (int) (1 + rand * 6);

        System.out.println("Dice number is = " + value);
	}
}
