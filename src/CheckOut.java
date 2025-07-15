import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        boolean moreItems = true;

        while (moreItems) {
            double price = SafeInput.getRangedDouble(input, "Enter item price", 0.50, 10.00);
            total += price;

            moreItems = SafeInput.getYNConfirm(input, "Do you have more items?");
        }

        System.out.printf("Your total is: $%.2f\n", total);
    }
}
