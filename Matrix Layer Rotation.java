import java.util.*;

public class Main {

    public static void matrixRotation(int[][] matrix, int r) {
        int m = matrix.length;
        int n = matrix[0].length;

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {

            ArrayList<Integer> list = new ArrayList<>();

            int top = layer;
            int left = layer;
            int bottom = m - 1 - layer;
            int right = n - 1 - layer;

            // Top row: left -> right
            for (int j = left; j <= right; j++) {
                list.add(matrix[top][j]);
            }

            // Right column: top+1 -> bottom
            for (int i = top + 1; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }

            // Bottom row: right-1 -> left
            for (int j = right - 1; j >= left; j--) {
                list.add(matrix[bottom][j]);
            }

            // Left column: bottom-1 -> top+1
            for (int i = bottom - 1; i > top; i--) {
                list.add(matrix[i][left]);
            }

            int len = list.size();
            int rotation = r % len;

            // Put rotated values back
            int index = rotation;

            // Top row
            for (int j = left; j <= right; j++) {
                matrix[top][j] = list.get(index);
                index = (index + 1) % len;
            }

            // Right column
            for (int i = top + 1; i <= bottom; i++) {
                matrix[i][right] = list.get(index);
                index = (index + 1) % len;
            }

            // Bottom row
            for (int j = right - 1; j >= left; j--) {
                matrix[bottom][j] = list.get(index);
                index = (index + 1) % len;
            }

            // Left column
            for (int i = bottom - 1; i > top; i--) {
                matrix[i][left] = list.get(index);
                index = (index + 1) % len;
            }
        }

        // Print result
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);

                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        matrixRotation(matrix, r);
    }
}
