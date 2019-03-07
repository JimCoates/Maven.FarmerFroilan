package com.zipcodewilmington.froilansfarm.Storage;


import com.zipcodewilmington.froilansfarm.Animal.AnimalFactory;
import org.junit.Assert;
import org.junit.Test;

public class ChickenCoopTest {


    @Test
    public void addListOfChickenTest(){
        ChickenCoop chickenCoop = new ChickenCoop();
        Integer numberOfChickenToAdd = 15;

        chickenCoop.addListOfChicken(AnimalFactory.CHICKEN.makeMultipleAnimals(numberOfChickenToAdd));
        Integer actualChickensAdded = chickenCoop.getSize();

        Assert.assertEquals(numberOfChickenToAdd,actualChickensAdded);

    }


}
