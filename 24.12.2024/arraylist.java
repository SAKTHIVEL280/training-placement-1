import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        List<List<Integer>> lines = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split(" ");
            List<Integer> numbers = new ArrayList<>();
            for (int j = 1; j < line.length; j++) {
                numbers.add(Integer.parseInt(line[j]));
            }
            lines.add(numbers);
        }
        
        int q = sc.nextInt();
        
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if (x > 0 && x <= n && y > 0 && y <= lines.get(x - 1).size()) {
                System.out.println(lines.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }
        
        sc.close();
    }
}
