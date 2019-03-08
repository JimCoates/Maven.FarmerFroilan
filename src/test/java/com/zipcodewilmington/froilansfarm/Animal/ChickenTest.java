package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Crop.EarCorn;
import com.zipcodewilmington.froilansfarm.Crop.Egg;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenTest {

    @Test
    public void ChickenConstructorTest() {
        Chicken chicken = new Chicken();
        Assert.assertFalse(chicken.hasBeenFertilized);
    }

    @Test
    public void eat() {
    EarCorn corn = new EarCorn();
    Chicken chicken = new Chicken();
    chicken.eat(corn);


    }

    @Test
    public void makeNoise() {
        Chicken chicken = new Chicken();
        chicken.makeNoise();
    }

    @Test
    public void yield() {

        Chicken chicken = new Chicken();
        Egg egg;
        egg = chicken.yield();
        Assert.assertNotNull(egg);

    }

    @Test
    public void fertilize() {
        Chicken chicken = new Chicken();
        chicken.fertilize();
        Assert.assertTrue(chicken.hasBeenFertilized);
    }
}