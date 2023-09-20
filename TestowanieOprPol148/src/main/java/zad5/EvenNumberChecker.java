package zad5;

//@RequiredArgsConstructor
public class EvenNumberChecker {

    // Tworzenie pol, zmiennych jako immutable
    // czym rozni sie final od immutable
    private final Integer digit;

    public EvenNumberChecker(Integer digit) {
        this.digit = digit;
    }

    public boolean isEven() {
        // liczba mod 2 == 0 -> wtedy jest podzielna przez 2
//        if (digit % 2 == 0)
//            return false;
//        else
//            return true;

        return digit % 2 == 0;

        // Dla isOdd
//        return digit % 2 != 0;
//        return !(digit % 2 == 0);
    }

}
