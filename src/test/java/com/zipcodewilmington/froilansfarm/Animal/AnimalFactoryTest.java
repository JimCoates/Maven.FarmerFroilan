package com.zipcodewilmington.froilansfarm.Animal;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AnimalFactoryTest {

    @Test
    public void createAnimal() {
        Chicken chicken;
        Horse horse;
        chicken = AnimalFactory.CHICKEN.createAnimal();
        horse = AnimalFactory.HORSE.createAnimal();
        Assert.assertNotNull(chicken);
        Assert.assertNotNull(horse);

    }

    @Test
    public void makeMultipleAnimals() {
        Integer numberToAdd = 15;
        List<Chicken> chickenList = new ArrayList<>(AnimalFactory.CHICKEN.makeMultipleAnimals(numberToAdd));
        Integer actualAdded = chickenList.size();
        Assert.assertEquals(numberToAdd,actualAdded);
    }
}