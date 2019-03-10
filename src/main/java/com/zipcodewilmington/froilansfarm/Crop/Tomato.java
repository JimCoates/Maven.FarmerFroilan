package com.zipcodewilmington.froilansfarm.Crop;

public class Tomato implements Edible, Produce{

    boolean hasBeenFertilized;

    public Tomato() {
        this.hasBeenFertilized = false;
    }

    public void fertilize(){
       this.hasBeenFertilized = true;
    }

    public boolean isFertilized() {
        return this.hasBeenFertilized;
    }

    @Override
    public Edible yield() {
        return null;
    }
}
