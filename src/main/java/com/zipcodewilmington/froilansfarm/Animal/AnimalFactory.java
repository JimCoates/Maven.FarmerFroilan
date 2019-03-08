package com.zipcodewilmington.froilansfarm.Animal;



import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public enum AnimalFactory {


    CHICKEN(Chicken::new),
    HORSE(Horse::new);



    private final Supplier<Animal> animalSupplier;

    AnimalFactory(Supplier<Animal> supplier) {this.animalSupplier = supplier;}

    public <T extends Animal> T createAnimal(){
        return (T) animalSupplier.get();
    }

    public <T extends Animal> List<T> makeMultipleAnimals(Integer numberOfAnimals){
        Animal[] animalArray = new Animal[numberOfAnimals];
        for (int i = 0; i < numberOfAnimals; i++) {
            animalArray[i] = createAnimal();
        }
        return (List<T>) Arrays.asList(animalArray);
    }




}
