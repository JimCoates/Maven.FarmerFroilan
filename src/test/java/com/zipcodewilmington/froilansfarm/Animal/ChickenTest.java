package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Crop.EarCorn;
import com.zipcodewilmington.froilansfarm.Crop.Egg;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {

    @Test
    public void ChickenConstructorTest() {
        Chicken chicken = Chicken.createChicken();
        Assert.assertFalse(chicken.hasBeenFertilized);
    }

    @Test
    public void eat() {
    EarCorn corn = new EarCorn();
    Chicken chicken = Chicken.createChicken();
    chicken.eat(corn);


    }

    @Test
    public void makeNoise() {
        Chicken chicken = Chicken.createChicken();
        chicken.makeNoise();
    }

    @Test
    public void yield() {

        Chicken chicken = Chicken.createChicken();
        Egg egg;
        egg = chicken.yield();
        Assert.assertNotNull(egg);

    }

    @Test
    public void fertilize() {
        Chicken chicken = Chicken.createChicken();
        chicken.fertilize();
        Assert.assertTrue(chicken.hasBeenFertilized);
    }
}