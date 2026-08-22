import java.util.*;

public class Main {

    public static void search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            // Compare pattern with text starting at index i
            while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }

            // If entire pattern matched
            if (j == m) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String pattern = sc.nextLine();

        search(text, pattern);

        sc.close();
    }
}
