import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < t; i++) {
            String n = scanner.nextLine();

            try {
                long value = Long.parseLong(n);
                System.out.println(n + " can be fitted in:");
                if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (value >= Integer.MIN_VALUE && value <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (value >= Long.MIN_VALUE && value <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (NumberFormatException e) {
                System.out.println(n + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    }
}
