package zad5;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EvenNumberCheckerTest {

    @Test
    void isEvenForDigitEqualsFiveTest() {
        //given
        Integer digit = 5;
        EvenNumberChecker evenNumberChecker = new EvenNumberChecker(digit);
        //when
        boolean isEven = evenNumberChecker.isEven();
        //then
        Assertions.assertFalse(isEven);
    }

    @Test
    void isNotEvenForDigitEqualsSixTest() {
        //given
        Integer digit = 6;
        EvenNumberChecker evenNumberChecker = new EvenNumberChecker(digit);
        //when
        boolean isEven = evenNumberChecker.isEven();
        //then
        Assertions.assertTrue(isEven);
    }

    @Test
    void isNotEvenForDigitEqualsSixteenTest() {
        //given
        Integer digit = 16;
        EvenNumberChecker evenNumberChecker = new EvenNumberChecker(digit);
        //when
        boolean isEven = evenNumberChecker.isEven();
        //then
        org.assertj.core.api.Assertions
                .assertThat(isEven)
                .isTrue();
    }


}