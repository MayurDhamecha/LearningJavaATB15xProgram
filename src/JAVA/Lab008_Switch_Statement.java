package JAVA;

import java.util.Scanner;

public class Lab008_Switch_Statement {
    public static void main(String[] args) {

        Scanner userIntegerInput = new Scanner(System.in);
        System.out.print("Enter an integer number from 1 to 7 : ");

        if (userIntegerInput.hasNextInt()) {
            int dayValue = userIntegerInput.nextInt();
            switch (dayValue) {
                case 1 -> System.out.println("Day 1: Monday");
                case 2 -> System.out.println("Day 2: Tuesday");
                case 3 -> System.out.println("Day 3: Wednesday");
                case 4 -> System.out.println("Day 4: Thursday");
                case 5 -> System.out.println("Day 5: Friday");
                case 6 -> System.out.println("Day 6: Saturday");
                case 7 -> System.out.println("Day 7: Sunday");
                default -> System.out.println("Not entered integer value from 1 to 7, please enter value from 1 to 7");
            }
        }else{
            System.out.println("Invalid integer input, please add proper integer value");
        }
    }
}