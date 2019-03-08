package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.Animal.AnimalFactory;
import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import org.junit.Assert;
import org.junit.Test;

public class ChickenCoopTest {

    ChickenCoop coop;
    Chicken chicken;

    @Test
    public void addChickenTest() {
        this.coop = new ChickenCoop();
        this.chicken = new Chicken();

        coop.addSingle(chicken);
        Animal expected = chicken;

        Animal actual = coop.get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSizeTestCoop() {
        this.coop = new ChickenCoop();
        this.chicken = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        Integer expected = 3;

        this.coop.addSingle(chicken2);
        this.coop.addSingle(chicken3);
        this.coop.addSingle(chicken);

        Integer actual = this.coop.getSize();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeChickenTest() {
        this.coop = new ChickenCoop();
        this.chicken = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        Integer expected = 2;

        this.coop.addSingle(chicken2);
        this.coop.addSingle(chicken3);
        this.coop.addSingle(chicken);

        this.coop.removeSingle(chicken2);
        Integer actual = this.coop.getSize();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeAllChickenTest() {
        this.coop = new ChickenCoop();
        this.chicken = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        Integer expected = 0;

        this.coop.addSingle(chicken2);
        this.coop.addSingle(chicken3);
        this.coop.addSingle(chicken);

        this.coop.removeAll();
        Integer actual = this.coop.getSize();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addAll() {
        this.coop = new ChickenCoop();
        coop.addList(AnimalFactory.CHICKEN.makeMultipleAnimals(400));
        Integer expected = 400;

        Integer actual = coop.getSize();

        Assert.assertEquals(expected, actual);
    }

}
