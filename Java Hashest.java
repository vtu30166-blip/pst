import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        Set<String> pairs = new HashSet<>();

        for (int i = 0; i < t; i++) {
            String first = sc.next();
            String second = sc.next();

            // Create a unique representation of the pair
            String pair = first + " " + second;

            pairs.add(pair);

            System.out.println(pairs.size());
        }

        sc.close();
    }
}
