import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] accounts = new int[m][n];

        // Read the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }

        int maxWealth = 0;

        // Calculate each customer's wealth
        for (int i = 0; i < m; i++) {
            int wealth = 0;

            for (int j = 0; j < n; j++) {
                wealth += accounts[i][j];
            }

            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
        }

        System.out.println(maxWealth);

        sc.close();
    }
}
