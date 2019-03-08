package com.zipcodewilmington.froilansfarm.Storage;

import com.sun.corba.se.impl.interceptors.SlotTableStack;
import com.zipcodewilmington.froilansfarm.Animal.AnimalFactory;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
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


        Integer actualFields = farm.getFieldList();
        Integer actualStables = farm.getHorseStableList();
        Integer actualCoops = farm.getChickenCoopList();

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


        Integer actualFields = farm.getFieldList();
        Integer actualStables = farm.getHorseStableList();
        Integer actualCoops = farm.getChickenCoopList();

        Assert.assertNotNull(farmhouse);
        Assert.assertEquals(expectedFields, actualFields);
        Assert.assertEquals(expectedCoops,actualCoops);
        Assert.assertEquals(expectedStables,actualStables);
    }
}
