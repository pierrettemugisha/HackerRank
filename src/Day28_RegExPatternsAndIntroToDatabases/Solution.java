package Day28_RegExPatternsAndIntroToDatabases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by PierretteMugisha on 2016-11-07.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        Pattern pattern = Pattern.compile("@gmail\\.com");
        ArrayList<String> emails = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            String name = scanner.next();
            String email = scanner.next();
            if (pattern.matcher(email).find())
                emails.add(name);
            Collections.sort(emails);
        }
        emails.forEach(System.out::println);
    }
}
