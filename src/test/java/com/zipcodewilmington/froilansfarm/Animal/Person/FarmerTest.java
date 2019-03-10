package com.zipcodewilmington.froilansfarm.Animal.Person;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void plant() {
    }

    @Test
    public void mount() {
        Farmer farmer = new Farmer();
        Horse horse = Horse.createHorse();
        farmer.mount(horse);
        Horse mountedHorse = farmer.getMount();
        Assert.assertEquals(horse,mountedHorse);
    }

    @Test
    public void dismount() {
        Farmer farmer = new Farmer();
        Horse horse = Horse.createHorse();
        boolean beforeRide = horse.isExercised();
        farmer.mount(horse);
        farmer.getMount().Ride();
        boolean afterRide = horse.isExercised();
        farmer.dismount();

        Assert.assertNull(farmer.getMount());
        Assert.assertNotEquals(beforeRide,afterRide);
        Assert.assertNull(horse.getRider());
    }
}