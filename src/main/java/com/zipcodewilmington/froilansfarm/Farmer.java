package com.zipcodewilmington.froilansfarm;

public class Farmer extends Person implements Botanist {

Farm farm;

    public Farmer(Farm farm) {
        this.farm = farm;
    }

    @Override
    public void plant(Crop crop, CropRow cropRow) {

    }
}
