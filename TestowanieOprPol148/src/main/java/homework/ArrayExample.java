package homework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Polecenie zadania:
//Zaimplementuj w klasie ArrayExample metodę:
//
//public static String[] removeDuplicates(String[] array)
//
//Metoda powinna zwrócić nową tablicę bez duplikatów.
//
//TODO napisz do tej metody test jednostkowy. Pomyśl jakie przypadki testowe rozważyć
public class ArrayExample {

    public static String[] removeDuplicates(String[] array) {
        Set<String> set = new HashSet<>();
        Collections.addAll(set, array);

        return set.toArray(new String[0]);
    }

}




