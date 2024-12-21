import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read an integer
        int intValue = scanner.nextInt();
        
        // Read a double
        double doubleValue = scanner.nextDouble();
        
        // Consume the leftover newline from nextDouble
        scanner.nextLine();
        
        // Read a String
        String stringValue = scanner.nextLine();
        
        // Print the results
        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);
        
        scanner.close();
    }
}
