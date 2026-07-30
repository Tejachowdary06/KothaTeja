package com.logicalstatement;

import java.util.Scanner;

public class RandomNumbers {

    static Scanner sc = new Scanner(System.in);
    static int randomNumber;

    static void showHint() {
        System.out.println("\n********************************");
        System.out.println(" The Random Number Was : " + randomNumber);
        System.out.println("********************************");
    }

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("      RANDOM NUMBER GUESS GAME");
        System.out.println("======================================");

        char playAgain;

        do {

            randomNumber = (int) (Math.random() * 30) + 1;

            int chances = 3;
            boolean isWon = false;

            System.out.println("\nGuess a number between 1 and 30");
            System.out.println("You have only 3 chances.");

            while (chances > 0) {

                System.out.println("\n--------------------------------");
                System.out.println("Remaining Chances : " + chances);
                System.out.print("Enter Your Guess : ");

                int guess = sc.nextInt();

                if (guess == randomNumber) {

                    System.out.println("\n🎉 CONGRATULATIONS!");
                    System.out.println("You guessed the correct number.");
                    isWon = true;
                    break;

                } else if (guess > randomNumber) {

                    System.out.println("❌ Too High!");
                    System.out.println("Try a Smaller Number.");

                } else {

                    System.out.println("❌ Too Low!");
                    System.out.println("Try a Greater Number.");
                }

                chances--;
            }

            if (!isWon) {

                System.out.println("\n================================");
                System.out.println("        GAME OVER");
                System.out.println("================================");

                System.out.print("Do you want to see the Random Number (Y/N)? : ");
                char hint = sc.next().charAt(0);

                if (Character.toLowerCase(hint) == 'y') {
                    showHint();
                }
            }

            System.out.print("\nDo you want to play again (Y/N)? : ");
            playAgain = sc.next().charAt(0);

        } while (Character.toLowerCase(playAgain) == 'y');

        System.out.println("\n================================");
        System.out.println(" Thanks For Playing 😊");
        System.out.println("================================");

        sc.close();
    }
}