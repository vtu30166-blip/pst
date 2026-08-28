import java.util.*;

public class Main {

    public static String[] sortPeople(String[] names, int[] heights) {

        // Store height and corresponding name
        Integer[] index = new Integer[names.length];

        for (int i = 0; i < names.length; i++) {
            index[i] = i;
        }

        // Sort indexes by height in descending order
        Arrays.sort(index, (a, b) -> heights[b] - heights[a]);

        String[] result = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            result[i] = names[index[i]];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] names = new String[n];
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        String[] result = sortPeople(names, heights);

        System.out.println(Arrays.toString(result));

        sc.close();
    }
}
