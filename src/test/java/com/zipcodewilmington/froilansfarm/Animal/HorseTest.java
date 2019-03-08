package com.zipcodewilmington.froilansfarm.Animal;


import com.zipcodewilmington.froilansfarm.Animal.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Animal.Person.Person;
import com.zipcodewilmington.froilansfarm.Animal.Person.Rider;
import com.zipcodewilmington.froilansfarm.Crop.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {





    @Test
    public void makeNoiseTest(){
        Horse horse = new Horse();
        horse.makeNoise();
    }

    @Test
    public void eat() {
        Tomato tomato = new Tomato();
        Horse horse = new Horse();
        horse.eat(tomato);

    }

    @Test
    public void ride() {
        Horse horse = new Horse();
        Farmer person = new Farmer();
        horse.setRider(person);
        Rider rider = horse.getRider();
        Assert.assertEquals(person,rider);


    }
}
