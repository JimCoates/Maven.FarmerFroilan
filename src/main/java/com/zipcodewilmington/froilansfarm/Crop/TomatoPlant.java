package com.zipcodewilmington.froilansfarm.Crop;

public class TomatoPlant extends Crop {

    private boolean hasBeenFertilized = false;

    @Override
    public Tomato yield() {
        return new Tomato();
    }


}


