package JAVA;

public class Lab007_Ternary_Operator_With_CommandLine_Inputs {

    // Find the user is minor, adult or senior citizen from the given command line age input

    public static void main(String[] args) {
        String age_input_string = args[0];
        System.out.println(age_input_string instanceof String);
        int age_user_input = Integer.parseInt(age_input_string); // 25

        String result = (age_user_input < 18) ? "Minor" : (age_user_input <= 60) ? "Adult" : "Sr. Citizen";
        System.out.println(result);
    }
}
