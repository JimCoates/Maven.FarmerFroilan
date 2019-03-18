package com.zipcodewilmington.froilansfarm.Crop;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public  class Crop implements Produce {

    private boolean hasBeenFertilized = false;

    public Crop() {
    }

    public static Crop createCrop() {
        return new Crop();
    }

    public <T extends Edible> T yield() {
        return null;
    }

    public void fertilizePlant(){
        this.hasBeenFertilized = true;
    }

    public boolean isFertilized(){
        return this.hasBeenFertilized;
    }

    public <T extends Edible> T harvest() {
        if (hasBeenFertilized) {
            return yield();
        } else {
            System.out.println("You cannot harvest a plant that has not been fertilized");
        }
        return null;
    }


}
