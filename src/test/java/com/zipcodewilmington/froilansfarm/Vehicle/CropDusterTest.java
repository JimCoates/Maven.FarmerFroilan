package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CropDusterTest {

    @Test
    public void fly() {
    }

    @Test
    public void fertilize() {
        Farm farm = new Farm();
        CropDuster cropDuster = new CropDuster(farm);
        farm.getFieldList().get(0).getCropRow(0).addCrop(new CornStalk());
        Assert.assertFalse(farm.getFieldList().get(0).getCropRow(0).getCropFromCropRow(0).isFertilized());
        cropDuster.fertilize();
        Assert.assertTrue(farm.getFieldList().get(0).getCropRow(0).getCropFromCropRow(0).isFertilized());

    }

    @Test
    public void makeNoise() {
    }

    @Test
    public void ride() {
    }
}