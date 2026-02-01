package lec12;

import lec10.Animal;
import lec10.Dog;

public class AnimalService {
    public AnimalDto getInfo(AnimalType type, long id) {
//        Animal animal = AnimalRepo.findById(id);
        Animal animal = new Dog();
        return AnimalDto.of(animal);
    }
}
