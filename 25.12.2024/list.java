import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
            String queryType = in.next();

            if (queryType.equals("Insert")) {
                int index = in.nextInt();
                int value = in.nextInt();
                list.add(index, value);
            } else if (queryType.equals("Delete")) {
                int index = in.nextInt();
                list.remove(index);
            }
        }

        for (int num : list) {
            System.out.print(num + " ");
        }

        in.close();
    }
}
