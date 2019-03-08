package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Animal.Person.Person;
import org.junit.Assert;
import org.junit.Test;

public class FarmHouseTest {

    FarmHouse farmHouse;
    Person person;

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
        this.farmHouse = new FarmHouse();
        this.person = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Integer expected = 2;

        this.farmHouse.addSingle(person);
        this.farmHouse.addSingle(person2);
        this.farmHouse.addSingle(person3);

        this.farmHouse.removeSingle(person2);
        Integer actual = this.farmHouse.getSize();

        Assert.assertEquals(expected, actual);

    }
}
