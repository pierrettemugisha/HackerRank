package Day26_NestedLogic;

import java.util.Scanner;

/**
 * Created by PierretteMugisha on 2016-11-03.
 */
public class Solution {
    private static final int AFTER_EXPECTED_DAY = 15,
            AFTER_EXPECTED_MONTH = 500,
            AFTER_EXPECTED_YEAR = 10000;
    private static int FINE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int actualDay = scanner.nextInt(),
                actualMonth = scanner.nextInt(),
                actualYear = scanner.nextInt(),
                expectedDay = scanner.nextInt(),
                expectedMonth = scanner.nextInt(),
                expectedYear = scanner.nextInt();

        if (actualYear > expectedYear)
            FINE = AFTER_EXPECTED_YEAR;
        else if (actualYear == expectedYear) {
            if (actualMonth > expectedMonth)
                FINE = (actualMonth - expectedMonth) * AFTER_EXPECTED_MONTH;
            else if (actualMonth == expectedMonth && actualDay > expectedDay)
                FINE = (actualDay - expectedDay) * AFTER_EXPECTED_DAY;
        }
        System.out.println(FINE);
    }
}
