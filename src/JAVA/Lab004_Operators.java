package JAVA;

public class Lab004_Operators {
    public static void main(String[] args) {
        // Operational operator
        int a = 10;
        System.out.println("Int a variable value is : " + a);

        // Unary Operators
        int b = -10;
        System.out.println(b);

        // Modulus Operators
        int c = 20, d = 10;
        System.out.println(c%d);

        // Arithmetic Operators
        int e = 10, f = 3;
        int sum = e + f;
        int sub = e - f;
        int mul = e * f;
        int div = e / f;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);

        // Relational Operators
        int g = 10;
        int h = 3;
        int i = 5;
        System.out.println("a > b: " + (g > h));
        System.out.println("a < b: " + (g < h));
        System.out.println("a >= b: " + (g >= h));
        System.out.println("a <= b: " + (g <= h));
        System.out.println("a == c: " + (g == i));
        System.out.println("a != c: " + (g != i));

        // Logical Operators
        boolean localLogicalOperator= true;
        System.out.println(localLogicalOperator);
        System.out.println(!localLogicalOperator);
        System.out.println(!!localLogicalOperator);
    }
}