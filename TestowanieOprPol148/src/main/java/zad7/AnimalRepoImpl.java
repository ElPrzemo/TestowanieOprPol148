package zad7;

import java.util.Optional;

public class AnimalRepoImpl implements AnimalRepository{

//    private DBConnector connector;

    @Override
    public Optional<Animal> findByIdAndType(Long id, String type) {
        return Optional.of(new Animal(1L, "ryba", "Nemo"));
    }

    @Override
    public Animal save(Animal animal) {
        return null;
    }

}
