package Day27_Testing;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by PierretteMugisha on 2016-11-04.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println('5');
        System.out.println("4 3");
        System.out.println("-1 -3 4 2");
        System.out.println("5 2");
        System.out.println("0 -1 2 1 4");
        System.out.println("6 3");
        System.out.println("0 -3 4 2 1 1");
        System.out.println("7 2");
        System.out.println("0 2 -1 2 2 1 1 ");
        System.out.println("10 7");
        System.out.println("-1 -2 2 2 4 1 3 -3 0 5");

        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            Integer nos = scanner.nextInt(), pw = scanner.nextInt();
            ArrayList<Integer> students = new ArrayList<Integer>();
            for (int i = 0; i < nos; i++)
                students.add(scanner.nextInt());

            int arrived = 0, notArrived = 0;

            for (int j = 0; j < nos; j++)
                if (students.get(j) <= 0)
                    arrived++;
                else
                    notArrived++;

            if (arrived>=pw)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
