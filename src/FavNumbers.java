import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int favInt = SafeInput.getInt(input, "Enter your favorite integer");
        double favDouble = SafeInput.getDouble(input, "Enter your favorite double");

        System.out.println("\nYour favorite integer is: " + favInt);
        System.out.println("\nYour favorite double is: " + favDouble);


    }
}
