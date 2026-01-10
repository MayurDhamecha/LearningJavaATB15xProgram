package JAVA;

import java.util.Random;
import java.util.Scanner;

public class Lab009_While_Loop_Guessing_Attempt_Game {
    public static void main(String[] args) {

        Random randomNumber = new Random();
        int numberToGuess = randomNumber.nextInt(100);

        Scanner userNumberInput = new Scanner(System.in);
        System.out.println("Enter an integer number from 1 to 100 : ");
        int guessCount;
        int attemptsCount = 0;
        while (true) {
            if (!userNumberInput.hasNextInt()) {
                System.out.println("Invalid input, Please enter an integer number only!");
                userNumberInput.next();
                continue;
            }

            guessCount = userNumberInput.nextInt();
            attemptsCount ++;
            if (guessCount < numberToGuess) {
                System.out.println("Given number is too low, try again!");
            }else if (guessCount > numberToGuess) {
                System.out.println("Given number is too high, try again!");
            }else{
                System.out.println("Correct!, You guessed the correct number after " + attemptsCount + " attempts!");
                break;
            }
        }
    }
}