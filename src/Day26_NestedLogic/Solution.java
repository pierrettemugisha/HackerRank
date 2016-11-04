package Day26_NestedLogic;

import java.util.Scanner;

/**
 * Created by PierretteMugisha on 2016-11-03.
 */
public class Solution {
    private static final int AFTER_EXPECTED_DAY = 15,
            AFTER_EXPECTED_MONTH =500,
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

        if (expectedYear == actualYear)
            if (actualMonth <= expectedMonth)
                if (actualDay <= expectedDay)
                    FINE = 0;
                else
                    FINE = ((actualDay - expectedDay) * AFTER_EXPECTED_DAY);
            else
                FINE = ((actualMonth - expectedMonth) * AFTER_EXPECTED_MONTH);
        else if (expectedYear<actualYear)
            FINE = 0;
        else
            FINE = (AFTER_EXPECTED_YEAR);
        System.out.println(FINE);
    }
}
