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
            System.out.println(isPrime(testCase));
        }
    }

    private static String isPrime(int n) {
        if (n == 1) {
            return "Not prime";
        }
        if (n == 2) {
            return "Prime";
        }
        for (int j = 2; j * j < n; j++) {
            if (n % j == 0 && j != n) {
                return "Not prime";
            }
        }
        return "Prime";
    }
}
