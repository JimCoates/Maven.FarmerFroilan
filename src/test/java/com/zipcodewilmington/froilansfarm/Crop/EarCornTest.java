package com.zipcodewilmington.froilansfarm.Crop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EarCornTest {
    @Test
    public void createEarCornTest() {
        EarCorn corn = new EarCorn();
        Assertions.assertFalse(corn.isFertilized());
    }

    @Test
    public void fertilize() {
        EarCorn corn = new EarCorn();
        corn.fertilize();
        Assertions.assertTrue(corn.isFertilized());
    }

}




//Produce can yield an Edible object depending on their hasBeenFertilized flag.

//Crop is a Produce which can yield an Edible object depending on its hasBeenHarvested and hasBeenFertilized flag.
// CornStalk is a Crop which can yield a EarCorn
//TomatoPlant is a Crop which can yield a Tomato