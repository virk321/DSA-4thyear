package day7;

import java.util.*;

    public class specialXOR{

        public List<Integer> specialXor(int N, int Q, int[] a, int[][] query) {

            int xor = 0;
            for (int x : a) {
                xor ^= x;
            }

            // Prefix XOR
            int[] pre = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                pre[i] = pre[i - 1] ^ a[i - 1];
            }

            List<Integer> ans = new ArrayList<>();

            for (int i = 0; i < Q; i++) {

                int l = query[i][0];
                int r = query[i][1];

                int inside = pre[r] ^ pre[l - 1];

                ans.add(xor ^ inside);
            }

            return ans;
        }

    public static void main(String[] args) {

        int N = 5;
        int Q = 3;

        int[] a = {1, 2, 3, 4, 5};

        int[][] query = {
                {1, 3},
                {2, 5},
                {1, 5}
        };

        specialXOR obj = new specialXOR();

        List<Integer> ans = obj.specialXor(N, Q, a, query);

        System.out.println(ans);
    }
}