package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Animal.AnimalFactory;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class FarmTest {


    @Test
    public void farmConstructorTest(){
        Farm farm = new FarmBuilder()
                .setBetty(new CropDuster())
                .setFarmHouse(new FarmHouse())
                .setNumberCoops(1)
                .setNumberFields(4)
                .setTractor(new Tractor())
                .setNumberStables(5)
                .createFarm();
        FarmHouse farmhouse = farm.getFarmHouse();

        Assert.assertNotNull(farmhouse);

    }
}
