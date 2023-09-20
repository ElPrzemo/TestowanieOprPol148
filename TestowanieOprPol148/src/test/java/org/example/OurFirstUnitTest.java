package org.example;

import org.junit.jupiter.api.*;

class OurFirstUnitTest {
    double firstNumber;
    double secondNumber;

    @BeforeAll
    static void initBeforeAll(){
        System.out.println("wykonam sie tylko 1 raz");
    }

    @BeforeEach
    void initBeforeEach() {
        firstNumber = 2;
        secondNumber = 3;
        System.out.println("Wykonuje sie przed kazdym testem");
    }

    @AfterEach
    void doAfterEach() {
        System.out.println("Wykonuje sie PO kazdym tescie");
    }

    @AfterAll
    static void doAfterAll(){
        System.out.println("wykonam sie na samym koncu tylko 1 raz");
    }

    @Test
    void myFirstTest() {
        System.out.println("jestem w tescie myFirstTest");
        // given // warunki początkowe

        // when // wykonanie testu
        final double actualResult = firstNumber * secondNumber;

        //then // sprawdzenie wyniku testu
        double expected = 6;
        Assertions.assertEquals(expected, actualResult);
    }

    @Disabled
    @Test
    public void mySecondTest() {
        System.out.println("jestem w tescie mySecondTest");
        // given // warunki początkowe

        // when // wykonanie testu
        final double actualResult = firstNumber * secondNumber;

        //then // sprawdzenie wyniku testu
        double expected = 6;
        Assertions.assertEquals(expected, actualResult);
    }

//    @Test
//    void myFirstTest() {
//        // given // warunki początkowe
//        final double firstNumber = 2;
//        final double secondNumber = 3;
//
//        // when // wykonanie testu
//        final double actualResult = firstNumber * secondNumber;
//
//        //then // sprawdzenie wyniku testu
//
//        String s1 = "imie";
//        String s2 = "imie2";
//        // assertEquals
////        s1.equals(s2);
//        // assertSame
////        s1 == s2;
//
////        try{
////
////        }
////        catch (NullPointerException ex)
////        {
////            Assertions.fail();
////        }
//
//        double expected = 6;
//        Assertions.assertEquals(expected, actualResult);
////        Assertions.assertFalse(1==1);
//    }

}