package zad7;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class AnimalServiceWithMockTest {

    @Mock
    private AnimalRepository animalRepository;

    @Test
    void firstTestWithoutMock1() {
        //given
        // tutaj nauczymy Mocka (zaslepke) co ma robic
        Optional<Animal> animal = Optional.of(new Animal(1l, "type", "name"));
        Mockito
                .when(animalRepository.findByIdAndType(1l, "ryba"))
                .thenReturn(animal);


        Optional<Animal> ryba = animalRepository.findByIdAndType(1l, "ryba");
        System.out.println(ryba);


        //when
        AnimalService animalService = new AnimalService(animalRepository);
        Animal result = animalService.getAnimalByIdAndType(1l, "ryba");

        //then
        Animal expected = ryba.get();

        Assertions.assertThat(result)
                .isEqualTo(expected);
    }

    @Test
    void firstTestWithoutMock2() {
        //given
        AnimalService animalService = new AnimalService(animalRepository);

        //when

        //then
        org.junit.jupiter.api.Assertions.assertThrows
                (
                        AnimalNotFoundException.class,
                        () -> animalService.getAnimalByIdAndType(1l, "ssak")
                );
    }

}