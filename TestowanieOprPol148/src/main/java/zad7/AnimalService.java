package zad7;

import java.util.Optional;

public class AnimalService {
    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public Animal getAnimalByIdAndType(Long id, String type) {
//        Optional<Animal> animal = Optional.of(new Animal());
//        Optional<Animal> animal2 = Optional.ofNullable(null);

        Optional<Animal> foundAnimal = animalRepository.findByIdAndType(id, type);
        if (foundAnimal.isEmpty())
            throw new AnimalNotFoundException();
//            return Optional.empty();

        return foundAnimal.get();
    }

    public Animal createAnimal(Animal animal) {
        return animalRepository.save(animal);
    }
}

