package com.zipcodewilmington.froilansfarm.Crop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TomatoPlantTest {

    @Test
    public void addTomatoTest() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        Integer before = tomatoPlant.getQuantity();
        tomatoPlant.yield();
        Integer after = tomatoPlant.getQuantity();

        Assertions.assertTrue(before != after);
        Assertions.assertTrue(before == 0);
        Assertions.assertTrue(after == 1);

    }

    @Test
    public void removeTomatoTest() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.yield();
        Integer before = tomatoPlant.getQuantity();
        tomatoPlant.removeTomato();
        Integer after = tomatoPlant.getQuantity();

        Assertions.assertTrue(before != after);
        Assertions.assertTrue(before == 1);
        Assertions.assertTrue(after == 1);

    }


}
