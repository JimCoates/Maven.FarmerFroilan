package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import org.junit.Assert;
import org.junit.Test;

import java.util.function.Consumer;

public class FarmTest {


    @Test
    public void farmConstructorVariablesTest(){
        Farm farm = new FarmBuilder()
                .setNumberCoops(1)
                .setNumberFields(4)
                .setNumberStables(5)
                .createFarm();
        FarmHouse farmhouse = farm.getFarmHouse();
        Integer expectedFields = 4;
        Integer expectedCoops = 1;
        Integer expectedStables = 5;


        Integer actualFields = farm.getNumberOfFields();
        Integer actualStables = farm.getNumberOfStables();
        Integer actualCoops = farm.getNumberOfCoops();

        Assert.assertNotNull(farmhouse);
        Assert.assertEquals(expectedFields, actualFields);
        Assert.assertEquals(expectedCoops,actualCoops);
        Assert.assertEquals(expectedStables,actualStables);
    }

    @Test
    public void farmConstructorDefaultTest(){
        Farm farm = new Farm();

        FarmHouse farmhouse = farm.getFarmHouse();
        Integer expectedFields = 1;
        Integer expectedCoops = 4;
        Integer expectedStables = 3;


        Integer actualFields = farm.getNumberOfFields();
        Integer actualStables = farm.getNumberOfStables();
        Integer actualCoops = farm.getNumberOfCoops();

        Assert.assertNotNull(farmhouse);
        Assert.assertEquals(expectedFields, actualFields);
        Assert.assertEquals(expectedCoops,actualCoops);
        Assert.assertEquals(expectedStables,actualStables);
    }



    @Test
    public void addManyChicken() {
        Farm farm = new Farm();
        farm.addManyChicken(15);
        for (ChickenCoop thisCoop : farm.getChickenCoopList()) {
            System.out.println(thisCoop.getSize());
        }
    }

    @Test
    public void addManyHorse() {
    }
}
