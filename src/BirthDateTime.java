import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Scanner in = new Scanner(System.in);

        int year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);


        int day = 1;

        // Determine valid day range based on month
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = SafeInput.getRangedInt(in, "Enter the day you were born", 1, 31);
                break;
            case 4: case 6: case 9: case 11:
                day = SafeInput.getRangedInt(in, "Enter the day you were born", 1, 30);
                break;
            case 2:
                day = SafeInput.getRangedInt(in, "Enter the day you were born", 1, 29);
                break;
        }

        int hour = SafeInput.getRangedInt(in, "Enter the hour of your birth", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter the minute of your birth", 1, 59);

        System.out.printf("You were born on %d/%d/%d at %02d:%02d\n", month, day, year, hour, minute);
    }


    }

