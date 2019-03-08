package com.zipcodewilmington.froilansfarm.Storage;

import org.junit.Assert;
import org.junit.Test;

public class FieldTest {

    @Test
    public void addCropRowTest(){
        Field field = new Field();
        CropRow row = new CropRow();
        CropRow row2 = new CropRow();
        CropRow row3 = new CropRow();

        field.addSingle(row);
        field.addSingle(row2);
        field.addSingle(row3);

        Integer expected = 3;
        Integer actual = field.getSize();

        Assert.assertEquals(expected,actual);

    }
}
