import java.util.Scanner;
public class DevTest{

public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

    SafeInput.getNonZeroLenString(input, "Enter a string: ");
    SafeInput.getRangedInt(input, "Enter a number between the range 1-12", 1, 12);



    }






}