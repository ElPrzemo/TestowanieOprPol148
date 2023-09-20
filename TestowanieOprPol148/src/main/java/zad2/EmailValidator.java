package zad2;

import java.util.regex.Pattern;

// Wykorzystując podejście TDD napisz metodę sprawdzającą poprawność podanego w parametrze adresu e-mail.
public class EmailValidator {
    private static final String EMAIL_REGEX = "\\S+@+[a-zA-Z]{2,6}\\.[a-zA-Z]{2,3}";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);

    public static boolean isValid(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }

    public boolean isValid2(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }

}

