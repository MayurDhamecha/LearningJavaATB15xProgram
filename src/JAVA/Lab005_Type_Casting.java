package JAVA;

public class Lab005_Type_Casting {
    public static void main(String[] args) {
        int course_Fees = 1500;
        float applied_GST = 12.45f;

        // int total_Course_Fees1 = course_Fees + applied_GST; // Narrowing type casting with Implicitly
        int total_Course_Fees2 = course_Fees + (int)applied_GST; // Narrowing type casting with Explicitly
        System.out.println(total_Course_Fees2);

        float total_Course_Fees3 = course_Fees + applied_GST; // Widening type casting with Implicitly
        System.out.println(total_Course_Fees3);
        float total_Course_Fees4 = (float) course_Fees + applied_GST; // Widening type casting with Explicitly
        System.out.println(total_Course_Fees4);
    }
}