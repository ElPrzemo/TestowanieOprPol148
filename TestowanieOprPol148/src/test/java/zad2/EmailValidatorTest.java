package zad2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    @Test
    void checkIfEmailIsCorrectTest() {
        //given
        String email = "pzu@pzu.pl";

        //when

        //then
        boolean isValid = EmailValidator.isValid(email);
        assertTrue(isValid);
    }

//    aaa@a.pl
//    aaa@aaaaaaa.com
//    aaa@a.p
//    aaa@aaaaaaa.plll

    @Test
    void checkIfEmailIsNotCorrectTest1() {
        //given
        String email = "aaa@a.pl";

        //when

        //then
        boolean isValid = EmailValidator.isValid(email);
        assertFalse(isValid);
    }

    @Test
    void checkIfEmailIsNotCorrectTest2() {
        //given
        String email = "aaa@aaaaaaa.com";

        //when

        //then
        boolean isValid = EmailValidator.isValid(email);
        assertFalse(isValid);
    }

    //    aaa@a.pl
    //    aaa@aaaaaaa.com
    //    aaa@a.p
    //    aaa@aaaaaaa.plll

    @DisplayName("Inncorect email")
    @ParameterizedTest
    //given
    @ValueSource(strings = {"aaa@a.pl", "aaa@aaaaaaa.com", "aaa@a.p", "aaa@aaaaaaa.plll"})
    void checkIfEmailIsNotCorrectWithManyCasesTest1(String email) {

        //when

        //then
        boolean isValid = EmailValidator.isValid(email);
        assertFalse(isValid);
    }

    @DisplayName("Incorrect email")
    @ParameterizedTest
    //given
    @MethodSource("provideIncorrectEmails")
    void checkIfEmailIsNotCorrectWithManyCasesTest2(String email) {

        //when

        //then
        boolean isValid = EmailValidator.isValid(email);
        assertFalse(isValid);
    }

    private static Stream<Arguments> provideIncorrectEmails(){
        //List.of()
        return Stream.of
                (
                      Arguments.of("aaa@a.pl"),
                      Arguments.of("aaa@aaaaaaa.com"),
                      Arguments.of("aaa@a.p"),
                      Arguments.of("aaa@aaaaaaa.plll")
                );
    }

    @ParameterizedTest
    //given
    @MethodSource("provideEmailsThree")
    void checkEmailsTest(String email, boolean isTrue) {

        //when

        //then
        boolean isValidActual = EmailValidator.isValid(email);

        assertEquals(isTrue, isValidActual);
    }

    private static Stream<Arguments> provideEmailsThree(){
        //List.of()
        return Stream.of
                (
                      Arguments.of("aaa@aa.pl", true),
                      Arguments.of("aaa@a.pl", false),
                      Arguments.of("aaa@aaaaaaa.com", false),
                      Arguments.of("aaa@a.p", false),
                      Arguments.of("aaa@aaaaaaa.plll", false)
                );
    }


}