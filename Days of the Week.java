import java.util.*;

public class Main {

    public static String dayOfTheWeek(int day, int month, int year) {

        String[] week = {
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday"
        };

        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Count days from 1971 to the given year
        int totalDays = 0;

        for (int y = 1971; y < year; y++) {
            if (isLeapYear(y)) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }

        // February has 29 days in a leap year
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        // Add days from previous months
        for (int m = 0; m < month - 1; m++) {
            totalDays += daysInMonth[m];
        }

        // Add days before the given day
        totalDays += day - 1;

        // January 1, 1971 was Friday
        // Friday is index 5
        int dayIndex = (5 + totalDays) % 7;

        return week[dayIndex];
    }

    static boolean isLeapYear(int year) {
        return year % 400 == 0 ||
               (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        System.out.println(dayOfTheWeek(day, month, year));

        sc.close();
    }
}
