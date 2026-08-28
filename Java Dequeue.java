import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer, Integer> frequency = new HashMap<>();

        int maxUnique = 0;

        for (int i = 0; i < n; i++) {

            int num = sc.nextInt();

            // Add the new number
            deque.addLast(num);
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);

            // If window is larger than m, remove from front
            if (deque.size() > m) {

                int removed = deque.removeFirst();

                frequency.put(
                    removed,
                    frequency.get(removed) - 1
                );

                // Remove from map if frequency becomes 0
                if (frequency.get(removed) == 0) {
                    frequency.remove(removed);
                }
            }

            // Number of unique elements in current window
            maxUnique = Math.max(maxUnique, frequency.size());
        }

        System.out.println(maxUnique);

        sc.close();
    }
}
