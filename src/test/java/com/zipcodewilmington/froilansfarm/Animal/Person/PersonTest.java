package com.zipcodewilmington.froilansfarm.Animal.Person;

import com.zipcodewilmington.froilansfarm.Crop.EarCorn;
import com.zipcodewilmington.froilansfarm.Crop.Egg;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {


    @Test
    public void ConstructorTest() {
        String name = "test";
        Person person = new Person(name);
        String actualName = person.getName();
        Assert.assertEquals(name,actualName);
    }

    @Test
    public void eat() {
        Person person = new Person();
        Egg egg = new Egg();

        person.eat(egg);
    }

    @Test
    public void makeNoise() {
        Person person = new Person();
        person.makeNoise();
    }

    @Test
    public void setName() {
        String expectedName = "Mike";
        Person person = new Person();
        person.setName(expectedName);
        String actualName = person.getName();
        Assert.assertEquals(expectedName,actualName);
    }
}