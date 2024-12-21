import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read and print 3 integers
        for (int i = 0; i < 3; i++) {
            int num = scanner.nextInt(); // Read an integer
            System.out.println(num);    // Print the integer
        }
        
        scanner.close();
    }
}
