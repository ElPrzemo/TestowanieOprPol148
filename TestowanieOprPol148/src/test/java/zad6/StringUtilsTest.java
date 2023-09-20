package zad6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void stringShouldContainsWhiteCharactersTest() {
        //given
        String stringTest = "Ala ma kota";
        int characterCount = 11;
        StringUtils stringUtils = new StringUtils(stringTest);

        //when
        boolean actualResult = stringUtils.check(characterCount);

        //then
        Assertions.assertFalse(actualResult);

        org.assertj.core.api.Assertions
                .assertThat(actualResult)
                .isFalse();
    }

    @Test
    void stringShouldContainsWhiteCharactersTest2() {
        //given
        String stringTest = "Ala ma kota";
        int characterCount = 11 - 2;
        StringUtils stringUtils = new StringUtils(stringTest);

        //when
        boolean actualResult = stringUtils.check(characterCount);

        //then
        Assertions.assertTrue(actualResult);

        org.assertj.core.api.Assertions
                .assertThat(actualResult)
                .isTrue();
    }


    @Test
    void stringShouldNotContainsWhiteCharactersTest2() {
        //given
        String stringTest = "Alamakota";
        int characterCount = 9;
        StringUtils stringUtils = new StringUtils(stringTest);

        //when
        boolean actualResult = stringUtils.check(characterCount);

        //then
        Assertions.assertTrue(actualResult);

        org.assertj.core.api.Assertions
                .assertThat(actualResult)
                .isTrue();
    }

}