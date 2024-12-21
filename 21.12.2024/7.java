import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of queries
        int q = scanner.nextInt();

        // Process each query
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            // Generate the series
            int current = a;
            for (int j = 0; j < n; j++) {
                current += (int) Math.pow(2, j) * b;
                System.out.print(current + " ");
            }
            System.out.println(); // Move to the next line after each series
        }

        scanner.close();
    }
}
