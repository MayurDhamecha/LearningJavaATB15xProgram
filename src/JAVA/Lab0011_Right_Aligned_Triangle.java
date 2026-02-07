package JAVA;

import java.util.Scanner;

public class Lab0011_Right_Aligned_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for n pattern : ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int space = 0; space < n-i-1; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star <=i ; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
