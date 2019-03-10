package com.zipcodewilmington.froilansfarm.Crop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

public class TomatoTest {
    @Test
    public void createTomatoTest() {
        Tomato tomato = new Tomato();
        Assertions.assertFalse(tomato.isFertilized());
    }

    @Test
    public void fertilize() {
        Tomato tomato = new Tomato();
        tomato.fertilize();
        Assertions.assertTrue(tomato.isFertilized());
    }
}
