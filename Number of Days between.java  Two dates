import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String date1 = sc.next();
        String date2 = sc.next();

        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);

        long days = Math.abs(ChronoUnit.DAYS.between(d1, d2));

        System.out.println(days);

        sc.close();
    }
}
