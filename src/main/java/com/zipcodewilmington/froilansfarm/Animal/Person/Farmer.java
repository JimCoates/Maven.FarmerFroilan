package com.zipcodewilmington.froilansfarm.Animal.Person;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;

public class Farmer extends Person implements Botanist {

Farm farm;

    public Farmer(Farm farm) {
        this.farm = farm;
    }

    @Override
    public void plant(Crop crop, CropRow cropRow) {

    }
}
