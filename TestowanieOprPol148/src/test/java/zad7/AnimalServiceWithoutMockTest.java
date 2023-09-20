package zad7;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AnimalServiceWithoutMockTest {

    @Test
    void firstTestWithoutMock1() {
        //given
        AnimalRepository animalRepository = new AnimalRepoImpl();
        AnimalService animalService = new AnimalService(animalRepository);

        //when
        Animal result = animalService.getAnimalByIdAndType(1l, "ryba");

        //then
        Animal expected = new Animal(1L, "ryba", "Nemo");

        Assertions.assertThat(result)
                .isEqualTo(expected);
    }

    @Test
    void firstTestWithoutMock2() {
        //given
        AnimalRepository animalRepository = new AnimalRepoImpl();
        AnimalService animalService = new AnimalService(animalRepository);

        //when
        Animal result = animalService.getAnimalByIdAndType(1l, "ssak");

        //then
        Animal expected = new Animal(1L, "ryba", "Nemo");
        Animal notExpected = new Animal(1L, "ssak", "Nemo");

        Assertions.assertThat(result)
                .isEqualTo(expected)
                .isNotEqualTo(notExpected);
    }

}