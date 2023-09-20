package org.example;

import org.junit.jupiter.api.*;

class FirstAssertJTest {

    @Test
    void myFirstTestWithJUnit() {
        System.out.println("jestem w tescie myFirstTest");
        // given // warunki początkowe
        double firstNumber = 1;
        double secondNumber = 1;

        // when // wykonanie testu
        final double actualResult = firstNumber * secondNumber;

        //then // sprawdzenie wyniku testu
        double expected = 1;
        Assertions.assertEquals(expected, actualResult);
        Assertions.assertEquals(expected, actualResult);
        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    void myFirstTestWithAssertJ() {
        //given
        String fullName = "Zbyszek Kowalski";

        //when
        String actualResult = fullName.toLowerCase();

        //then
        //JUnit
        Assertions.assertEquals("zbyszek kowalski", actualResult);

        // AssertJ
        org.assertj.core.api.Assertions
                .assertThat(actualResult)
                .doesNotContain("X")
                .startsWith("zbyszek")
                .endsWith("ski")
                .contains(" ");
    }

}