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
            System.out.println("Enter an integer number: ");

            if(input.hasNextInt()) {
                favNum = input.nextInt();
                input.nextLine();
                done = true;
            }
            else {
                trash = input.nextLine();
                System.out.println("Enter an integer number, not " + trash);

            }

        } while (!done);

        return favNum;


    }

//    Part D: getRangedInt
//    This method is used to get an integer within a range
//    Runs how it's supposed to, need to bulletproof it more. (ex. mixed inputs, etc.)

    public static int getRangedInt(Scanner input, String prompt, int low, int high) {

        int guess = 0;
        boolean valid = false;

        do {
            System.out.println("Enter an integer 1-12: ");

            if (input.hasNextInt()) {
                guess = input.nextInt();
                input.nextLine();
                if (guess >= 1 && guess <= 12) {
                    valid = true;
                } else {
                    System.out.println("Out of range, enter an integer between 1 and 12");
                }

            } else {
                System.out.println("Invalid input, try again.");
            }
        } while (!valid);
        return guess;
    }

    //







}







