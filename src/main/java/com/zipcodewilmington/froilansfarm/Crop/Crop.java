package com.zipcodewilmington.froilansfarm.Crop;

public  class Crop implements Produce {

    private boolean hasBeenFertilized = false;

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
