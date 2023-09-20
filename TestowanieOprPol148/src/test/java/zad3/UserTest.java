package zad3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class UserTest {

    @Test
    void isValidatedNameTest() {
        User user = new User();
        user.setName("NowyUser");

        boolean result = user.validName();

        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"NowyUser", "U", "aaaaaa"})
    void isValidatedName2Test(String name) {
        User user = new User();
        user.setName(name);

        boolean result = user.validName();

        Assertions.assertTrue(result);
    }

    @Test
    void shouldThrowExceptionAfterValidName(){
        User user = new User();
        user.setName("");

        IllegalArgumentException illegalArgumentException = Assertions.assertThrows
                (
                        IllegalArgumentException.class,
//                        user::valid
                        () -> user.valid()
                );

        String actualMessage = illegalArgumentException.getMessage();
        Assertions.assertEquals("bad name", actualMessage);
    }

}