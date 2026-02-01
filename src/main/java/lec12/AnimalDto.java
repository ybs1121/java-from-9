package lec12;

import lec10.Animal;
import lec10.Cat;
import lec10.Dog;

public sealed interface AnimalDto {
    public static AnimalDto of(Animal animal) {
        return switch (animal) {
            case Dog dog -> DogDto.of(dog);
            case Cat cat -> CatDto.of(cat);
        };
    }


    public record DogDto(
            String ownerName
    ) implements AnimalDto {
        public static DogDto of(Dog dog) {
            return new DogDto(dog.getOwnerName());
        }
    }


    public record CatDto(
            String name,
            int age
    ) implements AnimalDto {
        public static CatDto of(Cat cat) {
            return new CatDto(cat.getName(), cat.getAge());
        }
    }



}
