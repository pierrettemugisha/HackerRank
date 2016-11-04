package Day25_RunningTimeAndComplexity;

import java.util.Scanner;

/**
 * Created by PierretteMugisha on 2016-11-02.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberTestCases = scanner.nextInt();
        for (int i = 0; i < numberTestCases; i++) {
            int testCase = scanner.nextInt();
            System.out.println(((testCase >= 2) && isPrime(testCase)) ? "Prime" : "Not prime");
        }
    }

    private static boolean isPrime(int n) {
        for (int j = 2; j <= Math.sqrt(n); j++)
            if (n % j == 0)
                return false;
        return true;
    }
}
