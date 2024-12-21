import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        // Read input
        Scanner in = new Scanner(System.in);
        String S = in.next();  // Read the string
        int start = in.nextInt();  // Read the start index
        int end = in.nextInt();  // Read the end index

        // Extract and print the substring from start to end (inclusive)
        System.out.println(S.substring(start, end));
    }
}
