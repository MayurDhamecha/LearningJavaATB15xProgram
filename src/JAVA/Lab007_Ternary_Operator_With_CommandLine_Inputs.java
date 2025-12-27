package JAVA;

public class Lab007_Ternary_Operator_With_CommandLine_Inputs {

    // Find the user is minor, adult or senior citizen from the given command line age input

    public static void main(String[] args) {
        String age_input_string = args[0];
        int age_user_input = Integer.parseInt(age_input_string);

        String result = (age_user_input < 18) ? "Person is Minor" : (age_user_input <= 60) ? "Person is Adult" : "Person is Sr. Citizen";
        System.out.println(result);
    }
}
