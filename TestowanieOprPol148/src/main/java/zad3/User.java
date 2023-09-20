package zad3;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import zad2.EmailValidator;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private String surname;
    private String email;

    public boolean validName() {
        return this.name.toLowerCase().matches("[a-z]+");
    }

    public boolean validSurname() {
        return this.surname.toLowerCase().matches("[a-z\\-]+");
    }

    public boolean validEmail() {
        return EmailValidator.isValid(this.email.toLowerCase());
    }

    public boolean valid() {
        if (!this.validName()) {
            throw new IllegalArgumentException("bad name");
        }
        if (!this.validSurname()) {
            throw new IllegalArgumentException("bad surname");
        }
        if (!this.validEmail()) {
            throw new IllegalArgumentException("bad email");
        }
        return true;
    }

}