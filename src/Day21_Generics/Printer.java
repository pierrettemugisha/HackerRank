package Day21_Generics;

/**
 * Created by PierretteMugisha on 2016-10-30.
 */
public class Printer {

    public static <E> void printArray(E[] es) {
        for (E item :
                es) {
            System.out.println(item);
        }
    }
}
