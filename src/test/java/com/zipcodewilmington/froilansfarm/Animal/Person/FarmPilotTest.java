package com.zipcodewilmington.froilansfarm.Animal.Person;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmPilotTest {

    @Test
    public void mount() {
        FarmPilot farmPilot = new FarmPilot();
        Horse horse = new Horse();
        farmPilot.mount(horse);
        Horse mountedHorse = farmPilot.getMount();
        Assert.assertEquals(horse,mountedHorse);
    }

    @Test
    public void dismount() {
        FarmPilot farmPilot = new FarmPilot();
        Horse horse = new Horse();
        boolean beforeRide = horse.isExercised();
        farmPilot.mount(horse);
        farmPilot.getMount().Ride();
        boolean afterRide = horse.isExercised();
        farmPilot.dismount();

        Assert.assertNull(farmPilot.getMount());
        Assert.assertNotEquals(beforeRide,afterRide);
        Assert.assertNull(horse.getRider());
    }



    @Test
    public void fly() {
    }
}