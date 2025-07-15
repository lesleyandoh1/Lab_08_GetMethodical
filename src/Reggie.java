import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // SSN pattern: 123-45-6789
        String ssn = SafeInput.getRegExString(input, "Enter your SSN (format: 123-45-6789)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN entered: " + ssn);

        // UC M Number pattern: M12345 or m54321
        String mNumber = SafeInput.getRegExString(input, "Enter your M Number (M#####)", "^(M|m)\\d{5}$");
        System.out.println("M Number entered: " + mNumber);

        // Menu choice pattern: O, S, V, Q (case-insensitive)
        String menuChoice = SafeInput.getRegExString(input, "Enter menu option (O/S/V/Q)", "^[OoSsVvQq]$");
        System.out.println("Menu choice entered: " + menuChoice);
    }
}
