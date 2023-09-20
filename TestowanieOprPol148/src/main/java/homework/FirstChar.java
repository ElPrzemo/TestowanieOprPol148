package homework;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

//Zaimplementuj mechanizm wyszukujący pierwszy powtarzający się znak w ciągu:
//BACDGBAF -> B
//CERCRE -> C
//ABCD -> brak
//Na podstawie przygotowanej implementacji napisz testy jednostkowe sprawdzające poprawność jej implementacji
public class FirstChar {
    public static void main(String[] args) {
        System.out.println(findTheFirstRepeatingCharacter("BACDGBAF"));
        System.out.println(findTheFirstRepeatingCharacter("CERCRE"));
        System.out.println(findTheFirstRepeatingCharacter("ABCD"));
    }

    public static Optional<Character> findTheFirstRepeatingCharacter2(String input) {
        char[] chars = new char[256]; // Przyjmujemy, że używamy znaków ASCII

        for (char znak : input.toCharArray()) {
            if (chars[znak] > 0) {
                return Optional.of(znak);
            }
            chars[znak]++;
        }

        return Optional.empty();
    }

    public static Optional<Character> findTheFirstRepeatingCharacter(String input) {
        Set<Character> charSet = new HashSet<>();
        for (char ch : input.toCharArray()) {
            if (charSet.contains(ch)) {
                return Optional.of(ch);
            }
            charSet.add(ch);
        }

        return Optional.empty();
    }

}
