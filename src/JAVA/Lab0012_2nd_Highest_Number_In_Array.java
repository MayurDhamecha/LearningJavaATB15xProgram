package JAVA;

public class Lab0012_2nd_Highest_Number_In_Array {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 23, 89, 45, 89};
        int highestNumber = 0;
        int secondHighestNumber = 0;

        for (int num: numbers){
            if(num > highestNumber){
                secondHighestNumber = highestNumber;
                highestNumber = num;
            }else if (num > secondHighestNumber && num != highestNumber){
                secondHighestNumber = num;
            }
        }
        System.out.println(secondHighestNumber);
    }
}