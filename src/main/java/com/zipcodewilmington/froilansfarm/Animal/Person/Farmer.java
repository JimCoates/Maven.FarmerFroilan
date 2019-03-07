package com.zipcodewilmington.froilansfarm.Animal.Person;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Utils.Rideable;

public class Farmer extends Person implements Botanist,Rider {

Farm farm;

    public Farmer(Farm farm) {
        this.farm = farm;
    }

    @Override
    public void plant(Crop crop, CropRow cropRow) {

    }

    @Override
    public void mount(Rideable object) {

    }

    @Override
    public void dismount(Rideable object) {

    }
}
