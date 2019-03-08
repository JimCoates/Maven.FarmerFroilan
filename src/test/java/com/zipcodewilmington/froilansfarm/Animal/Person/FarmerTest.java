package com.zipcodewilmington.froilansfarm.Animal.Person;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Utils.Rideable;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {

    @Test
    public void plant() {
    }

    @Test
    public void mount() {
        Farmer farmer = new Farmer();
        Horse horse = new Horse();
        farmer.mount(horse);
        Horse mountedHorse = farmer.getMount();
        Assert.assertEquals(horse,mountedHorse);
    }

    @Test
    public void dismount() {
        Farmer farmer = new Farmer();
        Horse horse = new Horse();
        boolean beforeRide = horse.isExercised();
        farmer.mount(horse);
        farmer.getMount().Ride();
        boolean afterRide = horse.isExercised();
        farmer.dismount();

        Assert.assertNull(farmer.getMount());
        Assert.assertNotEquals(beforeRide,afterRide);
    }
}