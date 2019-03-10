package com.zipcodewilmington.froilansfarm.Storage;

import org.junit.Assert;
import org.junit.Test;

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
    public void findLeastPopulatedChickenCoop() {
        
    }

    @Test
    public void findLeastPopulatedStable() {
    }

    @Test
    public void addManyChicken() {
    }

    @Test
    public void addManyHorse() {
    }
}
