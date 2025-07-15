import java.util.Scanner;

public class SafeInput {
    //    Part A: getNonZeroLenString
    // This method is to read a non-empty input
    //Parameter "input" is a scanner opened to read from the System.in
    // Parameter "prompt" prompt for the user so they know what to do
    //Return is a string response that is not of zero length
    public static String getNonZeroLenString(Scanner input, String prompt) {
        String retString = "";

        do {
            System.out.println(prompt);
            retString = input.nextLine();
        } while (retString.isBlank());

        return retString;
    }

    //    Part B: getInt
//    This method is to prompt the user to enter only an int
    public static int getInt(Scanner input, String prompt) {

        int favNum = 0;
        String trash;
        boolean done = false;

        do {
            System.out.println("Enter your favorite integer number: ");

            if (input.hasNextInt()) {
                favNum = input.nextInt();
                input.nextLine();
                done = true;
            } else {
                trash = input.nextLine();
                System.out.println("Enter an integer number, not " + trash);

            }

        } while (!done);

        return favNum;


    }

    // Part C: getDouble
//    This method prompts the user to enter a double
//    Needs more bulletproofing, kept how it was for the sake of time
    public static double getDouble(Scanner input, String prompt) {

        double gpa = 0.0;
        String trash;
        boolean done = false;

        do {
            System.out.println("Enter your favorite double number: ");
            if (input.hasNextDouble()) {
                gpa = input.nextDouble();
                input.nextLine();
                done = true;
            } else {
                trash = input.nextLine();
                System.out.println("Enter your GPA, not " + trash + ". ");
            }
        } while (!done);


        return gpa;
    }


//    Part D: getRangedInt
//    This method is used to get an integer within a range
//    Runs how it's supposed to, need to bulletproof it more. (ex. mixed inputs, etc.)

    public static int getRangedInt(Scanner input, String prompt, int low, int high) {

        int guess = 0;
        boolean valid = false;

        do {
            System.out.println(prompt + " [" + low + " - " + high + "]: ");

            if (input.hasNextInt()) {
                guess = input.nextInt();
                input.nextLine();
                if (guess >= low && guess <= high) {
                    valid = true;
                } else {
                    System.out.println("Out of range, input not in range [" + low + " - " + high + "]");
                }

            } else {
                System.out.println("Invalid input, try again.");
            }
        } while (!valid);
        return guess;
    }

    // Part E: getRangedDouble
//    This method prompts the user to enter a double within the set range
//    Works for the most part, need to bulletproof more for inputs with a string

    public static double getRangedDouble(Scanner input, String prompt, double low, double high) {

        double value = 0;
        String trash;
        boolean valid = false;

        do {
            System.out.println(prompt + " [" + low + " - " + high + "]: ");
            if (input.hasNextDouble()) {
                value = input.nextDouble();
                input.nextLine();
                if (value >= low && value <= high) {
                    valid = true;
                } else {
                    System.out.println("Out of range. Input not in range [" + low + " - " + high + "]");
                }
            } else {
                System.out.println("Invalid entry, try again.");
                input.nextLine();
            }


        } while (!valid);
        return value;


    }

    // Part F: getYNConfirm
// This method prompts the user to answer Yy- true (yes) or Nn- false (no)
    public static boolean getYNConfirm(Scanner input, String prompt) {

        String response;
        boolean valid = false;


        do {
            System.out.print(prompt + " [Y/N]: ");
            response = input.nextLine().trim().toUpperCase();

            if (response.equals("Y") || response.equals("N")) {
                valid = true;
            } else {
                System.out.println("Invalid input, try again.");
            }
        } while (!valid);

        return response.equals("Y");
    }



// Part G: getRegExString
//    This method prompts the user to enter a string that matches a RegEx pattern

//    String birth = "";
//    birth = SafeInput.getRegExString(input, "Enter your birthday (MM-DD-YYYY)","\\d{2}-\\d{2}-\\d{4}");
public static String getRegExString(Scanner input, String prompt, String pattern) {

    String info;
    boolean value = false;

    do {
        System.out.print(prompt + ": ");
        info = input.nextLine();

        if(info.matches(pattern)) {
            value = true;
        } else {
            System.out.println("\nInvalid input. Please match the required pattern." );
        }



    } while (!value);
    return info;


}
//    Ends HERE^





















































}






