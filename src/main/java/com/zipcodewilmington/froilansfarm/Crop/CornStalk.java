package com.zipcodewilmington.froilansfarm.Crop;

public class CornStalk extends Crop {


    private boolean hasBeenFertilized = false;


    @Override
    public EarCorn yield() {
        return new EarCorn();
    }

}


