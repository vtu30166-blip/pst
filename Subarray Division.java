import java.util.*;

public class Main {

    public static int birthday(int[] s, int d, int m) {
        int count = 0;
        int sum = 0;

        // First window
        for (int i = 0; i < m; i++) {
            sum += s[i];
        }

        if (sum == d) {
            count++;
        }

        // Slide the window
        for (int i = m; i < s.length; i++) {
            sum += s[i];
            sum -= s[i - m];

            if (sum == d) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] s = new int[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }

        int d = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(birthday(s, d, m));
    }
}
