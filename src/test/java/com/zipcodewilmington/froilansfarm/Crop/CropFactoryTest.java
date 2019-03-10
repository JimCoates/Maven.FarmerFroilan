package com.zipcodewilmington.froilansfarm.Crop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;



public class CropFactoryTest {

    @Test
    public void createCrop(){
        CropFactory cropFactory = new CropFactory();
        List<Produce> cornresult = cropFactory.makeProduce(1,"EarCorn");
        List<Produce> tomatoresult = cropFactory.makeProduce(1,"Tomato");
        //List<Produce> expectedresult = {EarCorn};
        //having trouble with expression expected error message when trying to assert content of array list
       // Assert.assertTrue(listToString.contains("EarCorn");


    }



}
