package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import org.junit.Assert;
import org.junit.Test;

public class StableTest {

    Horse horse;
    Stable stable;

    @Test
    public void addHorse() {
        this.stable = new Stable();
        this.horse = Horse.createHorse();

        stable.addSingle(horse);
        Animal expected = horse;

        Animal actual = stable.get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSizeTestStable() {
        this.stable = new Stable();
        this.horse = Horse.createHorse();
        Horse horse2 = Horse.createHorse();
        Horse horse3 = Horse.createHorse();
        Integer expected = 3;

        this.stable.addSingle(horse2);
        this.stable.addSingle(horse3);
        this.stable.addSingle(horse);

        Integer actual = this.stable.getSize();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeHorseTest() {
        this.stable = new Stable();
        this.horse = Horse.createHorse();
        Horse horse2 = Horse.createHorse();
        Horse horse3 = Horse.createHorse();
        Integer expected = 2;

        this.stable.addSingle(horse2);
        this.stable.addSingle(horse3);
        this.stable.addSingle(horse);

        this.stable.removeSingle(horse2);
        Integer actual = this.stable.getSize();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAllHorseTest() {
        this.stable = new Stable();
        this.horse = Horse.createHorse();
        Horse horse2 = Horse.createHorse();
        Horse horse3 = Horse.createHorse();
        Integer expected = 0;

        this.stable.addSingle(horse2);
        this.stable.addSingle(horse3);
        this.stable.addSingle(horse);

        this.stable.removeAll();
        Integer actual = this.stable.getSize();

        Assert.assertEquals(expected, actual);
    }
}
