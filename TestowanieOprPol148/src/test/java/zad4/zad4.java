package zad4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

public class zad4 {
    @Test
    void listTestWithJUnit() {
        // given
        // [1-100]
        List<Integer> ints = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            ints.add(i);
        }

        //when
        // Tutaj wykonujemy coz z Lista ints
//        List<Integer> actualResult = ListUtil.getReversedList(testedList);;
        List<Integer> actualResult = ints;

        //1. Czy oczekujemy listy w zadaenej kolejności np. 1,2,3,4
//        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
//        System.out.println(expected);
//        Assertions.assertEquals(expected, actualResult);

        //2. Czy chcemy sprawdzc czy Lista zawiera elementy od 1 do 100 bez wzgledu na kolejnosc
        List<Executable> asserions = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            int currentNumber = i;

            //Od Javy 8
            Executable executable = () -> Assertions.assertTrue(actualResult.contains(currentNumber));
            asserions.add(executable);

//            // Do Javy 8
//            asserions.add
//                    (
//                            // Klasa anonimowa
//                            new Executable() {
//                                @Override
//                                public void execute() throws Throwable {
//                                    Assertions.assertTrue(actualResult.contains(currentNumber));
//                                }
//                            }
//                    );

        }

        Assertions.assertAll(asserions);

    }
}
