package com.zipcodewilmington.froilansfarm.Crop;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TomatoPlantTest {

    TomatoPlant tplant;

    @Before
    public void setup(){
        tplant = new TomatoPlant();
    }

    @Test
    public void HarvestTest(){
        Assert.assertNull(tplant.harvest());

    }
    @Test
    public void fertilizeTest(){
        this.tplant.fertilizePlant();
        Boolean actual = tplant.isFertilized();

        Assert.assertTrue(actual);
    }

}
