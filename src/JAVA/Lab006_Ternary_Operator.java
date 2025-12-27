package JAVA;

public class Lab006_Ternary_Operator {
    public static void main(String[] args) {

        // Find positive or negative number from the given number input using ternary operator
        int input_Number = 5;
        String resultOfNumber = input_Number > 0 ? "Positive Number" : "Negative Number";
        System.out.println(resultOfNumber);

        // Allow to go GOA and drink as per given person's age input
        int age_Of_Person = 21;
        String result_Of_Person_Age = age_Of_Person > 18 ? (age_Of_Person > 25 ? "You can drink" : "You can't drink") : "No you can't go to GOA";
        System.out.println(result_Of_Person_Age);

        // Find the maximum and minimum number from the given input numbers
        int first_Number = 10;
        int second_Number = 20;
        int maximum_Number = first_Number > second_Number ? first_Number : second_Number;
        int minimum_Number = first_Number > second_Number ? second_Number : first_Number;
        System.out.println(maximum_Number);
        System.out.println(minimum_Number);

        // Find the even or odd from the given input number
        int number_Input = 13;
        String result_Of_Even_Odd = (number_Input % 2 == 0) ? "It's even number" : "It's odd number";
        System.out.println(result_Of_Even_Odd);

        // Find the student is pass or fail from the input marks
        int input_Marks = 30;
        String result_From_Given_Marks  = (input_Marks >= 40) ? "Student is PASS" : "Student is FAIL";
        System.out.println(result_From_Given_Marks);

        // Find the minimum and maximum number from the given inputs
        int number1_Input = 7;
        int number2_Input = 9;
        int number3_Input = -11;

        int result_Of_Maximum_Number = number1_Input > number2_Input ? (number1_Input > number3_Input ? number1_Input : number3_Input) : (number2_Input > number3_Input ? number2_Input : number3_Input);
        System.out.println("Maximum number from the given inputs is: " + result_Of_Maximum_Number);

    }
}
