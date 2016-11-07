package Day29_BitwiseAND;

import java.util.Scanner;

/**
 * Created by PierretteMugisha on 2016-11-07.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt(), K = scanner.nextInt(), maxValue = 0;
            for (int j = 1; j <= N; j++)
                for (int k = j + 1; k <= N; k++) {
                    int bitwiseAnd = j & k;
                    if (bitwiseAnd < K && maxValue < bitwiseAnd)
                        maxValue = bitwiseAnd;
                }
            System.out.println(maxValue);
        }
    }
}
