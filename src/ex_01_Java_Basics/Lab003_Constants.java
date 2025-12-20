package ex_01_Java_Basics;

public class Lab003_Constants {
    public static void main(String[] args) {
        int a = 10;
        a = 20;
        System.out.println("Int a variable value is : " + a);
        final int b = 30;
        // b = 40;  --  Error shows - java: cannot assign a value to final variable b
        System.out.println("Int b variable value is : " + b);
    }
}