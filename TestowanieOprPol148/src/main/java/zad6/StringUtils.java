package zad6;

// Nalezy napisac klase z testami w podejsciu TDD sprawdzajaca
// czy podany String ma więcej niż podana liczbe nie bialych znakow (znak bialy to spacja)

public class StringUtils {
    private final String text;

    public StringUtils(String text) {
        this.text = text;
    }

    public boolean check(int characterCount) {
//        String replaced = text.replace(" ", "");
//
//        return replaced.length() == characterCount;

        return text
                .replace(" ", "")
                .length() == characterCount;
    }
}
