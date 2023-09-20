import zad2.EmailValidator;

public class Main {
    public static void main(String[] args) {
        EmailValidator emailValidator = new EmailValidator();
        emailValidator.isValid2("");
//        emailValidator.isValid(""); mozna ale nie powinno sie tak robic

        EmailValidator.isValid("");
    }
}
