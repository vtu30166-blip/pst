import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of lines
        int n = sc.nextInt();

        // ArrayList containing ArrayLists
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

        // Read each line
        for (int i = 0; i < n; i++) {

            int size = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j < size; j++) {
                list.add(sc.nextInt());
            }

            lines.add(list);
        }

        // Number of queries
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            // x and y are 1-based
            // x = line number
            // y = position in that line

            if (x >= 1 && x <= lines.size()
                    && y >= 1 && y <= lines.get(x - 1).size()) {

                System.out.println(lines.get(x - 1).get(y - 1));

            } else {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}
