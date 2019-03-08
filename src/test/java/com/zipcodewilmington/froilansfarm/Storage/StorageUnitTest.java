package com.zipcodewilmington.froilansfarm.Storage;


import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.Animal.AnimalFactory;
import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Animal.Person.Person;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.Edible;
import com.zipcodewilmington.froilansfarm.Crop.Produce;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StorageUnitTest {
    ChickenCoop coop;
    Field field;
    CropRow row;
    Stable stable;
    FarmHouse farmHouse;
    Chicken chicken;
    Horse horse;
    Crop crop;
    Person person;
    Farm farm;


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
    public void addHorse() {
        this.stable = new Stable();
        this.horse = new Horse();

        stable.addSingle(horse);
        Animal expected = horse;

        Animal actual = stable.get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addCrop() {
        this.row = new CropRow();
        this.crop = new Crop() {
            @Override
            public <T extends Edible> T yield() {
                return null;
            }
        };

        row.addSingle(crop);
        Produce expected = crop;

        Produce actual = row.get(0);

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
    public void getSizeTestStable() {
        this.stable = new Stable();
        this.horse = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();
        Integer expected = 3;

        this.stable.addSingle(horse2);
        this.stable.addSingle(horse3);
        this.stable.addSingle(horse);

        Integer actual = this.stable.getSize();

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
    public void removeHorseTest() {
        this.stable = new Stable();
        this.horse = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();
        Integer expected = 2;

        this.stable.addSingle(horse2);
        this.stable.addSingle(horse3);
        this.stable.addSingle(horse);

        this.stable.removeSingle(horse2);
        Integer actual = this.stable.getSize();

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
    public void removeAllHorseTest() {
        this.stable = new Stable();
        this.horse = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();
        Integer expected = 0;

        this.stable.addSingle(horse2);
        this.stable.addSingle(horse3);
        this.stable.addSingle(horse);

        this.stable.removeAll();
        Integer actual = this.stable.getSize();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addPersonTest() {
        this.farmHouse = new FarmHouse();
        this.person = new Person();

        farmHouse.addSingle(person);
        Animal expected = person;

        Animal actual = farmHouse.get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSizeTestFarmHouse(){
        this.farmHouse = new FarmHouse();
        this.person = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Integer expected = 3;

        this.farmHouse.addSingle(person2);
        this.farmHouse.addSingle(person3);
        this.farmHouse.addSingle(person);

        Integer actual = this.farmHouse.getSize();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removePersonTest() {
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


}
