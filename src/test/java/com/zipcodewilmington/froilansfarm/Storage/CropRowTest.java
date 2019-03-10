package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.Edible;
import com.zipcodewilmington.froilansfarm.Crop.Produce;
import org.junit.Assert;
import org.junit.Test;

public class CropRowTest {
    CropRow row;
    Crop crop;

    @Test
    public void addCrop() {
        this.row = new CropRow();
        this.crop = new Crop() {
            @Override
            public <T extends Edible> T yield() {
                return null;
            }
        };

        row.addSingle(crop);
        Produce expected = crop;

        Produce actual = row.get(0);

        Assert.assertEquals(expected, actual);
    }
}
