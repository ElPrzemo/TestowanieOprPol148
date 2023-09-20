package zad1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calculator;
//    @Mock
//    private DbConnector connector;
//    private DbConnector connector = new DbConnector();

    @BeforeEach
    void init() {
        calculator = new Calculator();
        System.out.println("Teraz przypisuje do pola calculator nowa wartosc");
    }

    @AfterEach
    void destroy() {
        System.out.println("calculator = " + calculator);
        calculator = null;
        System.out.println("calculator = " + calculator);
    }

    @Test
    void shouldAddThreeDigitsTest() {
        System.out.println("odpalam test 1");
        //given
        double x = 1;
        double y = 2;
        double z = 3;

        //when
        double actualResult = calculator.add(x, y, z);

        //then
        double expected = 6;
        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    void shouldSubstractDigitsTest() {
        System.out.println("odpalam test 2");
        //given
        double x = 1;
        double y = 2;

        //when
        double actualResult = calculator.substract(x, y);

        //then
        double expected = -1;
        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    void shouldMultiplyTwoDigitsTest() {
        System.out.println("odpalam test 3");
        //given
        double x = 1;
        double y = 2;

        //when
        double actualResult = calculator.multiply(x, y);

        //then
        double expected = 2;
        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    void shouldDivideTwoDigitsTest() {
        System.out.println("odpalam test 4");
        //given
        double x = 4;
        double y = 2;

        //when
        double actualResult = calculator.divide(x, y);

        //then
        double expected = 2;
        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    void shouldThrowExceptionWhenSecondParameterIsZeroTest() {
        System.out.println("odpalam test 5");
        //given
        double x = 4;
        double y = 0;

        //when

        //then
        // podejscie bez assertAll. Jesli assertThrows nie przejdzie pozytywnie to assertEqals nie wykona sie
        IllegalArgumentException nullPointerException = Assertions.assertThrows
                (
                        IllegalArgumentException.class,
                        () -> calculator.divide(x, y)
                );

        String message = nullPointerException.getMessage();
        Assertions.assertEquals("Second argument can not be null", message);
    }

}